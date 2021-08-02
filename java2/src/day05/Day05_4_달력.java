package day05;

import java.util.Calendar;
import java.util.Scanner;

public class Day05_4_달력 {
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(" 연도 입력 : ");	int year = scanner.nextInt();
		System.out.print(" 월 입력 : ");	int month = scanner.nextInt();
		달력( year , month );
	}
	
	public static void 달력( int year , int month ) {
		//1. Calendar 클래스의 객체 가져오기 
		Calendar calendar = Calendar.getInstance();
		//2. 현재 캘린더에서 연도 , 월 , 일 가져오기
				//	int year = calendar.get( calendar.YEAR );
				//	int month = calendar.get( calendar.MONTH )+1;
		
		//****4. : 해당 월의 1일 요일찾기  
		calendar.set( year, month-1 , 1 );// calendar.set( 연 , 월 , 일 ) : 사용자가 직접 날짜 설정 
					// 현재 월의 1일 날짜 만들기 
		int sday = calendar.get( calendar.DAY_OF_WEEK ); // 1일의 요일
		int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH ); // 현재 월의 마지막날 의 일 
		//3. 달력 출력 
		System.out.println("====================="+year+"년"+month+"월======================");
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
			// 5.** 해당 월의 1일 앞에 공백 채우기 
			for( int i = 1 ; i<sday ; i++ ) {
				System.out.print(" \t");
			}
			// 4. 반복문을 이용한 출력 
			for( int i = 1 ; i<=eday ; i++ ) {
				System.out.printf( "%2d\t" , i);
				// 토요일마다 줄바꿈 [ 7의배수마다 ] 
				if( sday % 7 == 0 ) System.out.println();
				sday++;
			}
	}
	
}
