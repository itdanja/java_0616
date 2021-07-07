package Day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day06_3_회원제리스트 {

	// 1. 리스트 사용 
	// 2. 회원 클래스 [ 아이디 , 비밀번호 ]  : 회원수에 제한 x
	// 3. 메뉴 
		// 1. 회원가입 [ 중복 아이디 제거 ] 
		// 2. 로그인 
		// 3. 종료 
	// 4. 로그인시 
		// 1. 회원탈퇴
		// 2. 비밀번호변경
		// 3. 로그아웃 
	

	//클래스명 객체명 = new 생성자;
	// 1. 회원 : 클래스명 [ 객체를 만들 설계도 ] 
		// 2. temp : 객체명 [ 임의의 이름 ] 
			// 3. new : 객체 생성시 메모리 할당 [ 기본자료형(크기가정해져있는) 사용시 new 생략 ] 
				// 4. 회원() : 생성자 [ 객체 생성시 초기값 ]
	
	// 1.빈생성자 이용한 객체생성 : 회원 temp1 = new 회원();
	// temp1.아이디 = 아이디 ;
	// temp1.비밀번호 = 비밀번호;
	// 2.필드를 갖는 생성자 이용한 객체생성  : 회원 temp2 = new 회원(아이디, 비밀번호);
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 리스트 선언 
			// List<리스트에들어가는클래스> 리스트명 = new ArrayList<>();
		List<회원> 회원목록 = new ArrayList<>();
			// < > : 제네릭 
		while(true) { // 무한루프 [ 3번 종료를 입력하면 무한루프 종료 ] 
			System.out.println(" ------ 회원제 프로그램 ------ ");
			System.out.println("1.회원가입 2.로그인 3.종료");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				System.out.println(" -----> 회원가입 화면 -----> ");
				System.out.print(" 아이디 : "); 	String 아이디 = scanner.next();
					// 아이디 중복체크 
					int 중복체크 = 0;
					for( int i = 0 ; i<회원목록.size() ; i++ ) {
								// 리스트명.size() : 리스트내 요소 전체개수 
						if( 회원목록.get(i).아이디.equals(아이디) ) {
							// . : 객체가 클래스에 멤버접근
								// .get(인덱스) : 인덱스위치에 해당하는 요소 호출 
							System.err.println("[경고] : 이미 사용중인 아이디 입니다" );
							중복체크 = 1 ; 
						}		
					}
					if( 중복체크 == 0 ) {
						System.out.print(" 비밀번호 : ");	String 비밀번호 = scanner.next();
						회원 temp = new 회원(아이디, 비밀번호); 	// 회원 클래스를 이용한 회원 객체 만들기 
						회원목록.add(temp); // 회원객체 리스트에 저장 
						System.err.println("\n[회원가입 완료] " + 아이디 + "님 회원가입 되었습니다 ");
					}
			}
			else if( 선택 == 2 ) {
				System.out.println(" -----> 로그인 화면 -----> ");
				System.out.print(" 아이디 : "); 	String 아이디 = scanner.next();
				System.out.print(" 비밀번호 : ");	String 비밀번호 = scanner.next();
				// 동일한 아이디 비밀번호 일경우 로그인 처리 
					//for( 클래스명 임시객체명 : 리스트명 )
						// 리스트내 요소를 하나씩 임시객체 대입 
				int 로그인체크 = 0 ;
				for( 회원 temp : 회원목록 ) {
					if( temp.아이디.equals(아이디) && temp.비밀번호.equals(비밀번호) ) {
						System.err.println("\n[로그인성공] " + 아이디 + "님 로그인이 되었습니다 ");
						로그인체크 = 1;
						// 모든 회원 목록
						System.out.println("\n------------ 회원목록 ------------");
						System.out.println("\t아이디\t비밀번호");
						for( 회원 temp2 : 회원목록) {
							System.out.println("\t"+temp2.아이디 + "\t" + temp2.비밀번호);
						}
						// 로그인시 메뉴 
						while( true ) { // 로그인시 메뉴의 반복문 종료 [ 3번을 입력했을때 무한루프 종료 ] 
							System.out.println("1.회원탈퇴 2.비밀번호변경 3.로그아웃");
							int 선택2 = scanner.nextInt();
							if( 선택2 == 1 ) {
								회원목록.remove(temp); // temp : 현재 로그인된 객체가 저장된 객체
								System.out.println("[탈퇴성공] 회원탈퇴 되었습니다");
								break; // 로그인시 메뉴 while 탈출 
							}
							else if( 선택2 == 2 ) {
								System.out.println(" -----> 패스워드 변경 화면 ");
								System.out.println(" 변경할 패스워드 : "); temp.비밀번호 =  scanner.next();
								System.out.println("[변경완료] 패스워드가 변경되었습니다 "); break;
							}
							else if( 선택2 == 3 ) { 
								System.err.println("\n[로그아웃] 로그아웃 합니다");
								break;
							}
						}
				
					}
				}
				if( 로그인체크 == 0 )	System.err.println("[로그인실패] 아이디 혹은 비밀번호가 일치하지 않습니다");
			}
			else if( 선택 == 3 ) { System.err.println("\n[종료] 이용해주셔서 감사합니다"); break;}
			else { System.err.println("\n[경고] 알수 없는 번호 입니다 ");}
		} // while end 
		
		
		
	} // main end 
	
} // class end 
