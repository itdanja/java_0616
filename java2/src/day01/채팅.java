package day01;

public class ä�� extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("[[ä�ý�����]]");
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
	}
}
