package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<����> ���¸�� = new ArrayList<>();
	
	public static void main(String[] args) {

		ATM atm = new ����();
		while(true) {
			System.out.println("1.���� 2.���� 3.���� 4.����");
			System.out.println("���� : "); int  ���� = scanner.nextInt();
			if( ���� == 1 ) {
				System.out.println(" -----> �������� ���� ");
				atm = new ����bank();
				atm.�޴�();
			}
			if( ���� == 2) {}
			if( ���� == 3) {}
			if( ���� == 4) { atm.����(); return;}
		}
	}
}
