package day01;

import java.awt.Toolkit;

public class Day01_1 {
	
	// ������ : ���μ����� ����Ǵ� �帧�� ����
		// ���μ���[���α׷�] : ��ɾ�[�ڵ�] ����
		// java������ main�޼ҵ忡 main������ �⺻������ ���ԵǾ� ���� 
		// 1. ������ �������̽�[ Ŭ�����κ��� �޸��Ҵ� �ʿ� ] 
			// implements Runnable
		// 2. ������ Ŭ���� 
			// extends Thread
	
		// 3. Thread thread3 = new Thread( new Runnable() );
	
		// 4. start() : ������ ȣ�� 
			// run() : ����������ڵ� ���� 
	
		// * ��Ƽ������ : �ڵ� �����۾� 
			// ��ǻ�� [ �����۾�x ] : �ϳ��� ó�� 
				// cpu[�����ٸ�] : �ڵ� ó�� ����		
	
		// ������ �켱���� 
			// thread.MAX_PRIORITY : �켱 ���� 
			// thread.MIN_PRIORITY : �켱 ���� 
		
		// �ΰ� 
			// .getName() : ������ �̸� 
	
	public static void main(String[] args) {
		
		//��1) ���� ������ 
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // ������ �Ҹ� 	
			try { // try{ ���� ����Ǵ��ڵ� }
				Thread.sleep(1000); // 1�ʵ��� ������ �Ͻ�����
			}catch (Exception e) {}
		}
		
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		System.out.println("-------- ����1 �� ");
		
		// ��2) ��Ƽ ������ [ ������ �������̽� : Runnable ] 
		Runnable runnable = new Sound();	// �������������̽��� Ŭ�������� 
		Thread thread = new Thread( runnable ); // ������ Ŭ������ �������������̽� 
		
		thread.start(); // start() --> �ش� �������� run() ȣ�� 
						// ��Ƽ������ ���� main������ ���� 
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("��2");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		System.out.println("-------- ����2 �� ");
		
		// ��3) ��Ƽ ������ [ ������ Ŭ���� : Thread ]
		Thread thread2 = new Sound2();	// ������ Ŭ���� ��ü ���� 
		
		thread2.run();
		
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("��3");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		
		System.out.println("-------- ����3 �� ");
		
		
		//��4) Runnable[ �������̽� ] 
		Thread thread3 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++) {
					toolkit.beep(); // ������ �Ҹ� 	
					try { // try{ ���� ����Ǵ��ڵ� }
						Thread.sleep(1000); // 1�ʵ��� ������ �Ͻ�����
					}catch (Exception e) {}
				}
			}
		} );
		
		thread3.start();
		
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("��4");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		
		System.out.println("-------- ����4 �� ");
		
		
		
		
		
		
		
		
	}
			
}
