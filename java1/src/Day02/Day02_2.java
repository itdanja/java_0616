package Day02;

import java.util.Scanner; // Scanner 클래스를 사용하기 위한 해당 패키지 가져오기 

public class Day02_2 {
	
	public static void main(String[] args) {
		
		// 변수[메모리] vs 객체[메모리]
			// 1. 변수[ 자료형 ]  /// 객체 [ 클래스 ]
			// 2. 변수[ 자료형의 이미 크기가 정해져있음 ]
			// 2. 객체[ new : 클래스 만큼의 객체에 메모리 할당 ] 
		
		// 출력 : Sysyem.out.print()
		// 입력 : Scanner 클래스 
			// 키보드로부터 입력받은 값을 객체에 저장후에 변수로 옮기기 
		
		// 1. 입력 객체[ 클래스 기반으로 만들어진 메모리 ]
			//System.out.println(); // java.lang 패키지는 import 없이 사용 가능
		Scanner 입력객체 = new Scanner(System.in);
			// Scanner : 입력 관련 클래스 [ 미리 만들어진 클래스 ] 
				// 입력객체 : 클래스 기반으로 만들 객체의 이름 [임의의 이름 ] 
					// new : 객체 생성시 메모리 할당 연산자[기호]
						// Scanner(Sysyem.in) : 생성자( 키보드 )
		
		// 2. 입력받은 객체에 데이터 가져와서 변수에 저장  [ 객체명.nextInt() ]
		System.out.print(" 정수 입력 : ");
		int 입력변수 = 입력객체.nextInt(); 	System.out.println(" 현재 입력된 값은 : " + 입력변수 );
		System.out.print(" 정수2 입력 : ");
		입력변수 = 입력객체.nextInt(); 		System.out.println(" 현재 다시 입력된 값은 : " + 입력변수 );
		
		// 2. 문자열 [ 객체명.next() ]
			// char 하나의 문자 저장 가능 
			// String 클래스를 이용한 문자열 저장 가능 
		System.out.print(" 문자열 입력 : ");
		String 문자열 = 입력객체.next(); System.out.println(" 현재 입력된 문자열은 : " + 문자열 );
		System.out.print(" 다시 입력 : ");
		문자열 = 입력객체.next();		System.out.println(" 다시 입력된 문자열은 : " + 문자열 );
		
		
		/* 문제1 :  1명의 회원가입 표 만들기 
		  변수) 아이디[S] , 비밀번호[short] , 성명[S] , 이메일[S]  입력받아 출력하기
				
		  출력) 
				//  >>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>
				// 아이디		비밀번호		성명		이메일		
				//	qwe		1234		유재석	itdanja@kakao.com
		 */
		
		System.out.println(">>>>>>>>>> 회원가입 진행 >>>>>>>>>>>>>");
		System.out.print("아이디 : ");	String 아이디 = 입력객체.next();
		System.out.print("비밀번호 : "); 	short 비밀번호 = 입력객체.nextShort();
		System.out.print("성명 : ");		String 성명 = 입력객체.next();
		System.out.print("이메일 : ");	String 이메일 = 입력객체.next();
		System.out.println(">>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println(아이디+"\t"+비밀번호+"\t"+성명+"\t"+이메일);
			// 변수출력시 문자처리 X

	}

}
