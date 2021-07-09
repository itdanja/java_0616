package Day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day08_Start {
	
	// 회원제 게시판 
		// 파일처리 
		// 클래스 : 회원 , 게시판 
		// 객체관리 : 리스트 
	
	// main밖에 선언하는 이유 : 현재 클래스외 다른 클래스에서 호출하기 위해 
	public static Scanner scanner = new Scanner(System.in);
	// public : 접근제한자 : 동일한 프로젝트내 어디서든 호출 가능 
		// static : main 가장 먼저 실행되기 때문에 main보다 우선할당 [ 프로그램 종료시 초기화 ]
	
	// Member 객체 여러개를 담을수 있는 List 객체 [ ArrayList 클래스 이용한 list 객체 ]
	public static ArrayList<Member> members = new ArrayList<>();
		// 리스트명.add(객체명) : 리스트에 객체 담기 
	
	public static void main(String[] args) {
		
		while(true) { // 무한루프 시작 [ 5번 입력시 무한루프 종료 ] 
			
			Member temp = new Member(); // 빈 회원객체 
			
			System.out.println("\n[[[[ 회원제 커뮤니티 ]]]]");
			System.out.println("[[[[ 1. 회원가입  2.로그인  3.아이디찾기 4.비밀번호찾기 5.종료 ]]]] ");
			System.out.print("[[[ 사용할 번호 선택 : ");	int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				int 메소드결과 = temp.회원가입();
				if( 메소드결과 == 0 ) System.err.println("\n[[[[ 회원가입성공 : 가입해주셔서 감사합니다 ]]]] ");
				if( 메소드결과 == 1 ) System.err.println("\n[[[[ 회원가입실패 : 중복된 아이디가 존재합니다(뒤로가기) ]]]] ");
				if( 메소드결과 == 2 ) System.err.println("\n[[[[ 회원가입실패 : 파일처리 오류[ 관리자에게 문의 ]  ]]]] ");
			}
			else if( 선택 == 2 ) {}
			else if( 선택 == 3 ) {}
			else if( 선택 == 4 ) {}
			else if( 선택 == 5 ) {
				System.err.println("\n[[[[ 이용해주셔서 감사합니다 ]]]]");
				break; // 무한루프 종료 
			}else {}
			
			
		}
		
	}
	
	

}
