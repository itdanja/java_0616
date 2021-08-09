package day08;

import java.net.InetAddress;

public class Day08_1 {
	
	// ��Ʈ��ũ ���� : ��Ÿ�[ ���ͳ� ] 
		// 1. ��Ʈ��ũ = ���ͳ� [ pc ------ pc ]
	
		// 2. IP = ���ͳ� �ּ� = ���ּ�
			// ������ : IP �ڵ��Ҵ�
			// IP : ���ͳ� ��������[ �Ծ� ] 
				// 128.0.192.2 => 4ĭ ���� [ . ���� ] 0~255 ���� ��
			// ipȮ�� : ���۹�ư => cmd[���������Ʈ] => ipconfig
			// java�ڵ�� ipȮ�� : InetAddress Ŭ���� �̿��� ip Ȯ�� 
	
		// 3. ������ �ּ� 
			// ���̹�ȸ�� ������ �������� => ���̹�ȸ�� ip => ������ ������Ʈ�� ip [X]
			// IP[����] ---> DNS[����]
			// ���̹�ȸ��IP ---> www.naver.com
			//   ��ǻ��				���
	
	public static void main(String[] args) {
		
		try {
			//����1 : ����pc�� ip
			InetAddress address = InetAddress.getLocalHost();
			// InetAddress : ���ͳ� ���� ���� �޼ҵ� ���� 
				// .getLocalHost() : ���� pc�� ������ �������� [ ����ó�� ������ �߻� ] 
			System.out.println( " ���� pc�� �̸� : " + address.getHostName() );
			System.out.println( " ���� pc�� ip�ּ� : " + address.getHostAddress() );
			
			//����2 : ���̹�pc�� ip
			InetAddress address2 = InetAddress.getByName("www.naver.com");
				// .getByName("�������ּ�") : �������� 1���� ip �ּ� 
			System.out.println(" ���� ���̹�pc�� �̸� : " + address2.getHostName() );
			System.out.println(" ���� ���̹�pc�� ip�ּ� : " + address2.getHostAddress() );
			
			System.out.println("-------------- ���̹��� ip 2�� ����� ------------- ");
			//����3 : ip�� �������� ��� 
			InetAddress[] addresses = InetAddress.getAllByName("www.naver.com");
				// .getAllByName("�������ּ�") : �������� ��� ip �ּ� 
			for( InetAddress address3 : addresses ) {
				System.out.println(" ���� ���̹�pc�� �̸� : " + address3.getHostName() );
				System.out.println(" ���� ���̹�pc�� ip�ּ� : " + address3.getHostAddress() );
			}
			//����4 : ������ ip
			InetAddress address3 = InetAddress.getByName("www.google.com");
			System.out.println(" ���� ����pc�� �̸� : "+ address3.getHostName() );
			System.out.println(" ���� ����pc�� ip�ּ� : " + address3.getHostAddress() );
			
		}
		catch (Exception e) {System.out.println("�ùٸ� ������ �����ϴ�");}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
