package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class Day05_2 {
	
		//	도서 검색 프로그램 
		//		[도서명] : 도서목록 리스트에 선언 
		//		1. 된다! 네이버 블로그&포스트
		//		2. 스프링 부트 실전 활용 마스터
		//		3. Tucker의 Go 언어 프로그래밍
		//		4. 혼자 공부하는 C 언어
			
		//	1. 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력하기 
		//	2. 검색한 단어를 새로운 교체할 문자를 입력받아 교체 하기
	
	public static void main(String[] args) {
		
		ArrayList<String> booklist = new ArrayList<>();
		booklist.add("된다! 네이버 블로그&포스트" );
		booklist.add("스프링 부트 실전 활용 마스터" );
		booklist.add("Tucker의 Go 언어 프로그래밍" );
		booklist.add("혼자 공부하는 C 언어" );
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print(" 검색어 : ");	String 검색어 = scanner.next();
		
		// 검색어 출력 
		System.out.println("--- 검색 결과 --- ");
		for( String string :  booklist ) {
			// 입력한 객체 찾기 
			if( string.indexOf(검색어) != -1 ) { // -1이면 인덱스가 없다 => 검색 결과 없다 
				System.out.println("도서명 : " + string );
			}
		}
		// 교체
		System.out.print(" 교체할 문자 : "); 	String 교체문자 = scanner.next();
		System.out.print(" 새로운 문자 : ");		String 새로운문자 = scanner.next();
		
		int i = 0;
		for( String string : booklist ) {
			if( string.indexOf(검색어) != -1 ) {
				booklist.set( i , string.replace(교체문자, 새로운문자) );
				// 리스트명.set( 인덱스번호 , 새로운객체 ) ; // 리스트내 객체 업데이트 
			}
			i++;
		}
		// 교체후 출력
		System.out.println("--- 교체 후  결과 --- ");
		for( String string :  booklist ) {
			// 입력한 객체 찾기 
			if( string.indexOf(새로운문자) != -1 ) { // -1이면 인덱스가 없다 => 검색 결과 없다 
				System.out.println("도서명 : " + string );
			}
		}
		
		
		
		
		
		
		
	}

}
