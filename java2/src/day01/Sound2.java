package day01;

import java.awt.Toolkit;

public class Sound2 extends Thread {
	// ��� : extends
		// ��� : �ϳ��� Ŭ�������� ��ӹ���
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // ������ �Ҹ� 	
			try { // try{ ���� ����Ǵ��ڵ� }
				Thread.sleep(1000); // 1�ʵ��� ������ �Ͻ�����
			}catch (Exception e) {}
		}
	}
	
}
