package day01;

public class 영화 extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("[[영화실행중]]");
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
	}
}