package Day07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 게시물{

	// 1. 필드 
	String 제목 ; 
	String 내용 ;
	String 작성자 ; 
	String 작성일 ;
	int 조회수 ;
	// 2. 생성자 [ 게시물 작성시 초기값 ] 
	public 게시물( String 제목, String 내용 , String 작성자 ) {
		this.제목 = 제목;
		this.내용 = 내용;
		this.작성자 = 작성자;
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		this.작성일 = format.format(date);
		this.조회수 = 0;
	}
	// 3. 메소드 
	public static void 게시물등록 ( ) {
		System.out.println(" [게시물 등록 페이지]");
			// .nextLine(); 두번 이상 사용시 문제 발생 
			Day07_3.scanner.nextLine(); // 문제 처리 방법
		System.out.print(" 제목 : ");	String 제목 = Day07_3.scanner.nextLine();
			// .next() : 공백 입력 불가 
			// .nextLine() : 공백 포함 입력 가능 
		System.out.print(" 내용 : ");	String 내용 = Day07_3.scanner.nextLine();
		System.out.print(" 작성자 : ");	String 작성자 = Day07_3.scanner.nextLine();
		
		게시물 temp = new 게시물(제목, 내용, 작성자);
		System.out.println(" [완료] 게시물이 등록 되었습니다 ");
		// 게시물을 배열 혹은 리스트에 저장 
		Day07_3.게시물목록.add(temp);
	}
	public static void 게시물출력() {
		// 게시물 목록 
		// for( 클래스명 임시객체명 : 리스트명 ) : 리스트내 객체를 임시객체에 하나씩 대입 
		System.out.println("게시물번호 \t 게시물제목 \t\t 작성자 \t 작성일 \t\t 조회수 ");
		
		int i = 0 ; // 게시물 개수 세기 
		
		for( 게시물 게시물 : Day07_3.게시물목록 ) {
			System.out.println( i +" \t\t "+게시물.제목+" \t\t "+게시물.작성자+"\t"
							+게시물.작성일+" \t "+게시물.조회수);
			i++; // 게시물 당 하나씩 1씩 증가 
		}
	}
	
	public static void 게시물상세보기( int 게시물번호) {
		System.out.println(" [ 게시물 상세페이지 ] ");
		// 게시물번호[인덱스]를 인수로 받는 메소드 
			// 상세보기 했을때 조회수 증가 
			Day07_3.게시물목록.get(게시물번호).조회수 ++ ;
		
		// 선택 게시물 가져오기 
		게시물 temp = Day07_3.게시물목록.get(게시물번호);
		// 게시물 출력 
		System.out.println(" 제목 : " + temp.제목);
		System.out.println(" 작성자 : " + temp.작성자 +
				" 작성일 : " + temp.작성일 +
				" 조회수 : " + temp.작성자);
		
		System.out.println(" 내용 : " + temp.내용);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
