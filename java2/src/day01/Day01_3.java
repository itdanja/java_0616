package day01;

import java.util.Scanner;

public class Day01_3 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Thread thread = null;
		
		while( true ) {
			System.out.println("1.��ȭ 2.���� 3.ä�� 4.����");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) { 
				thread = new ��ȭ();
				thread.start();
			}
			if( ���� == 2 ) {
				thread = new ����();
				thread.start();
			}
			if( ���� == 3 ) { 
				thread = new ä��();
				thread.start();
			}
			if( ���� == 4 ) {  System.out.println("����"); break; }
		}
		
	}
	
}
