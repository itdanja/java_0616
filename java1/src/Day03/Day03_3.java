package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	// 키오스크 프로그램 [ 금액과 제품을 선택받아 결제 ] 
	public static void main(String[] args) {
		// 입력객체
		Scanner scanner = new Scanner(System.in);
		
		// 변수 => 제품들의 재고 변수
		int 콜라재고 = 5; int 사이다재고 = 5; int 환타재고 = 5;
			// 변수는 괄호 안으로 들어갈수 있음 
			// 선언된 괄호 밖으로 나갈수 없음 
		
		// 프로그램 실행 
		while(true) { // 자판기 무한반복
			
			System.out.println(" ----- 키오스크 ----- ");
			System.out.print(" ---> 금액 입력 : ");
			int 금액 = scanner.nextInt();	
			int 장바구니금액 = 0 ;
			int 콜라구매수 = 0; int 사이다구매수 = 0 ; int 환타구매수 = 0 ;
			
			while(true) { // 메뉴 무한반복 
				
				System.out.println("1.콜라[500원] 2.사이다[600원] 3.환타[700원] 4.결제");
				int 선택 = scanner.nextInt();
				
				if( 선택 == 1 ) { 
					if( 콜라재고 == 0 ) { // 1. 재고가 남아 있는지 
						System.out.println(" ---> 재고가 부족합니다 [준비중] ");
					}
					else if( 금액 < 500 ) { // 2. 금액이 있는지 확인 
						System.out.println("---> 금액이 부족합니다 ");
					
					}else if( 장바구니금액+500 > 금액 ) {
						System.out.println("---> 장바구니금액이 초과 하였습니다 ");
					}
					else if( 콜라구매수 >= 콜라재고 ) {
						System.out.println(" ---> 재고가 부족합니다 [준비중] ");
					}
					else {
						System.out.println("---> 콜라을 담았습니다 ");
						콜라구매수++; // 콜라구매수 += 1 
						장바구니금액 += 500; // 장바구니금액 = 장바구니금액+500
					}
				}
				if( 선택 == 2 ) {
					
					if( 사이다재고 == 0 ) { // 1. 재고가 남아 있는지 
						System.out.println(" ---> 재고가 부족합니다 [준비중] ");
					}
					else if( 금액 < 600 ) { // 2. 금액이 있는지 확인 
						System.out.println("---> 금액이 부족합니다 ");
					
					}else if( 장바구니금액+600 > 금액 ) {
						System.out.println("---> 장바구니금액이 초과 하였습니다 ");
					}
					else if( 사이다구매수 >= 사이다재고 ) {
						System.out.println(" ---> 재고가 부족합니다 [준비중] ");
					}
					else {
						System.out.println("---> 사이다을 담았습니다 ");
						사이다구매수++; // 콜라구매수 += 1 
						장바구니금액 += 600; // 장바구니금액 = 장바구니금액+600
					}
					
				}
				if( 선택 == 3 ) {
					
					if( 환타재고 == 0 ) { // 1. 재고가 남아 있는지 
						System.out.println(" ---> 재고가 부족합니다 [준비중] ");
					}
					else if( 금액 < 700 ) { // 2. 금액이 있는지 확인 
						System.out.println("---> 금액이 부족합니다 ");
					
					}else if( 장바구니금액+700 > 금액 ) {
						System.out.println("---> 장바구니금액이 초과 하였습니다 ");
					}
					else if( 환타구매수 >= 환타재고 ) {
						System.out.println(" ---> 재고가 부족합니다 [준비중] ");
					}
					else {
						System.out.println("---> 환타을 담았습니다 ");
						환타구매수++; // 콜라구매수 += 1 
						장바구니금액 += 700; // 장바구니금액 = 장바구니금액+600
					}
					
				}
				if( 선택 == 4 ) {
					System.out.println(" ---- 장바구니 ----- ");
					if(콜라구매수!=0)System.out.println(" 콜라 : " + 콜라구매수 + " / 총 금액 : "+콜라구매수*500);
					if(사이다구매수!=0)System.out.println(" 사이다 : " + 사이다구매수 + " / 총 금액 : "+사이다구매수*600);
					if(환타구매수!=0)System.out.println(" 환타 : " + 환타구매수 + " / 총 금액 : "+환타구매수*700);
					
					System.out.println(" 장바구니의 결제 금액 :  : "+장바구니금액 );
					
					System.out.print(" ---> 결제 하시겠습니까?[ Y(예) , N(아니요) ] ");
					String 선택2 = scanner.next();
					
					if( 선택2.equals("Y") || 선택2.equals("y") || 선택2.equals("예") ) {
						콜라재고 -= 콜라구매수; // 결제시 선택한 콜라 구매수을 재고에서 차감 
						사이다재고 -= 사이다구매수; // 결제시 선택한 콜라 구매수을 재고에서 차감 
						환타재고 -= 환타구매수; // 결제시 선택한 콜라 구매수을 재고에서 차감 
						
						System.out.println(" 잔돈 : " + ( 금액-장바구니금액) );
						
					}else {
						System.out.println("----> 결제취소 되었습니다 [ 초기메뉴로 ] ");
						System.out.println(" 잔돈 : " + ( 금액 ) );
					}
					System.out.println("----> 이용해 주셔서 감사합니다");
					break;
				}
				
			} // 두번째 while end 
		} // 첫번째 while end 
	} // main end 
} // class end 
