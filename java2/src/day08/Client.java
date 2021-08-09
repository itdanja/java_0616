package day08;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	// 클라이언트 : 서버와 연결하여 통신 
		// TCP/IP 
			// TCP : Transmission Control Protocol
			// IP : Internet Protocol
		// TCP/IP Socket : 데이터 통신
			// Socket : 프로그램내에서 네트워크를 통신할수 있도록 연결해주는 연결부 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		// 클라인트 구성 
			while( true) {
		// 1. 클라이언 소켓 만들기
				Socket socket = new Socket();
		// 2. 서버소켓 연결하기[접속]
				socket.connect( new InetSocketAddress("localhost",5001));
				System.out.println("[[연결 성공]]");
				
		// 3. 데이터 송신하기 [ 보내기 ]
				System.out.print("[[ 서버로 보낼 메시지 입력 : ");
				String 메시지 = scanner.nextLine();
				// 출력 스트림 [ 통신단위 => 바이트 ] 
				OutputStream 보내기 = socket.getOutputStream();
				// 전송 [ 문자열=>바이트 변환 ]
				보내기.write( 메시지.getBytes() );
				System.out.println("[[메시지 전송 성공]]");
				
			// 4. 데이터 수신하기 [ 받기 ]]
				byte[] 바이트배열 = new byte[100];
				InputStream 받기 = socket.getInputStream();
				받기.read( 바이트배열 );
				// 바이트 => 문자열 변환 
				메시지 = new String(바이트배열);
				System.out.println("[[서버에게 메시지 받기 성공 : "+메시지);
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}
