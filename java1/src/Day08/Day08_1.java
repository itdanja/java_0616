package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day08_1 {
	
	// 파일처리 : java 파일 외 다른 파일 다루기 
		// 스트림 : 현재프로그램과 외부장치 연결 고리 [ 데이터 통신 ] 
			// 스트림 통신 단위 : 바이트 
				// 용량단위 : bit[0혹은1] -> byte[8bit] -> kbyte -> mbyte
		// FileOutputStream : 파일 내보내기 
				// .write( 바이트배열 ) 
		// FileInputStream : 파일 읽어오기 
				// .read( 바이트배열 ) 
	
	public static void main(String[] args) throws Exception {
		
		// 1. 파일 생성 
		FileOutputStream outputStream = new FileOutputStream("c:/java/test.txt"); // 파일 새로 작성 
		// 객체 생성 
		// FileOutputStream : 파일 출력클래스 
			// outputStream : 객체명 ( 임의 이름 )
				// new : 객체 메모리 할당 
					// FileOutputStream( ) : 생성자 ( 객체 선언시 초기값 )
		
		// 2. 파일 쓰기 
		String 내용 = "java입니다"; // 문자열 내보내기 불가
			// 문자열.getBytes() : 문자열 ---> 바이트열 
		outputStream.write( 내용.getBytes() );  // 문자열을 바이트열 변경후 
			// 스트림.write( 바이트열 ) ; // 문자열 내보내기 
		
		// 3. 입력값 쓰기 
		Scanner scanner = new Scanner(System.in);
		System.out.println("파일에 작성할 내용 입력 : ");				String 내용2 = scanner.nextLine();	// nextLine : 공백포함 입력받기 
		outputStream.write( 내용2.getBytes() );
		
		// 4. 이어쓰기 
		outputStream = new FileOutputStream( "c:/java/test.txt" , true ); // true : 기존파일 있을경우 이어쓰기
		System.out.println(" 이어쓰기 파일에 작성할 내용 입력 : ");		String 내용3 = scanner.nextLine();	// nextLine : 공백포함 입력받기 
		outputStream.write( 내용3.getBytes() );
		
		// 5. 줄바꿈 예 
		String 첫번째줄 = "\n \\ ";
		outputStream.write(첫번째줄.getBytes());
		
		// 6. 파일 읽어오기 
		FileInputStream inputStream = new FileInputStream("c:/java/test.txt");
			// 입력스트림은 읽어올때 바이트 단위 
		byte[] 바이트배열 = new byte[1000]; // 바이트 1000개 저장할수 있는 배열 
		
		inputStream.read(바이트배열); // 읽어온 바이트를 바이트배열에 저장하기 
		
		System.out.println(" ----- 파일내 텍스트 출력 ----- ");
		System.out.println( new String(바이트배열)); // 바이트열 ---> 문자열 변환 
		
		// 문제 : 
			// 회원가입 : 아이디와 비밀번호 입력받아 파일에 저장하기 
			// 저장후 입력한 아이디와 비밀번호를 콘솔에 출력하기 
		
		FileOutputStream outputStream2 = new FileOutputStream("c:/java/test2.txt"); // 파일 새로 작성 
		
		System.out.println("아이디 입력: "); String 아이디 =  scanner.next();
		System.out.println("비밀번호 입력: ");String 비밀번호 = scanner.next();
		String 회원1 = 아이디 +","+비밀번호+"\n"; // 아이디와 비밀번호를 연결한 문자열 [ 구분 ,  ] 
		
		outputStream2.write( 회원1.getBytes() );
		outputStream2.write( 회원1.getBytes() );
		outputStream2.write( 회원1.getBytes() );
		outputStream2.write( 회원1.getBytes() );
		outputStream2.write( 회원1.getBytes() );
		outputStream2.write( 회원1.getBytes() );
		
		FileInputStream inputStream2 = new FileInputStream("c:/java/test2.txt" );
		byte[] 바이트배열2 = new byte[1000];
		
		inputStream2.read(바이트배열2);
		System.out.println( new String(바이트배열2));

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
