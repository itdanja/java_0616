package day01;

public class Day01_2 {
	
	
	// 3개의 스레드를 실행하여 3개의 출력을 동시에 출력하기 
	// 강아리소리 출력 [ 10번 출력 : 1초간격으로 ]
	// 고양이소리 출력 [ 10번 출력 : 1초간격으로 ]
	// 호랑이소리 출력 [ 10번 출력 : 1초간격으로 ] 
	public static void main(String[] args) {
		// main 스레드 
		
		Thread 강아지소리 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ;i<10 ; i++ ) {
					System.out.println("강아지소리" + i);
					try { // 예외처리 
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread 고양이소리 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for( int i = 0 ;i<10 ; i++ ) {
					System.out.println("고양이소리" + i);
					try { // 예외처리 
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				
			}
		});
		
		Thread 호랑이소리 = new Thread(  new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ;i<10 ; i++ ) {
					System.out.println("호랑이소리" + i);
					try { // 예외처리 
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				
			}
		});
	
		강아지소리.start(); // run메소드 호출 
		고양이소리.start();
		호랑이소리.start();

	}

}
