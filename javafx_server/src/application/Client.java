package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
		// 서버로 들어온 클라이언트의 객체 [ 내부 클라이언트 ] 
	
	// 1. 소켓 
	Socket socket;
	// 2. 생성자 
	public Client( Socket socket ) {
		this.socket = socket;
		receive(); // 객체 선언과 동시에 실행
		
	}
	// 3. 서버가 메시지 받는 메소드 [ 무한루프 ] 
	public void receive() {
		// 멀티스레드 
		Runnable runnable = new Runnable() {
			@Override // run메소드 : 멀티스레드의 실행동작
			public void run() {
				try {
					while( true ) {
						InputStream inputStream = socket.getInputStream(); // 소켓 입력스트림
						byte[] bytes = new byte[1000]; // 바이트 배열 정의
						inputStream.read( bytes); // 입력스트림을 읽어와서 바이트배열에 담기 
						String msg = new String( bytes ); // 바이트 => 문자열
						
						// 서버가 받은 메시지를 접속된 모든 클라이언트에게 전달
						for( Client client : ServerController.clients ) {
							client.send(msg);
						}
						
					}
				}catch (Exception e) {System.out.println("[[ 오류 발생 ]]");}
			}
		};// runnable end
		// 스레드풀에 담기 [ 스레드풀 안에서 자동 관리 ( 자동시작 ) ] 
		ServerController.threadpool.submit(runnable);	
	}
	
	// 4. 서버가 메시지 보내는 메소드 
	public void send( String msg ) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();// 출력 스트림
					byte[] bytes = msg.getBytes(); // 받은 메시지를 바이트 변환
					outputStream.write(bytes); // 받은 메시지를 내보내기
					outputStream.flush(); // 버퍼 초기화 
				}catch (Exception e) { System.out.println("[[ 오류 발생 ]]"); }
			}
		}; // runnable end 
		
		// 스레드풀에 추가 
		ServerController.threadpool.submit(runnable);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
