package day08;

import java.net.InetAddress;

public class Day08_1 {
	
	// 네트워크 기초 : 통신망[ 인터넷 ] 
		// 1. 네트워크 = 인터넷 [ pc ------ pc ]
	
		// 2. IP = 인터넷 주소 = 집주소
			// 가정집 : IP 자동할당
			// IP : 인터넷 프로토콜[ 규약 ] 
				// 128.0.192.2 => 4칸 구성 [ . 구분 ] 0~255 사이 숫
			// ip확인 : 시작버튼 => cmd[명령프롬프트] => ipconfig
			// java코드로 ip확인 : InetAddress 클래스 이용한 ip 확인 
	
		// 3. 도메인 주소 
			// 네이버회사 정보를 가져오기 => 네이버회사 ip => 여러개 웹사이트의 ip [X]
			// IP[숫자] ---> DNS[문자]
			// 네이버회사IP ---> www.naver.com
			//   컴퓨터				사람
	
	public static void main(String[] args) {
		
		try {
			//예제1 : 현재pc의 ip
			InetAddress address = InetAddress.getLocalHost();
			// InetAddress : 인터넷 정보 관련 메소드 제공 
				// .getLocalHost() : 현재 pc의 정보를 가져오기 [ 예외처리 무조건 발생 ] 
			System.out.println( " 현재 pc의 이름 : " + address.getHostName() );
			System.out.println( " 현재 pc의 ip주소 : " + address.getHostAddress() );
			
			//예제2 : 네이버pc의 ip
			InetAddress address2 = InetAddress.getByName("www.naver.com");
				// .getByName("도메인주소") : 도메인의 1개의 ip 주소 
			System.out.println(" 현재 네이버pc의 이름 : " + address2.getHostName() );
			System.out.println(" 현재 네이버pc의 ip주소 : " + address2.getHostAddress() );
			
			System.out.println("-------------- 네이버는 ip 2개 사용중 ------------- ");
			//예제3 : ip가 여러개인 경우 
			InetAddress[] addresses = InetAddress.getAllByName("www.naver.com");
				// .getAllByName("도메인주소") : 도메인의 모든 ip 주소 
			for( InetAddress address3 : addresses ) {
				System.out.println(" 현재 네이버pc의 이름 : " + address3.getHostName() );
				System.out.println(" 현재 네이버pc의 ip주소 : " + address3.getHostAddress() );
			}
			//예제4 : 구글의 ip
			InetAddress address3 = InetAddress.getByName("www.google.com");
			System.out.println(" 현재 구글pc의 이름 : "+ address3.getHostName() );
			System.out.println(" 현재 구글pc의 ip주소 : " + address3.getHostAddress() );
			
		}
		catch (Exception e) {System.out.println("올바른 정보가 없습니다");}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
