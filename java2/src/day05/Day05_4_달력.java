package day05;

import java.util.Calendar;
import java.util.Scanner;

public class Day05_4_�޷� {
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���� �Է� : ");	int year = scanner.nextInt();
		System.out.print(" �� �Է� : ");	int month = scanner.nextInt();
		�޷�( year , month );
	}
	
	public static void �޷�( int year , int month ) {
		//1. Calendar Ŭ������ ��ü �������� 
		Calendar calendar = Calendar.getInstance();
		//2. ���� Ķ�������� ���� , �� , �� ��������
				//	int year = calendar.get( calendar.YEAR );
				//	int month = calendar.get( calendar.MONTH )+1;
		
		//****4. : �ش� ���� 1�� ����ã��  
		calendar.set( year, month-1 , 1 );// calendar.set( �� , �� , �� ) : ����ڰ� ���� ��¥ ���� 
					// ���� ���� 1�� ��¥ ����� 
		int sday = calendar.get( calendar.DAY_OF_WEEK ); // 1���� ����
		int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH ); // ���� ���� �������� �� �� 
		//3. �޷� ��� 
		System.out.println("====================="+year+"��"+month+"��======================");
		System.out.println(" ��\t��\tȭ\t��\t��\t��\t��");
			// 5.** �ش� ���� 1�� �տ� ���� ä��� 
			for( int i = 1 ; i<sday ; i++ ) {
				System.out.print(" \t");
			}
			// 4. �ݺ����� �̿��� ��� 
			for( int i = 1 ; i<=eday ; i++ ) {
				System.out.printf( "%2d\t" , i);
				// ����ϸ��� �ٹٲ� [ 7�ǹ������ ] 
				if( sday % 7 == 0 ) System.out.println();
				sday++;
			}
	}
	
}
