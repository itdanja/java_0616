package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
		// ������ ���� Ŭ���̾�Ʈ�� ��ü 
	
	// 1. ���� 
	Socket socket;
	// 2. ������ 
	public Client( Socket socket ) {
		this.socket = socket;
		receive(); // ��ü ����� ���ÿ� ����
	}
	// 3. �޽��� �޴� �޼ҵ� [ ���ѷ��� ] 
	public void receive() {
		// ��Ƽ������ 
		Runnable runnable = new Runnable() {
			@Override // run�޼ҵ� : ��Ƽ�������� ���ൿ��
			public void run() {
				try {
					while( true ) {
						InputStream inputStream = socket.getInputStream(); // ���� �Է½�Ʈ��
						byte[] buffer = new byte[1000]; // ����Ʈ �迭 ����
						inputStream.read(buffer); // �Է½�Ʈ���� �о�ͼ� ����Ʈ�迭�� ��� 
						
						String msg = new String( buffer ); // ����Ʈ => ���ڿ�
						
						// ������ ���� �޽����� ���ӵ� ��� Ŭ���̾�Ʈ���� ����
						for( Client client : ServerController.clients ) {
							client.send(msg);
						}
					}
				}catch (Exception e) {}
			}
		};// runnable end
		// ������Ǯ�� ���
		ServerController.threadpool.submit(runnable);	
	}
	
	// 4. �޽��� ������ �޼ҵ� 
	public void send( String msg ) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				try {
					OutputStream outputStream = socket.getOutputStream();// ��� ��Ʈ��
					byte[] buffer = msg.getBytes(); // ���� �޽����� ����Ʈ ��ȯ
					outputStream.write(buffer); // ���� �޽����� ��������
					outputStream.flush(); // ���� �ʱ�ȭ 
				}catch (Exception e) {}
			}
		}; // runnable end 
		
		// ������Ǯ�� �߰� 
		ServerController.threadpool.submit(runnable);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
