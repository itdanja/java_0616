package Day05;

import java.util.Scanner;

public class Day05_1 {
	
	// 1. Day01 : ��� 
	// 2. Day02 : �Է� , ���� 
	// 3. Day03 : ��� if
	// 4. Day04 : �ݺ��� for 
	
	public static void main(String[] args) {
	
		// if / switch ������ 
			// if : T / F 	=> �� �˻� 
				// ����Ǽ��� ������ ���� �ʴ� ���
		int ���� = 10;
		if( ���� > 5 ) System.out.println("������ 5���� ũ�� ");
		else System.out.println("������ 5���� �۴�");
///////////////////////////////////////////////////////////////////////			
			// switch : �� => ��쿡���� �˻� [ ��x ]
				// ����Ǽ��� ������ �ִ� ��� 
				// ���� ã����� �Ʒ��� ��� case ���� 
					// break; switch ������ 
		switch( ���� ) {
			case 10 : {
				System.out.println("������ 10�̴�");
				break;
			}
			case 5 : {
				System.out.println("������ 5�̴�");
				break;
			}
			default : {
				System.out.println("�׿�");
			}
		}
///////////////////////////////////////////////////////////////////////		
		Scanner scanner = new Scanner( System.in );
		System.out.print("����1 �Է�: "); int ����1 = scanner.nextInt();
		System.out.print("����2 �Է�: "); int ����2 = scanner.nextInt();
		System.out.print("����3 �Է�: "); int ����3 = scanner.nextInt();
		int ��� = (����1+����2+����3) / 3; 
		
		switch( ���/10 ) {
		// switch( �˻��� ) 
			case 10: 
			case 9 : 
				System.out.println("A���"); break;
			case 8 :
				System.out.println("B���"); break;
			case 7 :
				System.out.println("C���"); break;
			default :
				System.out.println("Ż��");
		}
///////////////////////////////////////////////////////////////////////		
		
		// for / while ������
		
			// for( �ʱⰪ ; ���ǹ� ; ������ ) { �����ڵ� }
				// ���ǿ� ���� �ݺ��� 
		
			/*
			 	�ʱⰪ 
			   	while( ���ǹ� ) {
			   		������
				}
			*/ 
				// ���ѷ��� 
		
		// while : 1~50���� �����հ�
		int �����հ� = 0 ; 
		for( int i = 0 ; i<=50 ; i++ ) { �����հ�+= i; }
		System.out.println("��� : " + �����հ�);
		
		int �����հ�2 = 0 ;
		int i = 0;	// 1. �ʱⰪ 
		while( i<=50 ) { // 2. ���ǹ� 
			�����հ�2 += i;
			i++; // 3. ������ 
		}
		System.out.println("��� : " + �����հ�2);
///////////////////////////////////////////////////////////////////////		
		// while : 1~100������ 3����� �����հ�
			int �����հ�3 = 0;
			for( int j = 0 ; j<=100 ; j += 3) { �����հ�3+= j ; }
			System.out.println("��� : "+�����հ�3);
		
			int �����հ�4 = 0;
			int j = 0; // 1. �ʱⰪ 
			while( j <= 100 ) { // 2. ���ǹ� 
				�����հ�4 += j; 
				j += 3;  // 3. ������
			}
			System.out.println("��� : "+�����հ�4);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
 