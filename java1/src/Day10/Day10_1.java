package Day10;

import java.util.Scanner;

public class Day10_1 {

	// 예외처리 : 오류 발생시 오류를 다른코드로 처리 방식 
		// 목적 : 예상치못한 오류가 발생시 => 예외클래스가 해당 오류내용을 저장하고 처리 
		// 형태 : 
		//	1. try{ 오류발생 예상코드 }
		//	   catch(예외클래스 객체명){ 오류발생시 대체코드 }
		//	   finally{ 무조건 실행되는 코드 }
		// 클래스 :
			// 1. 예외를 알고 있는경우 
				// 1. ArrayIndexOutOfBoundsException
				// 2. NullPointerException
				// 3. NumberFormatException
			// 2. 예외를 모르는경우
				// 1. Exception [ 슈퍼클래스 ]
		
			// 3. 예외던지기 
				// 1. throws Exception
	
	
			
	public static void main(String[] args) {
		
		//예1 ) 배열/변수에 자리가 부족할경우 => 오류 발생 
		try { // try{  } 에서 오류 발생시에 catch{} 로 이동 
			int[] 배열 = new int[3];
			배열[0] = 10;
			배열[1] = 20;
			배열[2] = 30;
			배열[4] = 40;	// 오류발생 => catch 이동
		}catch( ArrayIndexOutOfBoundsException e  ){
				// [예외발생된]예외클래스 객체명[임의]
			System.out.println(" 오류 발생 : " + e);
		}
		
		//예2) 변수가 null 인경우 객체정보출력시 => 오류 발생 
		try {
			String data = null;
			System.out.println( data );
			System.out.println( data.toString() ); // 객체명.toString() : 객체의 정보메소드 
		}catch (NullPointerException e) {
			System.out.println(" 오류 발생 : " + e);
		}
		
		//예3) 숫자 => 문자 // 문자 => 숫자 형 변환시 => 오류 발생 
		try {
			String data1 = "100";
			String data2 = "a100";
			System.out.println( Integer.parseInt(data1) ); // Integer.parseInt(문자열);  문자열 => 숫자열 
			System.out.println( Integer.parseInt(data2) );
		}
		catch (NumberFormatException e) {
			System.out.println(" 오류 발생 : " + e);
			System.out.println("문자가 포함된 문자는 숫자로 변환할수 없습니다");
		}
		
		// 예4) 모든 예외를 처리해주는 클래스 Exception
		try {
			// 1. 
			int[] 배열 = new int[3];
			배열[0] = 10;
			배열[1] = 20;
			배열[2] = 30;
			배열[4] = 40;	// 오류발생 => catch 이동
			// 2. 
			String data = null;
			System.out.println( data );
			System.out.println( data.toString() ); // 객체명.toString() : 객체의 정보메소드 
			// 3.
			String data1 = "100";
			String data2 = "a100";
			System.out.println( Integer.parseInt(data1) ); // Integer.parseInt(문자열);  문자열 => 숫자열 
			System.out.println( Integer.parseInt(data2) );
		}
		catch (Exception e) {
			System.out.println("[[오류발생]] : " + e);
		}
		finally { // 무조건 실행되는 코드 [ 예외발생 유무 상관없이 ] .
			System.out.println("[[코드 종료]]");
		}
		
		//문제1
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
					// new : 메모리 할당 [ 새롭게 메모리 할당 ] 
			try {
					System.out.print( "번호 선택 : ");
					int 선택 = scanner.nextInt();
			}
			catch (Exception e) {
				System.out.println(" [경고] : 숫자만 입력 가능 합니다 ");
			}finally {
				System.out.println(" 처리 되었습니다 ");
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
