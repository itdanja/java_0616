package day01;

public class ��Ƽ������ extends Thread {

	
	@Override
	public void run() {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println( this.getName() + " ���� " );

	}
	
}
