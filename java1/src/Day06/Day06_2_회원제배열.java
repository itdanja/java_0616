package Day06;

import java.util.Scanner;

public class Day06_2_회원제배열 {
	
	// 1. 2차원배열 사용 
	// 2. 회원 [ 아이디 , 비밀번호 ] 최대 100명까지 회원가입 가능 
	// 3. 메뉴 
		// 1. 회원가입 [ 중복 아이디 제거 ] 
		// 2. 로그인 
		// 3. 종료 
	// 4. 로그인시 
		// 1. 회원탈퇴
		// 2. 비밀번호변경
		// 3. 로그아웃 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 배열 선언 [ 100명의 회원의 아이디와 비밀번호 ]
			// 100명 => 100개 행  // 아이디 , 비밀번호 => 2열
		String[][] 회원목록 = new String[100][2];
		while(true) { // 무한루프 [ 3번 종료를 입력하면 무한루프 종료 ] 
		
			System.out.println(" ------ 회원제 프로그램 ------ ");
			System.out.println("1.회원가입 2.로그인 3.종료");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				// 입력받기 
				System.out.println(" -----> 회원가입 화면 -----> ");
				System.out.print(" 아이디 : "); 	String 아이디 = scanner.next();
				
				// 이미 배열에 동일한 값이 있을경우 중복제거 
				int 중복체크 = 0 ; // 기본값을 0
				for( int i = 0 ; i<회원목록.length ; i++ ) {
					if( 회원목록[i][0] !=null && 회원목록[i][0].equals(아이디) ) {
						System.err.println("[경고] : 이미 사용중인 아이디 입니다" );
						중복체크 = 1; // 동일한 아이디가 있을때 1
					}
				}
				if( 중복체크 ==0 ) { // 중복체크 0 이면 중복이 없음
					// 배열 저장 
					System.out.print(" 비밀번호 : ");	String 비밀번호 = scanner.next();
					for( int i = 0 ; i<회원목록.length ; i++ ) {
							// i는 0부터 회원목록 배열의 행길이[100] 만큼 1씩 증가하면서 반복
						회원목록[i][0] = 아이디;
						회원목록[i][1] = 비밀번호;
						break;
					}
				}
			} // 선택 1번 if문 end 
			else if( 선택 == 2 ) {
				System.out.println(" -----> 로그인 화면 -----> ");
				System.out.print(" 아이디 : "); 	String 아이디 = scanner.next();
				System.out.print(" 비밀번호 : ");	String 비밀번호 = scanner.next();
				
				// 동일한 아이디 비밀번호 일경우 로그인 처리 
				int 로그인체크 = 0;
				for( int i = 0 ; i<회원목록.length ; i++ ) {
					if( 회원목록[i][0] !=null && 회원목록[i][0].equals(아이디) && 회원목록[i][1].equals(비밀번호) ) {
						System.err.println("[로그인성공] " + 아이디 + "님 로그인이 되었습니다 ");
						로그인체크 = 1;
						
						// 로그인시 메뉴 
						while( true ) { // 로그인시 메뉴의 반복문 종료 [ 3번을 입력했을때 무한루프 종료 ] 
							System.out.println("1.회원탈퇴 2.비밀번호변경 3.로그아웃");
							int 선택2 = scanner.nextInt();
							if( 선택2 == 1 ) {}
							else if( 선택2 == 2 ) {}
							else if( 선택2 == 3 ) { 
								System.err.println("[로그아웃] 로그아웃 합니다");
								break;
							}
						}
					}
				}
				if( 로그인체크 == 0 ) {
					System.err.println("[로그인실패] 아이디 혹은 비밀번호가 일치하지 않습니다");
				}
			}
			else if( 선택 == 3 ) { System.err.println("\n[종료] 이용해주셔서 감사합니다"); break;}
			else { System.err.println("\n[경고] 알수 없는 번호 입니다 ");}
		} // while end
	} // main end 
	
	
	
	
	
	
	
	
	
	
} // class end 
