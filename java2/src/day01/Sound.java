package day01;

import java.awt.Toolkit;

public class Sound implements Runnable {

	// �������̽� : implements
		// �߻�޼ҵ� : ����o����x
		// ����� Ŭ�������� �߻�޼ҵ带 ���� [ �������̵� ]
		// ������ �������̽� ���� ���� 
	@Override
	public void run() { // ��Ƽ������ ���۸޼ҵ� 

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // ������ �Ҹ� 	
			try { // try{ ���� ����Ǵ��ڵ� }
				Thread.sleep(1000); // 1�ʵ��� ������ �Ͻ�����
			}catch (Exception e) {}
		}
	}
	
	
	
	
}
