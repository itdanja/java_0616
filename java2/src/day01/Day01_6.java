package day01;

import java.util.Scanner;

public class Day01_6 {
	
	public static String ���̵� =null ; 
	public static String ��й�ȣ = null ;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Thread thread = null;

		while(true) {
			System.out.println("[[[ ȸ���� ]]]");
			System.out.println("1.�α��� 2.ȸ������");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) { 
				thread = new Thread( new Runnable() {
					@Override
					public void run() {
						System.out.println("[[[�α��� ������]]]");
						System.out.println("���̵� : " );		String ���̵� = scanner.next();
						System.out.println("��й�ȣ : ");	String ��й�ȣ = scanner.next();
						if( ���̵�.equals( Day01_6.���̵� ) && ��й�ȣ.equals(Day01_6.��й�ȣ) ) {
							System.out.println("[[�α��μ���]]");
						}
					}
				});
				thread.start();
			}
			if( ���� == 2 ) {
				thread = new Thread( new Runnable() {
					@Override
					public void run() {
						
						System.out.println("[[[ȸ������ ������]]]");
						System.out.println("���̵� : " );		 Day01_6.���̵�  = scanner.next();
						System.out.println("��й�ȣ : ");	 Day01_6.��й�ȣ = scanner.next();

					}
				});
				thread.start();
			}
			
		}
		
	}

}
