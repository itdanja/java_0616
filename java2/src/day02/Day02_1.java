package day02;

public class Day02_1 {
	

	public static void main(String[] args) {
		
		// 제네릭 : < > 
			// 1. 자주 변경되는 자료형 사용할떄 

		// 제네릭 미사용 
		box 상자 = new box(); // box 객체 생성
		상자.setobject("사과박스"); //
		String name = (String)상자.getobject();
		System.out.println(name);
		
		상자.setobject( new Apple() );
		Apple apple = (Apple)상자.getobject();
		System.out.println( apple );
		
		// 제네릭 사용시 
		box2<String> 상자2 = new box2<>();
		상자2.set객체("사과박스");
		String name2 = 상자2.get객체();
		System.out.println(name2);
		
		box2<Integer> 상자3 = new box2<>();
		상자3.set객체(10);
		int num = 상자3.get객체();
		System.out.println(num);
		
		box2<Apple> 상자4 = new box2<Apple>();
		상자4.set객체( new Apple() );
		System.out.println(상자4.get객체() );
		
		// 멀티 제네릭
		제품<텔레비전, String > 제품1 = new 제품<>();
		제품1.setKind( new 텔레비전() );
		제품1.setModel("스마트텔레비전");
		
		System.out.println(" 제품1 : " + 제품1.getKind() + 제품1.getModel());
		
		// 자동차클래스 생성해서 제품2 객체 생성 
		제품< 자동차 , String > 제품2 = new 제품<자동차, String>();
		제품2.setKind( new 자동차() );
		제품2.setModel("디젤자동차");
		System.out.println(" 제품2 : " + 제품2.getKind() + 제품2.getModel());
		
		// 제네릭 메소드 
		box2<Integer> box2 = 연결.<Integer>제네릭메소드(100);
		int 값 = box2.get객체();
		System.out.println( 값 );
		
		// box2<String> box22 = 연결.<생략가능>메소드명( 인수 );
		box2<String> box22 = 연결.제네릭메소드("유재석");
		String name3 = box22.get객체();
		System.out.println(name3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
