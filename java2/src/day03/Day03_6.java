package day03;

import java.util.HashMap;
import java.util.Scanner;

public class Day03_6 {

	/*
	문제2 : 게시판
		[ 가입부터 게시물작성 ] 메뉴 
		조건1 : 게시물[map] 제목(string) , 내용(string)
		조건2 : 회원[ map ] 아이디[string] , 비밀번호[string]
	
		조건3 : 두개의 map을 담고 있는 map 선언 
	*/
	


	public static void main(String[] args) {
		
		// 여러개의 map 담는 map
		HashMap<String, HashMap<String, String >> maplist = new HashMap<String, HashMap<String,String>>();
		
		// 게시물 
		HashMap<String , String > boardmap = new HashMap<>();
		// 회원 
		HashMap<String, String> membermap = new HashMap<String, String>();
		
		
		maplist.put("member", membermap);
		maplist.put("board", boardmap );
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(" 현재 map 상황 : " + maplist );
			System.out.println(" 현재 회원 목록 :  " + maplist.get("member"));
			System.out.println(" 현재 게시물 목록 :  " + maplist.get("board"));
			
			System.out.println("1.회원추가 2.글쓰기 "); int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				System.out.println("아이디 "); 	String id = scanner.next();
				System.out.println("비밀번호 "); String pw = scanner.next();
				
				maplist.get("member").put(id, pw);
				
			}
			if( ch == 2 ) {
				System.out.println("제목 "); 	String title = scanner.next();
				System.out.println("내용 "); String password = scanner.next();
				
				maplist.get("board").put(title, password);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
