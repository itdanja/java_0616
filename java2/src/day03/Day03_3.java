package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Day03_3 {

	
	public static void main(String[] args) {
		
		// list 컬렉션 : 순서가 있는 목록[인덱스o]
		// set 컬렉션 : 순서가 없는 목록[인덱스x] 
			// 1.Hashset
			// 2.메소드 
				// 1. add(객체) : 해당 객체를 추가 
				// 2. remove(객체) : 해당 객체를 삭제 
				// 3. hashSet.iterator() : set 순회 호출
				// 4. contains(객체) : 해당 객체가 켈렉션 이미 포함되어 있는지 여부 
			// Iterator 인터페이스 
				// 순서가 없는 목록에 객체하나씩 순회 인터페이스 
				// .hasNext() : 다음 객체 유무 확인 [ 다음 요소가 있으면 true ] 
				// .next() : 다음 객체 호출 [ 다음 요소를 불러오기 ] 
		//예1) Hashset
		// 1. 선언 
		HashSet<String> hashSet = new HashSet<>();
		
		// 2. 메소드 
		hashSet.add("java");
		hashSet.add("java");// 동일한 객체를 차단[ 중복제거 ] 
		hashSet.add("c");
		hashSet.add("database");
		System.out.println(" set의 객체 수 :  " + hashSet.size() );
		hashSet.remove("c"); // 객체 삭제 
		System.out.println(" set의 객체 수 : " + hashSet.size() );
		
		// 1. for 반복문 활용한 객체 호출 
		for( String string : hashSet ) {
			System.out.println( string );
		}
		
		// 2. Iterator 인터페이스 활용한 객체 호출 
		Iterator< String > iterator = hashSet.iterator();
		
		while( iterator.hasNext() ) { // 다음 요소가 있을경우 true 없으면 false
			String string = iterator.next(); // 
			System.out.println(string);
		}
		
		/*
			문제1 : HashSet 클래스 
			1. 6개의 숫자를 입력받기 set저장 [ 중복없이 ]
			2. set저장된 6개의 숫자 출력 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for( int i = 0 ; i<6 ; i++) {
			
			int num = scanner.nextInt();
			// 만약에 중복된 데이터 이면 i 차감 
			if( set.contains(num) ) {
				System.out.println("중복값 "); i--;
			}
			set.add(num);
			
		}
		System.out.println( set );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
