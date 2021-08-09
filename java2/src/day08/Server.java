package day08;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	/* ��� ���� 
	
		[Ŭ���̾�Ʈ]					[����]
	
			���� --�����û(connect)-->  �������� 
				<-------�������-----( accept )
					
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	// ���� ���� 
		try {
		// 1. �������� �����[ ServerSocket Ŭ������ �̿��� �������� ��ü ���� ] 
			ServerSocket serverSocket = new ServerSocket(); // *������ ����ó�� �߻� 
		// 2. �������� ���� [ ���ε� => ip , port �Ҵ�] : ���� ��� ����� 
			serverSocket.bind( new InetSocketAddress("localhost",5001) );
				// .bind( InetSocketAddress( "ip�ּ�" , port ) )
					// ip : ���ͳ� �ּ� // port : ip �����ϴ� ���� ���� ���
				// *������ ����ó�� �߻� 
		// 3. Ŭ���̾� ���� ��û���
			while( true ) { // ���ѷ��� 
				// 4. ��û ���� [ 
				Socket socket = serverSocket.accept();
					// .accept() : ������� 
						// ���� ������ ������ ���Ͽ� ��� 
				// 5. ����� ���� �ҷ�����[Ȯ��]
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[[ ���� ���� ]] : " + socketAddress.getHostName() );
				// 6. ������ �����ϱ�[ �ޱ� ]
						byte[] ����Ʈ�迭 = new byte[100]; // ����Ʈ ���� �迭 
						// �Է� ��Ʈ�� [ ��Ŵ��� => ����Ʈ ]
						InputStream �ޱ� = socket.getInputStream(); 
						// ��Ʈ������ ����Ʈ ��������
						�ޱ�.read(����Ʈ�迭);
						// ����Ʈ => ���ڿ� ��ȯ
						String �޽��� = new String(����Ʈ�迭);
						System.out.println("[[Ŭ���̾�Ʈ �޽��� �ޱ� ����  : " + �޽��� );
				// 7. ������ �۽��ϱ�[ ������ ]
						System.out.print("[[Ŭ���̾�Ʈ���� ���� �޽��� �Է� : ");
						�޽��� = scanner.nextLine();
						OutputStream ������ = socket.getOutputStream();
						������.write(�޽���.getBytes());
						System.out.println("[[�޽��� ���� ����]]");
			}
		}
		catch (Exception e) {}
	}
}
