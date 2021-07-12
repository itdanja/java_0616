package Day09;

public class 회원 {
	// 필드 
	String 아이디 ;
	String 비밀번호;
	// 생성자 
	public 회원() { }
	public 회원(String 아이디, String 비밀번호) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
	}
	// 메소드
	public void 회원정보() {
		System.out.println(" 회원님의 아이디 : "+아이디);
		System.out.println(" 회원님의 비밀번호 : "+비밀번호);
	}
	
	
	

}
