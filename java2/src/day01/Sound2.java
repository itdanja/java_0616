package day01;

import java.awt.Toolkit;

public class Sound2 extends Thread {
	// 상속 : extends
		// 상속 : 하나의 클래스부터 상속받음
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // 비프음 소리 	
			try { // try{ 예외 예상되는코드 }
				Thread.sleep(1000); // 1초동안 스레드 일시정지
			}catch (Exception e) {}
		}
	}
	
}
