package day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day05_3 {
	
	public static void main(String[] args) {
		
		
		// 날짜/시간 관련된 클래스 
		
		//1. Date 클래스 [ java.util 패키지 ] 
		Date date = new Date(); // 시스템[컴퓨터]의 오늘날짜,시간 객체 선언 
		System.out.println( " 오늘 날짜/시간 : " + date );
		
		//2. SimpleDateFormat 클래스 : 날짜형식 변환 클래스
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");
								// 날짜 형식 : y연도 M월 d일 H시m분s초
		System.out.println(" 형식 변환 후 : " + simpleDateFormat.format(date) );
		
		//3. Calendar 클래스 : 달력 클래스
		Calendar calendar = Calendar.getInstance();
						// new 사용하지 않고 해당 클래스의 객체[인스턴스] 반환 
							// 이미 클래스에 객체가 있기 때문에 가능 
		System.out.println(" 캘린더 : " + calendar );
		
		System.out.println(" 연도 : " + calendar.YEAR ); // X
		System.out.println(" 연도 : " + calendar.get( calendar.YEAR) );
		System.out.println(" 월[0:1월~ 11:12월]+1 : " + (calendar.get( calendar.MONTH)+1) );
		System.out.println(" 일[월단위] : " + calendar.get( calendar.DAY_OF_MONTH) );
		System.out.println(" 일[주단위( 1:일 ~~~ 7:토 )] : " + calendar.get( calendar.DAY_OF_WEEK ) );
		if( calendar.get(calendar.DAY_OF_WEEK) == 1 ) { System.out.println(" 일요일"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 2 ) { System.out.println(" 월요일"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 3 ) { System.out.println(" 화요일"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 4 ) { System.out.println(" 수요일"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 5 ) { System.out.println(" 목요일"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 6 ) { System.out.println(" 금요일"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 7 ) { System.out.println(" 토요일"); }
		
		// 시간 
		System.out.println(" 오전/오후 : " + calendar.get(calendar.AM_PM) );
		if( calendar.get(calendar.AM_PM) == 0 )System.out.println(" 오전");
		if( calendar.get(calendar.AM_PM) == 1 )System.out.println(" 오후");
		
		System.out.println(" 시 : " + calendar.get( calendar.HOUR) );
		System.out.println(" 분 : " + calendar.get( calendar.MINUTE ));
		System.out.println(" 초 : " + calendar.get( calendar.SECOND ));
		
		
	}

}
