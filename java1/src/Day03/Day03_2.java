package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		// 가위[0]바위[1]보[2] 게임
		Scanner scanner = new Scanner(System.in);	
		// 변수
			int 게임횟수 = 0;
			int 플레이어1승리수 = 0;
			int 플레이어2승리수 = 0;
			int 플레이어1 ;
			
		while( true ) {  // 게임 전체 무한루프
			
			while(true) { // 플레이어1이 입력 무한루프 [ 0~3 사이 입력시 탈출 ]
				System.out.print("플레이어1 선택 [0:가위 , 1:바위 , 2:보 3:종료 ] : "); 
				플레이어1 = scanner.nextInt();
					// 0~3 사이만 입력받기 
					if(  플레이어1 >= 0  && 플레이어1 <= 3 ) break; // 반복문 탈출
					else System.out.println("----> 알수없는 번호 입니다 ");
			}
			
			// 반복문 종료 
				if( 플레이어1 == 3 ) { 
					System.out.println("----> 게임종료 "); 
					System.out.println("----> 총 게임횟수 : " + 게임횟수 );
					
					if( 플레이어1승리수 > 플레이어2승리수 ) System.out.println("----> 최종승리 : 플레이어1");
					else if( 플레이어1승리수 < 플레이어2승리수 )System.out.println("----> 최종승리 : 플레이어2");
					else System.out.println("----> 최종승리 : 무승부");
					break;  // 반복문 탈출[ 무한루프 나가기 ] 
				}
				
			System.out.print("플레이어2 선택 [0:가위 , 1:바위 , 2:보 ] : "); 
			int 플레이어2 = scanner.nextInt();
		
		// 이기는 경우의수 
			// 플레이어1 => 가위 냈을때   	[ 상대방:보 ] 승리
			if( 플레이어1 == 0 ) {
				if( 플레이어2 == 2  ) {
					System.out.println("플레이어1 승리");
					플레이어1++; // 1증가
				}
				else if( 플레이어2 == 1 ) {
					System.out.println("플레이어2 승리");
					플레이어2++;
				}
				else System.out.println("무승부");
			}
			// 플레이어1 => 바위 냈을때   	[ 상대방:가위 ] 승리
			if( 플레이어1 == 1 ) {
				if( 플레이어2 == 0  ) {
					System.out.println("플레이어1 승리");
					플레이어1++; // 1증가
				}
				else if( 플레이어2 == 2 ) {
					System.out.println("플레이어2 승리");
					플레이어2++; // 1증가
				}
				else System.out.println("무승부");
			}
			// 플레이어1 => 보 냈을때		[ 상대방:바위 ] 승리
			if( 플레이어1 == 2 ) {
				if( 플레이어2 == 1  ) {
					System.out.println("플레이어1 승리");
					플레이어1++; // 1증가
				}
				else if( 플레이어2 == 0 ) {
					System.out.println("플레이어2 승리");
					플레이어2++; // 1증가
				}
				else System.out.println("무승부");
			}	
			
			// 게임횟수+=1; 
			// 게임횟수 = 게임횟수 + 1 ;
			게임횟수++; // 게임횟수 증가 
			
		} // while end
	} // main end
} // class 끝 end












