package Day10;

import java.util.Scanner;

public class Day10_4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		// 1. 인터페이스 객체 생성 
		키오스크 키오스크 = null;
		// 2. 연결대상 
		System.out.println("1.롯데리아 2.카페");
		int 연결대상 = scanner.nextInt();
			if( 연결대상 == 1 ) {
				키오스크 = new 롯데리아();
				System.out.println("[[ 키오스크를 롯데리아로 사용합니다 ]] ");
			}
			if( 연결대상 == 2 ) {
				키오스크 = new 카페();
				System.out.println("[[ 키오스크를 카페 사용합니다 ]] ");
			}
			
		while( true ) {
			System.out.println(" [[[[ 키오스크 ]]]] ");
			System.out.println("1.메뉴 2.장바구니 3.결제 4.종료 ");
			System.out.println("선택 : "); int 선택 = scanner.nextInt();
			if( 선택 == 1 ) 키오스크.메뉴();
			if( 선택 == 2 ) 키오스크.장바구니();
			if( 선택 == 3 ) 키오스크.결제();
			if( 선택 == 4 ) {
				키오스크.종료();
				break;
			}
			
		}
			
		
		
	
	}

}
