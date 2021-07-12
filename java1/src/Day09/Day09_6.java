package Day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Day09_6 {

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<계좌> 계좌목록 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("\n[[[[ 편의점 24시 ATM ]]]]");
			System.out.println("[[[ 1.계좌등록 2.입금 3.출금 4.이체 ]]]");
			System.out.print("[[[ 선택 : ");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				System.out.println("[[[ 은행 선택 ]]]");
				System.out.println("[[[ 1.신한 2.국민 ]]]");
				System.out.print("[[[ 선택 : ");
				int 선택2 = scanner.nextInt();
				if( 선택2 == 1 ) {
					신한은행 temp = new 신한은행();
					temp.계좌등록();
				}
			}
			else if( 선택 == 2 ) {
				System.out.println("[[[ 은행 선택 ]]]");
				System.out.println("[[[ 1.신한 2.국민 ]]]");
				System.out.print("[[[ 선택 : ");
				int 선택2 = scanner.nextInt();
				if( 선택2 == 1 ) {
					신한은행 temp = new 신한은행();
					temp.입금();
				}
			}
			else if( 선택 == 3 ) {
				System.out.println("[[[ 은행 선택 ]]]");
				System.out.println("[[[ 1.신한 2.국민 ]]]");
				System.out.print("[[[ 선택 : ");
				int 선택2 = scanner.nextInt();
				if( 선택2 == 1 ) {
					신한은행 temp = new 신한은행();
					temp.출금();
				}
			}
			else if( 선택 == 4 ) {}
			else {}
			
		}
		
		
	}
	
}
