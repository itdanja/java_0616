package day01;

public class Day01_2 {
	
	
	// 3���� �����带 �����Ͽ� 3���� ����� ���ÿ� ����ϱ� 
	// ���Ƹ��Ҹ� ��� [ 10�� ��� : 1�ʰ������� ]
	// ����̼Ҹ� ��� [ 10�� ��� : 1�ʰ������� ]
	// ȣ���̼Ҹ� ��� [ 10�� ��� : 1�ʰ������� ] 
	public static void main(String[] args) {
		// main ������ 
		
		Thread �������Ҹ� = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ;i<10 ; i++ ) {
					System.out.println("�������Ҹ�" + i);
					try { // ����ó�� 
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread ����̼Ҹ� = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for( int i = 0 ;i<10 ; i++ ) {
					System.out.println("����̼Ҹ�" + i);
					try { // ����ó�� 
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				
			}
		});
		
		Thread ȣ���̼Ҹ� = new Thread(  new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ;i<10 ; i++ ) {
					System.out.println("ȣ���̼Ҹ�" + i);
					try { // ����ó�� 
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				
			}
		});
	
		�������Ҹ�.start(); // run�޼ҵ� ȣ�� 
		����̼Ҹ�.start();
		ȣ���̼Ҹ�.start();

	}

}
