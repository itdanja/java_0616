package Day10;

import Day09.신한은행;

public class 신한bank extends 은행 {
	
	// 필드
	int 은행코드 = 123;
	
	public 신한bank() { super(); }
	public 신한bank( String 계좌번호 , int 금액) {
		super(계좌번호, 금액);
	}
	@Override
	public void 메뉴() {
		super.메뉴();
	}
	
	@Override
	public void 계좌등록() {
		
		System.out.println(" [[[ 신한은행 계좌 등록 ]]] ");
		System.out.println(" 계좌번호 ");
		String 계좌번호 = Day10_5.scanner.next();
		
		//  신한bank 신한bank = new 신한bank(계좌번호, 0);
		Day10_5.계좌목록.add( new 신한bank(계좌번호, 0));
	
	}
	@Override
	public void 예금() {
		// TODO Auto-generated method stub
		super.예금();
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		super.출금();
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		super.이체();
	}@Override
	public void 잔고() {
		// TODO Auto-generated method stub
		super.잔고();
	}
	
	

}
