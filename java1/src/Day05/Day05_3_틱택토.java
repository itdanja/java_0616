package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_3_틱택토 {
	
	public static void main(String[] args) {
		
		// 1.판 설정 => String 9개를 저장할수 있는 배열 선언과 초기값 
		String[] 게임판 = {	"[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]"  };
		Scanner scanner = new Scanner(System.in);
		String 승리자 = ""; // 승리자 알 
		
		while( true ) { // 무한루프 [ 모든 게임판에 알을 두거나 승리자가 나올경우 종료 ] 
			// 2.판 출력 
			for( int i = 0 ; i<게임판.length ;i++ ) {
				System.out.print( 게임판[i]);
				// 3개마다 줄바꿈 [ 인덱스 : 2 5 8  ] 
				if( i % 3 == 2 ) System.out.println();
			}
			
				// 최종승리자
				if( 승리자.equals("[O]")) {
					System.out.println("[ 플레이어 승리 ]");
					break;
				}
				if( 승리자.equals("[X]")) {
					System.out.println("[ 컴퓨터 승리 ]");
					break;
				}
				
			// 3. 자리를 입력받아 해당 자리에 알 두기 
				while( true ) { // 무한루프 [ 플레이어가 0 ~ 8 사이의 숫자 입력시 되거나 혹은 정상적인 알을 두었을때 종료 ]
					System.out.print("위치선택 [ 0~8 ] : ");	int 플레이어 = scanner.nextInt();
					// 1. 0 ~ 8 사이만 입력받기 제어 => 다시 입력받기 
					if( 플레이어 < 0 || 플레이어 > 8 ) {
						System.out.println("[알수없는 번호 입니다]");
					}else {
						// 2. 이미 둔 자리는 다시 입력받기 제어
						if( !게임판[플레이어].equals("[ ]") ) {
							System.out.println("[이미 알이 존재하는 위치 입니다]");
						}else {
							게임판[플레이어] = "[O]"; // 입력받은 인덱스 위치에 문자 대입]
							break; // 정상적인 알 을 두었을대 무한루프 종료 
						} // else end
					} // else end 
				} // while2 end 
				
						int 알수 = 0;
						// 모든 자리에 알이 있을경우 게임 종료 
						for( int i = 0  ; i<9 ; i++ ) {
							if( !게임판[i].equals("[ ]") ) 알수++;
						}
						if( 알수 == 9 ) {
							// 2.판 출력 
							for( int i = 0 ; i<게임판.length ;i++ ) {
								System.out.print( 게임판[i]);
								// 3개마다 줄바꿈 [ 인덱스 : 2 5 8  ] 
								if( i % 3 == 2 ) System.out.println();
							}
							System.out.println("[모든 알을 다 두었습니다 [무승부] ]");
							break;
						}
			
			// 4. 컴퓨터는 0~8 사이의 난수 생성 해서 알 두기 [X]
				// 단 0~8 사이만 난수 생성 하고 이미 둔자리에는 다시 난수 생성해서 두기 
				while( true ) { // 무한루프 [ 컴퓨터가 정상적인 알을 두었을때 종료 ]
					Random random = new Random(); // 난수 생성 객체 
					int 컴퓨터 = random.nextInt(9);
								// .nextInt() : 정수 난수 가져오기 [ 0 ~ int 표현 끝 ]
								// .nextInt(10) : 0 ~ 9 사이의 난수 
								// .nextInt( 9 ) : 0 ~ 8 사이의 난수 
					if( 게임판[컴퓨터].equals("[ ]") ) {
						게임판[컴퓨터] ="[X]"; break;
					}
				} // while3 end 
			
			// 5. 승리 결정
				
				// 1. 가로로 이기는수[ 0 1 2 , 3 4 5 , 6 7 8 ]
				for( int i = 0 ; i<=6 ; i+=3 ) {
					if( 게임판[i].equals( 게임판[i+1]) && 게임판[i+1].equals(게임판[i+2]) ) {
						if( !게임판[i].equals("[ ]") ) 승리자 = 게임판[i]; 
						// 모두 동일한경우 승리자 변수 알 넣기 
					}
				}	
				// 2. 세로로 이기는수[ 0 3 6 , 1 4 7 , 2 5 8 ]
				for( int i = 0 ; i<=2 ;i++ ) {
					if( 게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals( 게임판[i+6]) ) {
						if( !게임판[i].equals("[ ]") ) 승리자 = 게임판[i]; 
					}
				}
				// 3. 대각선 이기는수 [ 0 4 8 , 2 4 6 ]
					// 과제~~~
				
				
		} // while end
	} // main end
} // class end 
