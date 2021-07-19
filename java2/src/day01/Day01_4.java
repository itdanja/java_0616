package day01;

public class Day01_4 {


	public static void main(String[] args) {
		
		Thread thread1 = new Thread( new Runnable() {	
			@Override
			public void run() {		
				for( int i =0; i<10 ;i++) {
						
					Thread thread2 = new Thread( new Runnable() {
						@Override
						public void run() {
							System.out.println( "실행중2" );
						}
					} );
					thread2.start();
					System.out.println("실행중1");
				}
			}
		});
		thread1.start();
		
		
	}
}

