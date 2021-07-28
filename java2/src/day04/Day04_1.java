package day04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day04_1 {
	
	
	// 자료구조 : 컴퓨터가 메모리를 관리하는 방법 
		// 스택 : Stack : LIFO [ Last in First out ] : 후입 선출 
			// 마지막으로 입력된 데이터가 먼저 출력 
			// 예) 입출력 방향이 한방향 
				// 코인상자 , ctrl+z[뒤로가기 ] 등 
			// 메소드 
					// .push( 객체 ) 
					// .size() 
					// .pop() : 객체 삭제 
					// .isEmpty() : 공백인지 true / false
		// 큐 : Queue : FIFO [ First in First out ] : 선입 선출 
			// 먼저 입력된 데이터가 먼저 출력 
			// 예) 입출력 방향이 양방향 
				// 줄세우기 , 지하철 등 
	
	public static void main(String[] args) {
	/////////////////////////////스택 구조///////////////////////////////////	
		Stack<동전> 동전상자 = new Stack<>();
			// <제네릭> : 클래스 안으로 들어가는 매개 클래스
		
		동전상자.push( new 동전(100) );
		동전상자.push( new 동전(200) );
		동전상자.push( new 동전(300) );
		
		System.out.println(" 동전 상자의 동전수 : " + 동전상자.size() );
		
		// 출력 
		for( 동전 temp : 동전상자 ) {
			System.out.println( temp );
			System.out.println( temp.동전 );
		}
		
		동전상자.pop(); // 삭제 [ 마지막 들어온 데이터순으로 삭제 ] 
		
		System.out.println(" 동전 상자의 동전수 : " + 동전상자.size() );
		
		// 출력 
		for( 동전 temp : 동전상자 ) {
			System.out.println( temp );
			System.out.println( temp.동전 );
		}
		
		// 하나씩 출력하면서 삭제 
		while( !동전상자.isEmpty() ) {
			 // 스택메모리가 비어 있는지 
			 동전 삭제된동전 = 동전상자.pop();
			 System.out.println(" 꺼낸 동전 " + 삭제된동전.동전 );
		}
	/////////////////// 큐  구조 ////////////////////////////////////////////
		
	
		Queue<동전> 동전상자2 = new LinkedList<동전>();
		
		동전상자2.offer( new 동전(100));
		동전상자2.offer( new 동전(200));
		동전상자2.offer( new 동전(300));
		
		System.out.println(" 동전 상자의 동전수 : " + 동전상자2.size() );
		
		// 출력 
		for( 동전 temp : 동전상자2 ) {
			System.out.println(temp);
			System.out.println(temp.동전);
		}
		
		동전상자2.poll(); // 삭제 [ 먼저 들어온 데이터순으로 삭제 ] 
		
		System.out.println(" 동전 상자의 동전수 : " + 동전상자2.size());
		
		// 출력 
		for( 동전 temp : 동전상자2 ) {
			System.out.println(temp);
			System.out.println(temp.동전);
		}
		
		while( !동전상자2.isEmpty() ) {
			동전 삭제된동전 = 동전상자2.poll();
			System.out.println(" 꺼낸 동전 : " + 삭제된동전.동전);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}
	
	

}
