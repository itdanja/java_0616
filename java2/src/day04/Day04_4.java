package day04;

import java.util.Scanner;

public class Day04_4 {

	public static void main(String[] args) {
		
		
		// String 클래스  : 문자열 관련 메소드 제공해주는 클래스 
			// 키보드 입력했을때 => 스트림 => 프로그램
				// 스트림[ 이동단위 : 바이트 ]
			// 영/특수문자 1문자 : 1바이트 // 한글1문자 : 2바이트
				// 아스키코드 기반 
			// String 클래스는 바이트열 => 문자열 변환 시켜주는 클래스 
			
			byte[] 바이트배열 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
							 // H ,   e ,    l ,   l ,  o , 공백 , J  , a ,  v , a
			String 문자열 = new String( 바이트배열 );
						// new 생성자( 바이트배열 ) 
			System.out.println(" 바이트 => 문자열 : " + 문자열 );
			
			////////////////////
			String 문자열2 = new String( 바이트배열 , 6 , 4 );
			System.out.println(" 바이트 => 문자열 : " + 문자열2 );
						// new 생성자( 바이트배열 , 시작위치 , 개수 ) 
			/////////////////////
			byte[] 바이트배열2 = new byte[100];
			
			System.out.println(" 입력 : ");
			try {
				
				System.in.read( 바이트배열2 ); // 입출력 무조건 예외발생
					// system.in : 입력장치 
						// read : 읽어오기 => 배열에 저장 
				String 문자열3 = new String( 바이트배열2 );
				System.out.println( "입력된 값은 : " + 문자열3 );
				
				///////////////////////
				Scanner scanner = new Scanner( System.in );
				String 문자열4 = scanner.next();
				
			}
			catch (Exception e) {
				// TODO: handle exception
			} 
		///////////////////////String 자주 사용되는 메소드 ///////////////////////
			
			// 1. 문자 추출 [ charAt ] 
					// 문자열에는 인덱스 존재 [ 첫번째 글자는 인덱스 0 ] 
				String 문자열5 = "자바 프로그래밍";
				System.out.println( 문자열5.charAt(0) );
				System.out.println( 문자열5.charAt(1) );
				System.out.println( 문자열5.charAt(2) );
				System.out.println( 문자열5.charAt(3) );
				
				String 주민등록번호 = "880420-1587452";
				char 남여 = 주민등록번호.charAt(7);
				
				switch( 남여 ) {
					case '1' :
					case '3' :
						System.out.println(" 남자 입니다 ");
						break;
					case '2' :
					case '4' :
						System.out.println(" 여자 입니다 ");
						break;
				}
			
			// 2. 문자열 비교 [ equals ] 
			
				String 이름1 = new String("유재석"); // 객체 생성 
							// new 생략 가능 
				String 이름2 = "유재석"; // "문자열" => 메모리
				
				// 문자열은 == 비교연산자를 사용할수 없다 
				if( 이름1 == 이름2 ) System.out.println(" 두명의 이름은 동일하다1 ");
				
				// 문자열은 equals 사용해서 객체 비교 가능 
				if( 이름1.equals(이름2) ) System.out.println(" 두명의 이름은 동일하다2 ");
			
			// 3. 문자열 => 바이트 [ getBytes ]
				String 문자열6 = "안녕하세요";
				byte[] 바이트배열3 = 문자열6.getBytes();
				System.out.println( 바이트배열3.length );
						// 영문 1바이트 , 한글 2바이트 
				String 문자열7 = new String( 바이트배열3 );
				System.out.println( 문자열7 );
				
				// 인코딩[바이트->문자열 변경 방식 ]  : EUC-KR , UTF-8
				try {
					byte[] EUC_KR = 문자열7.getBytes("EUC-KR"); // 예외발생 
					System.out.println(" EUC-KR 인코딩 후 길이 : " + EUC_KR.length  );
							// 영문 1바이트 , 한글 2바이트 
					byte[] UTF_8 = 문자열7.getBytes("UTF-8");
					System.out.println(" UTF-8 인코딩 후 길이 : " + UTF_8.length );
							// 영문 1바이트 , 한글 3바이트 
					
				}catch (Exception e) {}
			
			// 4. 문자 찾기 [ indexof ]
				String 문자열8 ="자바 프로그래밍";
				
				int index =  문자열8.indexOf("프로그래밍");
				System.out.println(" 찾은 문자의 인덱스 위치 : " + index );
				
				Scanner scanner = new Scanner(System.in );
				String 검색어 =  scanner.next();
				
				if( 문자열8.indexOf(검색어) != -1 ) {
					// -1 : 인덱스가 없다는 뜻 [ 인덱스의 시작은 0부터 ]
					System.out.println(" 해당 관련된 도서가 있습니다 ");
				}else {
					System.out.println(" 해당 관련된 도서가 없습니다 ");
				}
				
			// 5. 문자 길이 [ length ] : 문자 수 
				System.out.println( 문자열8.length() );		
		
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
}
