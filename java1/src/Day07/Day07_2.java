package Day07;

import java.util.Scanner;

public class Day07_2 {
	
	// static : 정적변수 : 프로그램 전반적으로 사용되는 메모리
		// 즉 : 프로그램 시작시 main메소드보다 메모리 우선할당 
			// 단점 : 메모리가 프로그램 종료시까지 할당되기때문에 속도 느려짐 
	
	public static void main(String[] args) {
		
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("--- 메뉴 ---- ");
			System.out.println(" 1. 캐릭터 생성 ");
			System.out.println(" 2. 사냥터 가기 ");
			System.out.println(" 3. 상점 가기 ");
			
			캐릭터 캐릭터 = new 캐릭터();
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				캐릭터.캐릭터생성();
			} 
			if( 선택 == 2 ) {
				
				System.out.println(" 몬스터 생성 ");
				몬스터 몬스터 = new 몬스터();
				System.out.println(" 공격횟수 : ");
				int 공격횟수 = scanner.nextInt();
				
				for( int i = 0 ; i<공격횟수 ; i ++  ) {
					캐릭터.경험치 +=  몬스터.피해( 캐릭터.몬스터공격() );
				}
				
				System.out.println(" 경험치 : " + 캐릭터.경험치);
				
				
			} 
			if( 선택 == 3 ) {} 
			
			
			
		}
		
		
	}

}
