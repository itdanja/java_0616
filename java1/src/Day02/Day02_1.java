package Day02;

public class Day02_1 { // c s
	
	// 중요!! : java는 100%객체지향언어 => 100%클래스언어 
		// 1. 모든 코드는 클래스안에서 작성 
	// 중요!! : main 메소드 [ main 스레드(코드 읽어주는역할) ] 
		// 자동완성 : ctrl+스페이바 
	public static void main(String[] args) {

		// 변수 : 메모리 [ 데이터 저장소 ]
			// 사람 : 문자[ 한글,영어,일본어] 사용 
				// 1. 저장할 데이터의 크기 => 자료형
					// 자료형 : 메모리크기 증가 => 컴퓨터속도 감소
						// 메모리 효율적으로 적절하게 사용 
							// 예) 데이터 1~100 사이만 저장할 변수 => 작은 자료형 
					// 비트 : 1bit : 0 , 1 
						// 바이트 : 8bit : bit 8자리 
							// 킬로바이트 : 1024byte : 1kb
		
				// 2. 저장되는 상자의 이름 => 변수를 찾기위한 이름 
				// 3. 저장할 값 => 초기값 안넣을때 쓰레기값[임의의값]
					// 쓰레기값 <===> 공백[null]
		
			// 컴퓨터 : 숫자[기계어 : 0 , 1 ] 사용
				// 1. 메모리 크기 => 자료형
				// 2. 메모리 위치 => 변수의 주소값 
				// 3. 메모리 안에 넣을 값 => 값 
		
		// 변수 선언 
			// 자료형 변수이름;
			// 자료형 변수이름 = 값 ;
		int 변수1 ; 
			// 1. 1바이트 주소4개 생성 => 4바이트
			// 2. 주소에 값 저장 
		int 변수2 = 10;
		System.out.println( 변수2 );
		
		// 변수 값 변경 
		변수2 = 20; //변수 선언외에는 자료형 x
		System.out.println( 변수2 );
		
		// boolean[1비트] : true 혹은 false
		boolean 논리변수 = true; 	System.out.println("boolean : "+논리변수);
			//boolean 논리변수2 = 0;
		
		// char[2바이트] : 문자 하나 저장 [ 아스키코드 ] 
		char 문자변수 = 'a'; 		System.out.println("char : " + 문자변수 );
		char 문자변수2 = 97; 		System.out.println("char2 : " + 문자변수2);
					// char 아스키코드 사용 [ 97 --> 'a' ]
		
		// 정수형 
			// byte[1바이트] : +-120 정도 저장 가능 
		byte 바이트변수 = 100; 	System.out.println("byte : " + 바이트변수);
		byte 바이트변수2 = 'a';	System.out.println("byte : " + 바이트변수2);
					// a -> 정수형 => 97
			// short[2바이트] : +-3만 정도 저장 가능 
		short 쇼트변수 = 300;		System.out.println("short : " + 쇼트변수);
		short 쇼트변수2 = 'a';	System.out.println("short : " + 쇼트변수2 );
		
			// int[4바이트] : +-20억 정도 저장 가능 [ 정수의 기본자료형 ]
		int 인트변수 = 3000;		System.out.println("int : " + 인트변수 );
		int 인트변수2 = 'a';		System.out.println("int : " + 인트변수2);
			// long[8바이트] : +-20억 이상 저장 가능 [ 데이터 뒤에 L ]
		long 롱변수 = 999999999999999999L; System.out.println("long : " + 롱변수);
		
		// 실수형 
			// float[4바이트] : 소수점 6자리까지 표현 [ 데이터 뒤에 F ]
		float 실수변수 = 10.11111111111111111F; System.out.println("float : " + 실수변수);
			// double[8바이트] : 소수점 14자리까지 표현 [ 실수의 기본자료형 ] 
		double 실수변수2 = 10.111111111111111111111; System.out.println("double : "+실수변수2);

	
	}
	
	
} // c e 
