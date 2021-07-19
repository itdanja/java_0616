package day01;

import java.awt.Toolkit;

public class Day01_1 {
	
	// 스레드 : 프로세스내 실행되는 흐름의 단위
		// 프로세스[프로그램] : 명령어[코드] 집합
		// java에서는 main메소드에 main스레드 기본적으로 포함되어 있음 
		// 1. 스레드 인터페이스[ 클래스로부터 메모리할당 필요 ] 
			// implements Runnable
		// 2. 스레드 클래스 
			// extends Thread
	
		// 3. Thread thread3 = new Thread( new Runnable() );
	
		// 4. start() : 스레드 호출 
			// run() : 스레드실행코드 정의 
	
		// * 멀티스레드 : 코드 병행작업 
			// 컴퓨터 [ 병행작업x ] : 하나씩 처리 
				// cpu[스케줄링] : 코드 처리 순서		
	
		// 스레드 우선순위 
			// thread.MAX_PRIORITY : 우선 증가 
			// thread.MIN_PRIORITY : 우선 감소 
		
		// 부가 
			// .getName() : 스레드 이름 
	
	public static void main(String[] args) {
		
		//예1) 단일 스레드 
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // 비프음 소리 	
			try { // try{ 예외 예상되는코드 }
				Thread.sleep(1000); // 1초동안 스레드 일시정지
			}catch (Exception e) {}
		}
		
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		System.out.println("-------- 예제1 끝 ");
		
		// 예2) 멀티 스레드 [ 스레드 인터페이스 : Runnable ] 
		Runnable runnable = new Sound();	// 스레드인터페이스에 클래스연결 
		Thread thread = new Thread( runnable ); // 스레드 클래스에 스레드인터페이스 
		
		thread.start(); // start() --> 해당 스레드의 run() 호출 
						// 멀티스레드 사용시 main스레드 별도 
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("띵2");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		System.out.println("-------- 예제2 끝 ");
		
		// 예3) 멀티 스레드 [ 스레드 클래스 : Thread ]
		Thread thread2 = new Sound2();	// 스레드 클래스 객체 선언 
		
		thread2.run();
		
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("띵3");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		
		System.out.println("-------- 예제3 끝 ");
		
		
		//예4) Runnable[ 인터페이스 ] 
		Thread thread3 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++) {
					toolkit.beep(); // 비프음 소리 	
					try { // try{ 예외 예상되는코드 }
						Thread.sleep(1000); // 1초동안 스레드 일시정지
					}catch (Exception e) {}
				}
			}
		} );
		
		thread3.start();
		
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("띵4");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {}
		}
		
		System.out.println("-------- 예제4 끝 ");
		
		
		
		
		
		
		
		
	}
			
}
