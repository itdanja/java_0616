package Day09;

public class Vip클래스 extends 회원 {
	
	String 등급;
	public Vip클래스() {
		super();
	}
	public Vip클래스(String 아이디, String 비밀번호 , String 등급) {
		super(아이디, 비밀번호);
		this.등급 = 등급;
	}
	@Override // 메소드 재정의 
	public void 회원정보() {
		super.회원정보();
		System.out.println(" 회원님의 등급 : "+등급 );
	}
	
	
	

}
