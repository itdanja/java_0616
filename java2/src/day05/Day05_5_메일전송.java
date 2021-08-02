package day05;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day05_5_메일전송 {
	
	// 외부 API : 기본적으로 제공 받지 않는 라이브러리 다운로드 받아 사용하기 
	
	// SMTP : Simple Mail Transfer Protocol 
		// Protocol : 통신 규약 [ 통신할때 지켜야되는 규약(약속) ]
	
	// 1. STMP 클래스를 사용하기 위한 라이브러리 다운로드 
		// 1. activation.jar 	2. mail-1.4.7.jar 
	
	// 2. 현재 프로젝트에 라이브러리 추가[등록]
		// 1. 현재 프로젝트 오른쪽클릭 
		// 2. build path => configure build path
		// 3. 탭[메뉴]에서 libraries => add external jars
		// 4. 위에서 다운로드 받은 파일 2개 선택 추가 
			// ** 1.8 버전 이상 
				// 1. 탭[메뉴]에서 libraries => classpath선택 => add external jars
				// 2.  module-info 파일에 아래 추가 
					/*
					  		requires activation; 
							requires mail;
							
							//opens 라이브러리를 사용할패키지명 to activation , mail;
					 		opens day05 to activation , mail;
					 */
		// 5. 네이버 메일 설정 
			// 1. 네이버 메일 환경설정
			// 2. POP3/IMAP 설정
			// 3. IMAP/SMTP 설정
			// 4. 사용함  => 확인 
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ------메일 전송 하기---------  ");
		System.out.print("받는사람 : " ); 	String toemail = scanner.next();
		// .nextLine(); 문제 : .nextLine(); 앞에 next 있는경우 공백인식 
			// 문제 해결  : 사이에 scanner.nextLine(); 추가 
		scanner.nextLine();
		System.out.print("메일 제목 : "); 	String title = scanner.nextLine();
		System.out.print("메일 내용 : ");		String contents = scanner.nextLine();
		
		sendemail(toemail, title, contents);
		
	}
	
	// 이메일 보내는 메소드 : 보내는사람 고정 // 받는사람과 제목, 내용 인수로 받기 
	public static void sendemail( String toemail , String title , String contents ) {
		// 1. 설정 [ 네이버 기준 ] 
		String host ="smtp.naver.com"; // 메일 회사 호스트명 [ 해당 사이트내에서 확인가능 ] 
		String fromemail = "보내는사람아이디@naver.com"; 
		String frompassword = "패스워드";
		
		Properties properties = new Properties(); // 설정 관련 [ map 컬렉션 ] 
		properties.put("mail.smtp.host", host ); // host : 메일회사 호스트[ 통신 이름 ] 
		properties.put("mail.smtp.prot", 587 ); // port : 메일회사 호스트의 smtp port[ 통신 번호 ] 
		properties.put("mail.smtp.auth", "true"); // 인증받기 ㄴ
		
		// 2. 인증 
		//Session session = Session.getDefaultInstance(properties , new Authenticator() { } );
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication( fromemail , frompassword );
			}
		});
		// 3. 메일보내기 
		try {
			MimeMessage message = new MimeMessage( session ); // 메시지에 인증 처리 
			message.setFrom( new InternetAddress(fromemail) ); // 예외처리 발생 
			message.addRecipient(Message.RecipientType.TO , new InternetAddress(toemail) ); // 받는 사람 
			message.setSubject(title); // 메일 제목 
			message.setText(contents); // 메일 내용 
			
			Transport.send(message);// 메일전송
			System.out.println(" [[[ 메일 전송 완료 ]]] ");
			
		}catch (Exception e) {}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
