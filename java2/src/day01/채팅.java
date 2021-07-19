package day01;

public class 채팅 extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("[[채팅실행중]]");
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
	}
}
