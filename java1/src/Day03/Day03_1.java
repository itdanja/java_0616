package Day03;

import java.util.Scanner; // import : 해당 클래스 가져오기 

public class Day03_1 {

	// 변수 [ 데이터 저장 ] : 자료형(메모리크기) , 주소값(메모리위치) 
	// 입력 [ Scanner 클래스 ] : import java.util.Scanner
	// 연산자 
		// 산술연산자 : +더하기 -빼기 *곱하기 /나누기 %나머지
		// 비교연산자 : >=이상 >초과 <=이하 <미만 ==같다 !=같지않다 
		// 논리연산자 : &&이면서 ||이거나	!부정
		// 대입연산자 : = 대입(오른쪽값이 왼쪽으로 대입)
				// += ( 오른쪽값을 왼쪽에 더하기한후에 왼쪽에 대입 )
				//  -=   *=   %=
				// a = a+3		a += 3
		// 증감연산자 
				// ++ : 1 증가 
				// -- : 1 감소 
	
	public static void main(String[] args) {

		// 제어문 [ 논리제어문 : if ]
			// ~~ 만약에 ~~ 논리가 맞으면 혹은 틀리면 
			// 형태  if( T/F )
				// 1. if( T/F ) 실행문;
				// 2. if( T/F ) { 실행문1; 실행문2; }
				// 3. if( T/F ) {  T의 실행문; }
 				//	  else{   F의 실행문; }
				// 4. if( T/F ) 
				// 	  else if( T / F )
				//	  else if( T / F )
				// 	  else 
		
		// 1. 입력 객체 만들기 
		Scanner scanner = new Scanner(System.in);
	
/*		
		// 예제1
		if( 3 > 1 ) System.out.println("3이크다");
			// T ----------------> 실행 
		if( 3 > 5 ) System.out.println("3이크다2");
			// F -----------------> 실행X
System.out.println("---------------------------");
		// 예제2 
		if( 3 > 1 ) {
			System.out.println("참 입니다");
			System.out.println("3이 크다");
		}
System.out.println("---------------------------");		
		// 예제3 
		if( 3 > 5 ) System.out.println("3이 크다");
		else System.out.println("5가 크다");
System.out.println("---------------------------");			
		//예제4 :
		if( 3 > 5 ) System.out.println("3이 5보다 크다 ");
		else if( 3 > 4 ) System.out.println("3이 4보다 크다 ");
		else if( 3 > 3 ) System.out.println("3이 3보다 크다 ");
		else if( 3 > 2 ) System.out.println("3이 2보다 크다 ");
		else System.out.println("TRUE 가 없다 ");
System.out.println("---------------------------");	

		// 예제5 : 점수를 입력받아 80점이상이면 합격 / 아니면 탈락 
			
			// 2. 입력받은 객체의 내용을 변수에 저장 
					// .nextInt() : 입력객체에서 내용물 가져오기
			System.out.print("점수입력:");
			int 점수 = scanner.nextInt();
			// 3. 제어 
			if( 점수 >= 80 ) System.out.println("합격");
			else System.out.println("탈락");
System.out.println("---------------------------");				
		// 문제1 : 하나의 점수를 입력받아 90점이상이면 A등급 80점이상이면 B등급 70점이상이면 C등급 그외는 탈락 출력 
			// 0. 입력 객체 만들기 => 위 코드에 입력객체가 있으면 선언X
			System.out.print("점수2입력");
			int 점수2 = scanner.nextInt();
			
			if( 점수2 >= 90 )		System.out.println("A등급");
			else if(점수2>=80)	System.out.println("B등급");
			else if(점수2>=70)	System.out.println("C등급");
			else 				System.out.println("탈락");
System.out.println("---------------------------");				
		// 문제2 : 성별과 점수을 입력받아 남자이면서 90점 이상이면 A-1클래스 출력
								// 여자이면서 90점 이상이면 A-2클래스 출력 
								// 남자이면서 80점 이상이면 B-1클래스 출력 
								// 여자이면서 80점 이상이면 B-2클래스 출력 
								// 그외 C클래스 출력 
			System.out.print("성별 입력 : ");	String 성별 = scanner.next();
			System.out.print("점수3 입력 : ");	int 점수3 = scanner.nextInt();
			// 문자열 : String 은 비교연산자 사용할수 없다 
				// 문자열 비교메소드 :   문자열1.equals(문자열2) 
			if( 성별.equals( "남자" ) ) {
				if( 점수3 >= 90 )System.out.println("A-1클래스");
				else if( 점수3>=80 )System.out.println("B-1클래스");
				else System.out.println("C클래스");
			}else {
				if( 점수3 >= 90 )System.out.println("A-2클래스");
				else if( 점수3>=80 ) System.out.println("B-2 클래스");
				else System.out.println("C클래스");
			}
			
System.out.println("---------------------------");	

		//문제3 
			System.out.println("정수1 : "); int 정수1 = scanner.nextInt();
			System.out.println("정수2 : "); int 정수2 = scanner.nextInt();
			if( 정수1 > 정수2 ) System.out.println(정수1 +" 가 더 크다 ");
			else System.out.println(정수2 +" 가 더 크다 ");
*/
		//문제4 
		System.out.print("정수1 : "); int 정수1 = scanner.nextInt();
		System.out.print("정수2 : "); int 정수2 = scanner.nextInt();
		System.out.print("정수3 : "); int 정수3 = scanner.nextInt();
		
		if( 정수1 > 정수2 && 정수1 > 정수3 ) System.out.println(정수1 +" 가 더 크다 ");
		else if( 정수2 > 정수1 && 정수2 > 정수3 ) System.out.println(정수2 +" 가 더 크다 ");
		else if( 정수3 > 정수1 && 정수3 > 정수2 ) System.out.println(정수3 +" 가 더 크다 ");
		else System.out.println(" 모두 동일하다 ");
		
		
			

		
			
			
		
	
			
			
			
		
			
			
			
			
			
			





	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
