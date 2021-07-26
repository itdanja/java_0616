package day03;

import java.util.LinkedList;
import java.util.Scanner;

public class Day03_2_대기명단프로그램 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		while(true) {
			System.out.println("대기명단 1. 대기추가 2.대기입장 3.대기명단");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("인원수 : ");	int count = scanner.nextInt();
				linkedList.add( count );
				System.out.println(" 현재 대기번호는 : " + linkedList.size() );
			}
			if( ch == 2 ) {
				System.out.println("대기 입장 해주세요 ");
				linkedList.remove(0); // 가장 앞에 있는 인덱스 삭제 ㄴ
			}
			if( ch == 3 ) {
				int no = 1;
				for( Integer integer : linkedList ) {
					System.out.println( no + " 팀 인원수 : " + integer);
					no++;
				}
			}
			
		}
		
	}

}
