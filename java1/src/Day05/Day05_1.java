package Day05;

import java.util.Scanner;

public class Day05_1 {
	
	// 1. Day01 : 출력 
	// 2. Day02 : 입력 , 변수 
	// 3. Day03 : 제어문 if
	// 4. Day04 : 반복문 for 
	
	public static void main(String[] args) {
	
		// if / switch 차이점 
			// if : T / F 	=> 논리 검사 
				// 경우의수가 정해져 있지 않는 경우
		int 정수 = 10;
		if( 정수 > 5 ) System.out.println("정수는 5보다 크다 ");
		else System.out.println("정수는 5보다 작다");
///////////////////////////////////////////////////////////////////////			
			// switch : 값 => 경우에따른 검사 [ 논리x ]
				// 경우의수가 정해져 있는 경우 
				// 값을 찾을경우 아래의 모든 case 실행 
					// break; switch 나가기 
		switch( 정수 ) {
			case 10 : {
				System.out.println("정수는 10이다");
				break;
			}
			case 5 : {
				System.out.println("정수는 5이다");
				break;
			}
			default : {
				System.out.println("그외");
			}
		}
///////////////////////////////////////////////////////////////////////		
		Scanner scanner = new Scanner( System.in );
		System.out.print("점수1 입력: "); int 점수1 = scanner.nextInt();
		System.out.print("점수2 입력: "); int 점수2 = scanner.nextInt();
		System.out.print("점수3 입력: "); int 점수3 = scanner.nextInt();
		int 평균 = (점수1+점수2+점수3) / 3; 
		
		switch( 평균/10 ) {
		// switch( 검사대상 ) 
			case 10: 
			case 9 : 
				System.out.println("A등급"); break;
			case 8 :
				System.out.println("B등급"); break;
			case 7 :
				System.out.println("C등급"); break;
			default :
				System.out.println("탈락");
		}
///////////////////////////////////////////////////////////////////////		
		
		// for / while 차이점
		
			// for( 초기값 ; 조건문 ; 증감식 ) { 실행코드 }
				// 조건에 따른 반복문 
		
			/*
			 	초기값 
			   	while( 조건문 ) {
			   		증감식
				}
			*/ 
				// 무한루프 
		
		// while : 1~50까지 누적합계
		int 누적합계 = 0 ; 
		for( int i = 0 ; i<=50 ; i++ ) { 누적합계+= i; }
		System.out.println("결과 : " + 누적합계);
		
		int 누적합계2 = 0 ;
		int i = 0;	// 1. 초기값 
		while( i<=50 ) { // 2. 조건문 
			누적합계2 += i;
			i++; // 3. 증감식 
		}
		System.out.println("결과 : " + 누적합계2);
///////////////////////////////////////////////////////////////////////		
		// while : 1~100까지의 3배수의 누적합계
			int 누적합계3 = 0;
			for( int j = 0 ; j<=100 ; j += 3) { 누적합계3+= j ; }
			System.out.println("결과 : "+누적합계3);
		
			int 누적합계4 = 0;
			int j = 0; // 1. 초기값 
			while( j <= 100 ) { // 2. 조건문 
				누적합계4 += j; 
				j += 3;  // 3. 증감식
			}
			System.out.println("결과 : "+누적합계4);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
 