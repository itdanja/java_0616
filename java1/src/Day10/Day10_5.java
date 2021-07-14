package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<은행> 계좌목록 = new ArrayList<>();
	
	public static void main(String[] args) {

		ATM atm = new 은행();
		while(true) {
			System.out.println("1.신한 2.국민 3.농협 4.종료");
			System.out.println("선택 : "); int  선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				System.out.println(" -----> 신한은행 연결 ");
				atm = new 신한bank();
				atm.메뉴();
			}
			if( 선택 == 2) {}
			if( 선택 == 3) {}
			if( 선택 == 4) { atm.종료(); return;}
		}
	}
}
