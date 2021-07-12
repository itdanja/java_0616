package Day09;

public class Day09_1 {
	
	// 접근제한자 : 
		// public : 동일한 프로젝트내 모든 곳에서 접근 가능 
		// protected : 동일한 패키지내 접근 가능 
			// 서로 다른 서브클래스가 슈퍼클래스가 있는 패키지로 접근 가능 
		// default[생략]  : 동일한 패키지내 접근 가능 
		// private : 동일한 클래스내에서만 접근 가능 
	
	// 키워드 :
		// final : 변수를 상수만들기 [ 고정값 ] 
			// 선언시 초기화값으로 고정 
		// static : main메소드 보다 메모리 할당 [ 정적변수 ] 
			// 프로그램 시작시 메모리 할당 
			// 프로그램 종료시 메모리 초기화 
				// 프로그램 전반적인 메모리 사용시 
	
	public int 정수 = 10;
	protected int 정수2 = 20;
	int 정수3 = 30;
	private int 정수4 = 40;
	
	public final int 정수5 = 50; 
	
	public static void main(String[] args) {
		Day09_1 day09_1 = new Day09_1();
		System.out.println( day09_1.정수 );
		System.out.println( day09_1.정수2 );
		System.out.println( day09_1.정수3 );
		System.out.println( day09_1.정수4 );	
		day09_1.정수 = 100;
		day09_1.정수5 = 100; // final 수정 불가 
	}
}
