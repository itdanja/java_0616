package day01;

public class ��ȭ extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("[[��ȭ������]]");
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
	}
}