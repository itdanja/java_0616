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
	public void 계좌등록() { // 입력 => 변수 저장 => 객체 생성 => 리스트 저장 
		System.out.println("[[[[ 계좌등록 화면 ]]]]");
		System.out.print("[[[ 계좌번호 : ");		String 계좌번호 = Day09_6.scanner.next();
		System.out.print("[[[ 비밀번호 : ");		int 비밀번호 = Day09_6.scanner.nextInt();
		System.out.print("[[[ 계좌주 : ");		String 계좌주 =  Day09_6.scanner.next();
		
		계좌 temp = new 계좌(계좌번호, 비밀번호, 계좌주);
		Day09_6.계좌목록.add(temp);
		System.err.println("\n[[[ 성공 ]]] : 계좌 등록이 되었습니다 ");
	}
	public void 입금() { // 계좌번호,비밀번호 => 일치하면 => 입금액 => 저장 
				
		int 결과 = 계좌찾기();
		if( 결과 == -1 ) {
			System.out.println("[[[[ 동일한 계좌가 정보가 없습니다 ]]]]");
			return;
		}else {
			System.out.print("[[[ 입금액 : ");	int 입금액 = Day09_6.scanner.nextInt();
			Day09_6.계좌목록.get(결과).예금액 += 입금액;
			System.out.println("[[[[ 예금처리가 되었습니다 ]]]]");
		}
	}
	public void 출금() {
		int 결과 = 계좌찾기();
		if( 결과 == -1 ) {
			System.out.println("[[[[ 동일한 계좌가 정보가 없습니다 ]]]]");
			return;
		}else {
			System.out.print("[[[ 출금액 : ");	int 출금액 = Day09_6.scanner.nextInt();
			// 예금보다 출금액 더 큰경우 출금처리 x 
			if( Day09_6.계좌목록.get(결과).예금액 < 출금액 ) { 
				System.out.println("[[[[ 예금이 부족합니다 ]]]]");
				return;
			}
			Day09_6.계좌목록.get(결과).예금액 -= 출금액;
			System.out.println("[[[[ 출금처리가 되었습니다 ]]]]");
		}
	}
	public void 이체() {
		
	}
	public int 계좌찾기() {
		// return 반환되는 데이터 타입 
		
		System.out.print("[[[ 계좌번호 : ");	String 계좌번호 = Day09_6.scanner.next();
		System.out.print("[[[ 비밀번호 : ");	int 비밀번호 = Day09_6.scanner.nextInt();
		
		int 찾은계좌 = -1;
		for( 계좌 temp : Day09_6.계좌목록  ) {
			// for( 임시객체 : 리스트명 ) : 리스트내 모든 객체수만큼 임시객체에 하나씩 대입 
			찾은계좌++;
			if( temp.계좌번호.equals(계좌번호) && temp.비밀번호==비밀번호 ) {
				// 기존 계좌번호/비밀번호가  방금 위에 입력된 계좌/비밀번호가 동일하면 
				return 찾은계좌; // return : 메소드 반환 / 메소드 종료 
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
