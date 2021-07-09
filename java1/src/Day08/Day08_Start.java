package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
		
		// 프로그램 시작시 멤버리스트가 있는 파일에 모든 멤버 읽어오기 => 리스트 저장 
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/java/memberlist.txt");
				// fileInputStream : 파일 입력 클래스 
			byte[] 바이트 = new byte[1024];  //1024byte => 1kb
			
			fileInputStream.read( 바이트 ); // 모든 바이트 읽어와서 => 배열에 저장 
	
			// 1. 모든 회원 정보의 바이트 => 문자열 
			String 결과 = new String( 바이트 );
			
			// 2. 한명씩 회원 분리 [ 문자열.split( 분리기호 ) ] : 한명씩 회원들의 정보를 배열에 저장 
			String[ ] temp = 결과.split("\n"); // \n기준으로 분해 => 배열에 저장 
			
			for( int i = 0 ; i<temp.length -1 ; i++ ) {	// 배열수-1
				
				String[] string2 =  temp[i].split(","); // 한명의 회원의 정보를 분해 시키기
				Member member = new Member(string2[0] , string2[1], string2[2], 
							string2[3], string2[4], Integer.parseInt(string2[5]), string2[6]);
									// 문자열 ----> 숫자열 
									// Integer.parseInt(문자열)  ===> 숫자 
				members.add(member); // 리스트에 담기 
				
			}
		} catch (Exception e) { // Exception : 모든 예외를 처리해주는 클래스 : Exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) { // 무한루프 시작 [ 5번 입력시 무한루프 종료 ] 
			
			Member temp = new Member(); // 빈 회원객체 
			
			System.out.println("\n[[[[ 회원제 커뮤니티 ]]]]");
			System.out.println("[[[[ 1. 회원가입  2.로그인  3.아이디찾기 4.비밀번호찾기 5.종료 ]]]] ");
			System.out.print("[[[ 사용할 번호 선택 : ");	int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				int 메소드결과 = temp.회원가입();
				if( 메소드결과 == 0 ) System.err.println("\n[[[[ 회원가입성공 : 가입해주셔서 감사합니다 ]]]] ");
				if( 메소드결과 == 1 ) System.err.println("\n[[[[ 회원가입실패 : 중복된 아이디가 존재합니다(뒤로가기) ]]]] ");
			}
			else if( 선택 == 2 ) {
				int 메소드결과 = temp.로그인();
				if( 메소드결과== 0 ) System.err.println("\n[[[[ 로그인성공 : 안녕하세요 ]]]] ");
				if( 메소드결과== 1 ) System.err.println("\n[[[[ 로그인실패 : 존재하지 않는 아이디 입니다  ]]]] ");
				if( 메소드결과== 2 ) System.err.println("\n[[[[ 로그인실패 : 비밀번호가 다릅니다  ]]]] ");
			}
			else if( 선택 == 3 ) {}
			else if( 선택 == 4 ) {}
			else if( 선택 == 5 ) {
				System.err.println("\n[[[[ 이용해주셔서 감사합니다 ]]]]");
				break; // 무한루프 종료 
			}else {}
		}
	}
}
