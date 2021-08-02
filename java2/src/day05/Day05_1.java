package day05;

public class Day05_1 {
	
	public static void main(String[] args) {
		
		
		/*
		 String 클래스 : 바이트열 => 문자열 변환 클래스 
			 *메소드
			 	1. 문자 추출 [ charAt() ] 
				2. 문자열 비교 [ equals() ] 
				3. 문자열 => 바이트 [ getBytes() ]
				4. 문자 찾기 [ indexOf() ]
				5. 문자열 길이 [ length() ] 반환 : 글자수
				6. 문자열 잘라내기 [ substring() ] 
				7. 문자열 분해 [ split() ]
				8. 문자열 치환 [ replace() ]
				9. 대소문자 변환 [ toLowerCase() : 소문자변환  / toUpperCase() : 대문자변환 ] 
				10. 문자열 앞뒤 공백 제거 [ trim() ]
				11. 문자열로 변환 [ valueOf() ] 
		*/
		
		// 5. 문자열 길이 [ length() ] 반환 : 글자수
		String 문자열 = "자바 프로그래밍";
		System.out.println("문자열 글자수 : "+문자열.length() );
		
			// 유효성검사 
			String 주민등록번호 = "880420-2554114";
			System.out.println("주민등록번호 글자수 : " + 주민등록번호.length() );
			
			if( 주민등록번호.length() == 14 ) { System.out.println("주민등록번호가 글자수가 맞습니다 ");}
			else {System.out.println("주민등록번호의 글자수가 다릅니다 ");}
		
		// 6. 문자열 잘라내기 [ substring() ] : 인덱스기준[위치] 으로 문자열 자르기 
			System.out.println( 주민등록번호.substring(7) ); // 7번 인덱스부터 뒤로 출력 
			System.out.println( 주민등록번호.substring(0,6)); // 0 ~ 5 까지 출력 
			
		// 7. 문자열 분해 [ split() ]  : 문자기준 으로 문자열 자르기 => 반환 : 배열 
			String[] 분해배열 = 주민등록번호.split("-"); // "-" 문자 기준으로 분해 [ String 2개 => 배열저장 ] 
			System.out.println( 분해배열[0] );
			System.out.println( 분해배열[1] );
			
		// 8. 문자열 치환 [ replace() ] : 교체할문자 , 새로운문자 
			String 문자열2 ="자바 프로그래밍";
			String 교체문자 = 문자열2.replace("자바", "java");
			System.out.println( "문자열 원본 : " + 문자열2 );
			System.out.println( "문자열 교체후 : " + 교체문자 );
		
		// 9. 대소문자 변환 [ toLowerCase() : 소문자변환  / toUpperCase() : 대문자변환 ] 
			String 문자열3 = "Java Programming";
			System.out.println(" 소문자로 변환 : " + 문자열3.toLowerCase() );
			System.out.println(" 대문자로 변환 : " + 문자열3.toUpperCase() );
			
		// 10. 문자열 앞뒤 공백 제거 [ trim() ] :
			String 문자열4 = "         자바          프로그래밍      ";
			System.out.println(" 앞뒤 공백제거 : " + 문자열4.trim() );
			
		// 11. 문자열로 변환 [ valueOf() ] 
			int 정수 = 10; 		String 문자열5 = String.valueOf(정수);
			System.out.println( " 정수 ---> 문자열  변환 후 : " + 문자열5);
			
			double 실수 = 10.5;	String 문자열6 = String.valueOf(실수);
			System.out.println( " 실수 ---> 문자열  변환 후 : " + 문자열6 );
			
			boolean 논리 = true;	String 문자열7 = String.valueOf(논리);
			System.out.println( " 논리 ---> 문자열  변환 후 : " + 문자열7 );
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
