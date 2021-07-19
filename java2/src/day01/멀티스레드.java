package day01;

public class 멀티스레드 extends Thread {

	
	@Override
	public void run() {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println( this.getName() + " 시작 " );

	}
	
}
