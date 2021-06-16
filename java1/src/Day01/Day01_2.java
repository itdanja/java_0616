package Day01;

public class Day01_2 { // c s
	
	
	public static void main(String[] args) { // m s
		
		
		// 출력 
		System.out.println(10); // 숫자는  " " 처리 x 
		System.out.println(true); // 논리 " " 처리 x 
		System.out.println("java"); 
			// 키워드[ 미리 만들어진 단어 ]을 제외한 단어들은 " " 처리 O
		
		// 제어문자  => 원화기호 \
		System.out.print("안녕\njava\n입니다\n");
		System.out.print("안녕\tjava\t입니다\t");
		System.out.print("안녕\tjava\r입니다\n");
			// 제어문자 
				// 1. \n : 줄바꿈
				// 2. \t : 들여쓰기[tab]
				// 3. \r : 캐리지리턴 [ 맨 앞으로 이동 ] 
		// 형식문자 
		System.out.printf( "현재 %d 입니다\n" , 10  );
			System.out.println("현재 " + 10 + " 입니다");
							// + 연결 연산자 [ 문자열 + 문자열 // 숫자 + 문자열 ]
							// + 더하기 연산자 [ 숫자 + 숫자 ]
		System.out.printf( "현재 %s 입니다\n" , "java");
		System.out.printf( "현재 %f 입니다\n" , 10.5);
		System.out.printf( "현재 %c 입니다\n" , 'A' );
			// 형식문자 [ 형식 format => 모양 꾸미기 ]
				// 1. %d : 정수
				// 2. %f : 실수 [ 소수점 ]
				// 3. %s : 문자열
				// 4. %c : 문자
	
		// 예제1 ) 출석부 출력 [ print ] 
		System.out.print("================출석부===============\n");
		System.out.print("이름\t1교시\t2교시\t3교시\t비고\n");
		System.out.print("유재석\t출석\t결석\t출석\t공란\n");
		System.out.print("강호동\t출석\t결석\t결석\t공란\n");
		System.out.print("===================================\n");
		
		// 문제1 ) 예제1과 동일하게 출력 [ printf ]
		System.out.printf("================%s===============\n" , "출석부");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n" , "이름" , "1교시" , "2교시" , "3교시" , "비고");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n" , "유재석" , "출석" , "결석" , "출석" , "공란");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n" , "강호동" , "출석" , "결석" , "결석" , "공란");
		System.out.printf("===================================\n");
		
		// 문제2 ) ★ 출력
		/*
					★
		           ★★★
				  ★★★★★
				 ★★★★★★★ 
			   ★★★★★★★★★★★
		   ★★★★★★★★★★★★★★★★★★
			  ★★★★★★★★★★★★★
			    ★★★★★★★★★
			     ★★★★★★★
			     ★★★ ★★★
		        ★★★   ★★★
		       ★★		★★
		      ★		   	  ★
		      
		 */
		      
		
	} // m e
	

}// c e 
