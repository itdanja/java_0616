package Day09;

import java.util.ArrayList;

public class Day09_5 {
	
	// 회원 클래스 [ 슈퍼클래스 ]
		// 아이디 , 비밀번호 
		// 생성자 2개 
		// 메소드 : 회원정보 
	// vip 클래스 [ 서브클래스 ]
		// 등급
	// 관리자 클래스 [ 서브클래스 ] 
		// 직급
	
	public static void main(String[] args) {
		
		회원 회원1 = new 회원("qwe","qwe");
		Vip클래스 회원2 = new Vip클래스("qwe", "qwe", "골드");
		관리자클래스 회원3 = new 관리자클래스("qwe", "qwe", "대리");
		
		회원1.회원정보();
		System.out.println("---------------------------------");
		회원2.회원정보();
		System.out.println("---------------------------------");
		회원3.회원정보();
		System.out.println("---------------------------------");
		
		// 리스트
		ArrayList<회원> 회원목록 = new ArrayList<>();
		ArrayList<Vip클래스> vip목록 = new ArrayList<>();
		ArrayList<관리자클래스> 관리자목록 = new ArrayList<>();
		
		회원목록.add(회원1);
		회원목록.add(회원2);
		회원목록.add(회원3);
			회원목록.get(0).회원정보();
			회원목록.get(1).회원정보();
			회원목록.get(2).회원정보();
		System.out.println("---------------------------------");
		//vip목록.add(회원1);	서브클래스로 생성된 리스트에 슈퍼클래스는 X
		vip목록.add(회원2); 	
		//vip목록.add(회원3);	서로 다른 클래스도 X
			vip목록.get(0).회원정보();
		
		System.out.println("---------------------------------");
		
		// 관리자목록.add(회원1); 서브클래스 생선된 리스트에 슈퍼클래스는 X	
		// 관리자목록.add(회원2); 서로 다른 클래스도 X 
		관리자목록.add(회원3);
			관리자목록.get(0).회원정보();
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
