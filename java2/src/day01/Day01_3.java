package day01;

import java.util.Scanner;

public class Day01_3 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Thread thread = null;
		
		while( true ) {
			System.out.println("1.영화 2.음악 3.채팅 4.종료");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) { 
				thread = new 영화();
				thread.start();
			}
			if( 선택 == 2 ) {
				thread = new 음악();
				thread.start();
			}
			if( 선택 == 3 ) { 
				thread = new 채팅();
				thread.start();
			}
			if( 선택 == 4 ) {  System.out.println("종료"); break; }
		}
		
	}
	
}
