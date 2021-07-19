package day01;

public class Day01_5 {

	
	public static void main(String[] args) {
		
		for( int i = 0 ; i<10 ;i++ ) {
			
			Thread thread = new 멀티스레드(  );
			
			if( i==9 ) {
				thread.setPriority( thread.MAX_PRIORITY );
			}else {
				thread.setPriority( thread.MIN_PRIORITY );
			}
			thread.start();
			
		}
		
	}
	
}
