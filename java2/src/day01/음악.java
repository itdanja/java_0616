package day01;

public class ���� extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("[[���ǽ�����]]");
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
	}
}
