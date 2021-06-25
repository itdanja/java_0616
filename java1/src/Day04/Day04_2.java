package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	// 반복문 : for문 , while문 , do~while문
		// 초기값 : 반복의 시작값
		// 조건문 : 반복실행 조건[ 논리연산자 ]
		// 증감식 : 시작값의 증감 단위 
		// for( 초기값 ; 조건문 ; 증감식 ) {  실행문; }
	
	public static void main(String[] args) {
	
		// for문 
		for( int 변수 = 0 ; 변수<10 ; 변수++ ) {
			System.out.print( 변수 );
			// 반복문의 실행순서 
				// 1. 초기값 검사 => 조건문검사[T] => 코드 실행 
				// 2. 증감식 => 조건문검사[T] => 코드 실행 
				// 3. 증감식 => 조건문검사[T] => 코드 실행 
				// 	~~~~~~~~~~~~~~
				// 4. 증감식 => 조건문검사[F] => 종료 
		}
	System.out.println();
	
		// 예제1 : 1~50 까지 출력 
		for( int i = 1 ; i<=50 ; i++ ) { System.out.print(i);}
	System.out.println();
	
		// 예제2 : 1~50까지 3의 배수  출력 
		for( int i = 3 ; i<=50 ; i += 3 ) {System.out.print(i);}
			// 배수찾기 : 값 % 수 == 0 
				// 나머지가 0 이면 값은 그 수의 배수 
	System.out.println();
		for( int i = 1 ; i<=50 ; i++ ) { if( i % 3 == 0 )System.out.print(i); }
	System.out.println();
	
		// 예제3 : 1~50까지 누적합계
		int 누적합계 = 0 ;
		for( int i = 1 ; i<=50 ; i++ ) { 누적합계 += i; }
	System.out.println( "누적합계 : "+ 누적합계);
	
		// 예제4 : 1~50까지 3의 배수들의 누적합계
		int 배수합 = 0;
		for( int i = 1 ; i<=50 ; i++ ) { if( i % 3 ==0 ) 배수합+=i;  }
	System.out.println("3의배수의 합계 : "+배수합);
	
		// 예제5 : 2단 구구단 [ 단 : 2(상수)  곱 : 1~9(변수) ] 
		for( int 곱 = 1 ; 곱<10 ; 곱++ ) {
			System.out.println( " 2 X "+곱 +" = "+(2*곱) ); 
		}
		
			// for문 중첩 형태 
				// for1( ) {    for2(){}   for3(){}  }
				// 
		
		// 예제6 : 구구단 [ 단 : 2~9(변수)  곱 : 1~9(변수) ] : 실행횟수
						// 단 2 일경우  곱 : 1 ~ 9
						// 단 3 일경우  곱 : 1 ~ 9
						// 단 4 일경우  곱 : 1 ~ 9
		for( int 단 = 2 ; 단<=9 ; 단++ ) {
			System.out.println("현재 실행중인 구구단 : "+단 +"단 입니다 "); // 9번 실행 
			
			for( int 곱 = 1 ; 곱<=9 ; 곱++ ) {
				System.out.println( 단 +" X "+곱+" = " + (단*곱) ); // 72번 실행 
			}
		}
		
		// 입력객체 
		Scanner 입력객체 = new Scanner(System.in);
		
		// 문제1 : 입력한 개수만큼 별[*] 출력 
		System.out.print("별 개수 입력 : ");int 문제1 = 입력객체.nextInt();
		for( int i = 1 ; i<=문제1 ; i++ ) { System.out.print("*"); }
		System.out.println();
		
		// 문제2 : 입력한 개수만큼 별[*] 출력하면서 5개마다 줄바꿈
		System.out.print("별 개수 입력 : "); int 문제2 = 입력객체.nextInt();
		for( int i = 1 ; i<=문제2 ; i++ ){
			System.out.print("*");
			if( i % 5 == 0 ) System.out.println(); // i가 5의 배수마다 줄바꿈
		}
		System.out.println();
		
		// 문제3 : 입력한 줄 만큼 별 삼각형 출력  [ for문 중첩 : for1: 줄바꿈 for2:별출력 ] 
			/* 예)  6입력시 
			 * 					줄			별
			 		*			i=1			s = 1
			 		**			i=2			s = 1 2 
			 		***			i=3			s = 1 2 3 
			 		****		i=4			s = 1 2 3 4
			 		*****		i=5			s = 1 2 3 4 5
			 		******		i=6			s = 1 2 3 4 5 6 
			 					i<=입력값		s <= i
			 */
		// 풀이 
		System.out.print("[문제3]줄수 입력 : "); int 문제3 = 입력객체.nextInt();
		for( int i = 1 ; i<=문제3 ; i++ ) {
			
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*"); 
			}
			System.out.println(); // 줄바꿈
		}
		// 문제4 : 입력한 줄수 만큼 별[*] 출력 [ for중첩 ]
		/*					줄		별
		  		*****	i = 1		s = 1 2 3 4 5
		  		****	i = 2		s = 1 2 3 4
		  		***		i = 3 		s = 1 2 3
		  		**		i = 4		s = 1 2
		  		*		i = 5		s = 1
		  				i<=입력값		최대줄수[입력값] - 현재줄수[i] + 1
		 */
		// 풀이 
		System.out.print("[문제4]줄수 입력 : "); int 문제4 = 입력객체.nextInt();
		for( int i = 1 ; i<=문제4 ; i++ ) {
			// 별찍기
			for( int s = 1 ; s<=문제4-i+1 ; s++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}
		// 문제5 : for줄수() {    for()공백{}  for()별{}  }
		/*					i			b					s
		  			*		i = 1 		b = 1 2 3 4 		s = 1
		  		   **		i = 2		b = 1 2 3			s = 1 2
		  		  ***		i = 3		b = 1 2 			s = 1 2 3
		  		 ****		i = 4		b = 1				s = 1 2 3 4
		  		*****		i = 5		b = 				s = 1 2 3 4 5 
		  					i<=입력값		최대줄수[입력값]-현재줄수	s<=i
		 */
		// 풀이 
		System.out.print("[문제5]줄수 입력 : "); int 문제5 = 입력객체.nextInt();
		for( int i = 1 ; i<=문제5 ; i++ ) {
			
			// 공백찍기 
			for( int b = 1 ; b<=문제5-i ; b++ ) { System.out.print(" ");}
			// 별찍기 
			for( int s = 1 ; s<=i ; s++ ) {System.out.print("*");}
			// 줄바꿈
			System.out.println();
			
		}
		
		// 문제6 : for줄수() {    for()공백{}  for()별{}  }
		/*
		  		 *****
		  		  ****
		  		   ***
		  		    **
		  		     *		 		
		 */
		// 문제6 : for줄수() {    for()공백{}  for()별{}  }
		/*
		  			*
		  		   ***
		    	  *****
  			 	 *******
  			 	*********
		 */
		
		// 문제7 : for줄수() {    for()공백{}  for()별{}  }
		/*
		 			1
		 		   222
		 		  33333
		  		 4444444
		  		555555555
		  	   66666666666
		 */
		// 문제8 : for줄수() {    for()공백{}  for()별{}  }
		/*
		  	*********
		     *******
		      *****
		       ***
		        *
		 */
		// 문제9 : for줄수() {    for()공백{}  for()별{}  }
		/*
		  	 *     *
		  	  *   *
		       * *
		        *
		       * *
		      *   *
		     *     *
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
