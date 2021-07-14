package Day10;

public class 은행 implements ATM {

	// 필드 
	String 계좌번호;
	int 금액;
	// 생성자 
	public 은행() { }
	public 은행( String 계좌번호 , int 금액 ) {
		this.계좌번호=계좌번호;  this.금액=금액;
	}
	// 추상메소드 재정의 
	@Override
	public void 메뉴() {
		while(true) {
			System.out.println(" [[[ 메뉴 ]]] ");
			System.out.println("1.계좌등록 2.예금 3.출금 4.이체 5.잔고 6.종료");
			int 선택 = Day10_5.scanner.nextInt();
			if(선택 == 1 ) { 계좌등록(); }
			if(선택 == 2 ) { 예금();}
			if(선택 == 3 ) { 출금(); }
			if(선택 == 4 ) { 이체(); }
			if(선택 == 5 ) { 잔고(); }
			if(선택 == 6 ) { return;}
		}
	}
	@Override
	public void 계좌등록() {
	}
	@Override
	public void 예금() {

	}@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}@Override
	public void 잔고() {
	}
	

}
