package Day09;

public class 신한은행 extends 계좌 {
	
	final String 은행코드 = "101"; // final 변수는 수정불가 => 상수 

	public 신한은행() {
		super();
	}
	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주, int 예금액) {
		super(계좌번호, 비밀번호, 계좌주, 예금액);
	}
	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주) {
		super(계좌번호, 비밀번호, 계좌주);
	}
	
	@Override
	public void 계좌등록() {
		System.out.println("[[[[ 신한은행 계좌등록 화면 ]]]]");
		System.out.println("[[[ 계좌번호 : ");		String 계좌번호 = Day09_6.scanner.next();
		System.out.println("[[[ 비밀번호 : ");		int 비밀번호 = Day09_6.scanner.nextInt();
		System.out.println("[[[ 계좌주 : ");		String 계좌주 =  Day09_6.scanner.next();
		
		신한은행 temp = new 신한은행(계좌번호, 비밀번호, 계좌주);
		Day09_6.계좌목록.add(temp);
		System.err.println("\n[[[ 성공 ]]] : 계좌 등록이 되었습니다 ");
	}
	
	@Override
	public void 입금() {
		super.입금();
	}
	@Override
	public void 출금() {
		super.출금();
	}
	
}
