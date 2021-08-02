package day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day05_3 {
	
	public static void main(String[] args) {
		
		
		// ��¥/�ð� ���õ� Ŭ���� 
		
		//1. Date Ŭ���� [ java.util ��Ű�� ] 
		Date date = new Date(); // �ý���[��ǻ��]�� ���ó�¥,�ð� ��ü ���� 
		System.out.println( " ���� ��¥/�ð� : " + date );
		
		//2. SimpleDateFormat Ŭ���� : ��¥���� ��ȯ Ŭ����
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
								// ��¥ ���� : y���� M�� d�� H��m��s��
		System.out.println(" ���� ��ȯ �� : " + simpleDateFormat.format(date) );
		
		//3. Calendar Ŭ���� : �޷� Ŭ����
		Calendar calendar = Calendar.getInstance();
						// new ������� �ʰ� �ش� Ŭ������ ��ü[�ν��Ͻ�] ��ȯ 
							// �̹� Ŭ������ ��ü�� �ֱ� ������ ���� 
		System.out.println(" Ķ���� : " + calendar );
		
		System.out.println(" ���� : " + calendar.YEAR ); // X
		System.out.println(" ���� : " + calendar.get( calendar.YEAR) );
		System.out.println(" ��[0:1��~ 11:12��]+1 : " + (calendar.get( calendar.MONTH)+1) );
		System.out.println(" ��[������] : " + calendar.get( calendar.DAY_OF_MONTH) );
		System.out.println(" ��[�ִ���( 1:�� ~~~ 7:�� )] : " + calendar.get( calendar.DAY_OF_WEEK ) );
		if( calendar.get(calendar.DAY_OF_WEEK) == 1 ) { System.out.println(" �Ͽ���"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 2 ) { System.out.println(" ������"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 3 ) { System.out.println(" ȭ����"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 4 ) { System.out.println(" ������"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 5 ) { System.out.println(" �����"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 6 ) { System.out.println(" �ݿ���"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 7 ) { System.out.println(" �����"); }
		
		// �ð� 
		System.out.println(" ����/���� : " + calendar.get(calendar.AM_PM) );
		if( calendar.get(calendar.AM_PM) == 0 )System.out.println(" ����");
		if( calendar.get(calendar.AM_PM) == 1 )System.out.println(" ����");
		
		System.out.println(" �� : " + calendar.get( calendar.HOUR) );
		System.out.println(" �� : " + calendar.get( calendar.MINUTE ));
		System.out.println(" �� : " + calendar.get( calendar.SECOND ));
		
		
	}

}
