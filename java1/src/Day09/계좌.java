package Day09;

public class 계좌 {
	// 1. 필드 [ 상태 ]
	String 계좌번호; 
	int 비밀번호; 
	String 계좌주;
	int 예금액;
	// 2. 생성자 [ 객체 생성시 초기값 ] 
		// 빈생성자 
	public 계좌() {}
		// 계좌등록시 생성자 
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.예금액 = 0 ;
	}
		// 모든 필드를 갖는 생성자 
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주, int 예금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.예금액 = 예금액;
	}

	// 3. 메소드 [ 행동 1.재활용 2.인수,반환 등 ]
	public void 계좌등록() {
	}
	public void 입금() {
	}
	public void 출금() {
	}
	public void 이체() {
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
