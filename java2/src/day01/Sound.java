package day01;

import java.awt.Toolkit;

public class Sound implements Runnable {

	// 인터페이스 : implements
		// 추상메소드 : 선언o정의x
		// 연결된 클래스에서 추상메소드를 정의 [ 오버라이딩 ]
		// 여러개 인터페이스 연결 가능 
	@Override
	public void run() { // 멀티스레드 시작메소드 

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // 비프음 소리 	
			try { // try{ 예외 예상되는코드 }
				Thread.sleep(1000); // 1초동안 스레드 일시정지
			}catch (Exception e) {}
		}
	}
	
	
	
	
}
