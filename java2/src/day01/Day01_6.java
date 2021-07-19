package day01;

import java.util.Scanner;

public class Day01_6 {
	
	public static String 아이디 =null ; 
	public static String 비밀번호 = null ;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Thread thread = null;

		while(true) {
			System.out.println("[[[ 회원제 ]]]");
			System.out.println("1.로그인 2.회원가입");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) { 
				thread = new Thread( new Runnable() {
					@Override
					public void run() {
						System.out.println("[[[로그인 페이지]]]");
						System.out.println("아이디 : " );		String 아이디 = scanner.next();
						System.out.println("비밀번호 : ");	String 비밀번호 = scanner.next();
						if( 아이디.equals( Day01_6.아이디 ) && 비밀번호.equals(Day01_6.비밀번호) ) {
							System.out.println("[[로그인성공]]");
						}
					}
				});
				thread.start();
			}
			if( 선택 == 2 ) {
				thread = new Thread( new Runnable() {
					@Override
					public void run() {
						
						System.out.println("[[[회원가입 페이지]]]");
						System.out.println("아이디 : " );		 Day01_6.아이디  = scanner.next();
						System.out.println("비밀번호 : ");	 Day01_6.비밀번호 = scanner.next();

					}
				});
				thread.start();
			}
			
		}
		
	}

}
