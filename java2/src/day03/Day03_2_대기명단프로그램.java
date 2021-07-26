package day03;

import java.util.LinkedList;
import java.util.Scanner;

public class Day03_2_대기명단프로그램 {
//	문제1 : 대기줄 프로그램 [ Linkedlist 클래스 사용 ]
//			메뉴 [ 무한루프 ]
//			1. 대기 추가 [ 인원수 입력받아--> 대기번호 부여 ] 
//			2. 대기 입장 [ 가장 앞에 있는 대기번호 삭제 ]
//			3. 대기 명단 출력 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			// 1. 리스트 선언 
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		while(true) {
			System.out.println("대기명단 1. 대기추가 2.대기입장 3.대기명단");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("인원수 : ");	int count = scanner.nextInt();
				// 2. 리스트 객체 추가 
				linkedList.add( count );
				System.out.println(" 현재 대기번호는 : " + linkedList.size() );
			}
			if( ch == 2 ) {
				System.out.println("대기 입장 해주세요 ");
				// 3. 리스트내 객체 삭제
				linkedList.remove(0); // 가장 앞에 있는 인덱스 삭제 ㄴ
			}
			if( ch == 3 ) {
				int no = 1;
				// 4. 리스트내 모든 객체 호출 
				for( Integer integer : linkedList ) {
					System.out.println( no + " 팀 인원수 : " + integer);
					no++;
				}
			}
			
		}
		
	}

}
