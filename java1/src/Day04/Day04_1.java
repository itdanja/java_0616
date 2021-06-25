package Day04;

import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
		
		// 문제 : 369 게임 출력 
			// 1. 하나의 정수를 입력받아 해당 정수까지의 숫자 출력 
			// 2. 출력시 3 혹은 6 혹은 9 가 포함되어 있으면 숫자 => 박수 출력 
			// 3. 예)   3->박수	13->박수		33 ->박수박수
		
		// 1. 입력받기=> Scanner 클래스 
		Scanner scanner = new Scanner(System.in); // 입력 객체 
		
		// 2. 입력객체에서 입력받은 값 가져오기 .next()
		System.out.print("하나의 정수 입력 : "); int 정수 = scanner.nextInt();
		
		// 3. 무한루프 [ 입력한 수까지 반복하기 ]
			int i = 1; // 시작번호 : 1
	
		while(true) { // 무한루프
			int j = i/10; //10의자리 판단 변수 
			// 1의 자리 박수 = i
			// 나누기 10 했을때 나머지값이 3 혹은 6 혹은 9 이면 
			if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9   ) {
				
				System.out.print("박수");
				
				// 10의 자리 박수 
				if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9 ) {
					System.out.print("박수");
				}
			}
			// 10의 자리 박수 = j
			else if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9 ) {
				System.out.print("박수");
			}
			else {
				System.out.print( i ); // i는 출력 
			}
			
			System.out.println(); // 줄바꿈
	
			i++; // i = i+1;  // i += 1 ; // i 1씩증가
			// i가 1씩증가하면서 입력한 정수보다 커지면 반복문 종료
			if( 정수 < i ) break; // break; 반복문 종료 
			
		}
		
		
		
		
		
		
		
		
	} // main end
} // class end
