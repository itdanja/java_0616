package day08;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	/* 통신 구조 
	
		[클라이언트]					[서버]
	
			소켓 --연결요청(connect)-->  서버소켓 
				<-------연결승인-----( accept )
					
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	// 서버 구성 
		try {
		// 1. 서버소켓 만들기[ ServerSocket 클래스를 이용한 서버소켓 객체 생성 ] 
			ServerSocket serverSocket = new ServerSocket(); // *무조건 예외처리 발생 
		// 2. 서버소켓 설정 [ 바인딩 => ip , port 할당] : 접속 경로 만들기 
			serverSocket.bind( new InetSocketAddress("localhost",5001) );
				// .bind( InetSocketAddress( "ip주소" , port ) )
					// ip : 인터넷 주소 // port : ip 접속하는 연겨 단자 통로
				// *무조건 예외처리 발생 
		// 3. 클라이언 접속 요청대기
			while( true ) { // 무한루프 
				// 4. 요청 수락 [ 
				Socket socket = serverSocket.accept();
					// .accept() : 연결수락 
						// 연결 수락된 소켓을 소켓에 담기 
				// 5. 연결된 소켓 불러오기[확인]
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[[ 연결 수락 ]] : " + socketAddress.getHostName() );
				// 6. 데이터 수신하기[ 받기 ]
						byte[] 바이트배열 = new byte[100]; // 바이트 저장 배열 
						// 입력 스트림 [ 통신단위 => 바이트 ]
						InputStream 받기 = socket.getInputStream(); 
						// 스트림에서 바이트 가져오기
						받기.read(바이트배열);
						// 바이트 => 문자열 변환
						String 메시지 = new String(바이트배열);
						System.out.println("[[클라이언트 메시지 받기 성공  : " + 메시지 );
				// 7. 데이터 송신하기[ 보내기 ]
						System.out.print("[[클라이언트에게 보낼 메시지 입력 : ");
						메시지 = scanner.nextLine();
						OutputStream 보내기 = socket.getOutputStream();
						보내기.write(메시지.getBytes());
						System.out.println("[[메시지 전송 성공]]");
			}
		}
		catch (Exception e) {}
	}
}
