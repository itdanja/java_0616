package Day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Day09_6 {

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<����> ���¸�� = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("\n[[[[ ������ 24�� ATM ]]]]");
			System.out.println("[[[ 1.���µ�� 2.�Ա� 3.��� 4.��ü ]]]");
			System.out.print("[[[ ���� : ");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				System.out.println("[[[ ���� ���� ]]]");
				System.out.println("[[[ 1.���� 2.���� ]]]");
				System.out.print("[[[ ���� : ");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� temp = new ��������();
					temp.���µ��();
				}
			}
			else if( ���� == 2 ) {
				System.out.println("[[[ ���� ���� ]]]");
				System.out.println("[[[ 1.���� 2.���� ]]]");
				System.out.print("[[[ ���� : ");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� temp = new ��������();
					temp.�Ա�();
				}
			}
			else if( ���� == 3 ) {
				System.out.println("[[[ ���� ���� ]]]");
				System.out.println("[[[ 1.���� 2.���� ]]]");
				System.out.print("[[[ ���� : ");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� temp = new ��������();
					temp.���();
				}
			}
			else if( ���� == 4 ) {}
			else {}
			
		}
		
		
	}
	
}
