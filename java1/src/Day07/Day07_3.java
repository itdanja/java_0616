package Day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day07_3 {
	
	// main 밖에 작성하는 이유 : main 메소드 외에서도 사용되는 경우 [ 다른 클래스도 사용가능 ] 
	public static Scanner scanner = new Scanner(System.in);
	
	// 리스트 선언 : <클래스>  <> 안에 들어가는 객체를 여러개 저장할수있는 게시물등록 리스트 
	public static List<게시물> 게시물목록 = new ArrayList<>();
		// 리스트명.add( 객체명 ) : 해당객체를 리스트에 추가 
		// 리스트명.get( 인덱스번호 ) : 해당 인덱스 번호의 객체 호출 
			// 인덱스 : 리스트에[ 저장된 순서  = 0번시작 ] 
	public static void main(String[] args) {
		
		while(true ) {
			
			System.out.println(" -----------------------> 커뮤니티 --------------------> ");
				
				게시물.게시물출력();	
				
			System.out.println("1.등록 2.상세보기");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				게시물.게시물등록();
			}
			if( 선택 == 2 ) { // 게시물의 번호를 입력받아 해당 게시물의 모든 정보를 출력 
				System.out.println("---> 게시물 번호 선택 : ");
				int 게시물번호 = scanner.nextInt();
				게시물.게시물상세보기(게시물번호);
			}
		
			
		}
		
		
	}

}
