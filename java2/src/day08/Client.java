package day08;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	// Ŭ���̾�Ʈ : ������ �����Ͽ� ��� 
		// TCP/IP 
			// TCP : Transmission Control Protocol
			// IP : Internet Protocol
		// TCP/IP Socket : ������ ���
			// Socket : ���α׷������� ��Ʈ��ũ�� ����Ҽ� �ֵ��� �������ִ� ����� 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		// Ŭ����Ʈ ���� 
			while( true) {
		// 1. Ŭ���̾� ���� �����
				Socket socket = new Socket();
		// 2. �������� �����ϱ�[����]
				socket.connect( new InetSocketAddress("localhost",5001));
				System.out.println("[[���� ����]]");
				
		// 3. ������ �۽��ϱ� [ ������ ]
				System.out.print("[[ ������ ���� �޽��� �Է� : ");
				String �޽��� = scanner.nextLine();
				// ��� ��Ʈ�� [ ��Ŵ��� => ����Ʈ ] 
				OutputStream ������ = socket.getOutputStream();
				// ���� [ ���ڿ�=>����Ʈ ��ȯ ]
				������.write( �޽���.getBytes() );
				System.out.println("[[�޽��� ���� ����]]");
				
			// 4. ������ �����ϱ� [ �ޱ� ]]
				byte[] ����Ʈ�迭 = new byte[100];
				InputStream �ޱ� = socket.getInputStream();
				�ޱ�.read( ����Ʈ�迭 );
				// ����Ʈ => ���ڿ� ��ȯ 
				�޽��� = new String(����Ʈ�迭);
				System.out.println("[[�������� �޽��� �ޱ� ���� : "+�޽���);
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}
