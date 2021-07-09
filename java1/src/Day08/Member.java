package Day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Member {
	
	// 필드 
		String 아이디 ; 
		String 비밀번호 ; 
		String 이름 ;
		String 이메일; 
		String 연락처;
		int 포인트;
		String 등급;
	// 생성자 : 객체 선언시 초기값 
	// 빈생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	// 모든필드 갖는 생성자 
	public Member(String 아이디, String 비밀번호, String 이름, String 이메일, String 연락처, int 포인트, String 등급) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.이메일 = 이메일;
		this.연락처 = 연락처;
		this.포인트 = 포인트;
		this.등급 = 등급;
	}
	// 특정필드만 갖는 생성자 [ 회원가입시 // 포인트 , 등급 제외  ] 
	public Member(String 아이디, String 비밀번호, String 이름, String 이메일, String 연락처) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.이메일 = 이메일;
		this.연락처 = 연락처;
			this.포인트 = 0 ;		// 포인트,등급은 입력받지 않고 기본값으로 설정 
			this.등급 = "일반";
	}
	
	// 메소드 
	// 1. 회원가입 하는 메소드 [ 코드의 재활용 ] 
	public int 회원가입() {
	// 메소드 형태 : 접근제한자 반환타입 메소드명(인수명,~~ ) { 코드 }
	// public : 접근 제한자 	
		// int : 메소드 종료후 정수형 반환해주는 타입
			// 회원가입() : 인수가 없는 메소드명 
		System.out.println("\n[[[[ 회원가입 화면 ]]]]");		// 다른클래스에 멤버를 호출시 [ 클래스명.멤버명 ]  
		System.out.print("[[[ 아이디 : ");		String 아이디 = Day08_Start.scanner.next();
			// 아이디 중복체크 
			for( Member member : Day08_Start.members  ) {
				// for 리스트활용 
				// for( 클래스명 객체명 : 리스트명 ) : 리스트내 모든 객체를 하나씩 객체에 대입
				if( member.아이디.equals(아이디) ) {
					return 1; // return 정수 1를 반환시키는 메소드를 종료 [ 아이디 중복 ] 
				}
			}
		System.out.print("[[[ 비밀번호 : ");		String 비밀번호 = Day08_Start.scanner.next();
		System.out.print("[[[ 이름 : ");		String 이름 = Day08_Start.scanner.next();
		System.out.print("[[[ 이메일 : ");		String 이메일 = Day08_Start.scanner.next();
		System.out.print("[[[ 연락처 : ");		String 연락처 = Day08_Start.scanner.next();
		
		// 생성자를 이용한 객체 생성 
		Member member = new Member(아이디, 비밀번호, 이름, 이메일, 연락처);
		
		// 방금 회원가입 한 회원을 리스트에 담기 
		Day08_Start.members.add(member);
	
		// 파일에 저장하기 
		try { // try { } 안에서 예외(오류) 발생시 catch 로 이동 
			FileOutputStream fileOutputStream = new FileOutputStream( "c:/java/memberlist.txt");
			for( Member temp : Day08_Start.members ) {
				String 내보내기 = temp.아이디+","+temp.비밀번호+","+temp.이름+","+
								temp.연락처+","+temp.이메일+","+ temp.포인트+","+ temp.등급+"\n";
				fileOutputStream.write( 내보내기.getBytes() );
			}
		} catch (Exception e) { // Exception : 모든 예외(오류) 예외 처리 
			return 2;
		}
		return 0; // return 정수 0를 반환시키는 메소드를 종료 [ 회원가입 성공 ] 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
