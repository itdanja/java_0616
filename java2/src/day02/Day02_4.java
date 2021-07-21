package day02;

import java.util.ArrayList;

public class Day02_4 {
	
	public static void main(String[] args) {
		
		// 컬렉션 프레임워크 : 컬렉션[수집] : 메모리 관리 클래스 집합 
			// 컬렉션 : 수집 
			// 프레임워크 : 미리 만들어진 라이브러리 => 프로그램
		
		// 1. List컬렉션
			// 1. Arraylist 2.Vector 3.Linkedlist
				// 1. 배열과 리스트 차이점
					// 1. 배열[고정메모리] : 컴파일중 메모리 변경x 
					// 2. list[가변메모리] 
				// 2. 인덱스사용 : 요소가 저장되는 순서 [ 0:시작~~ ]
				// 3. 추가,삭제시 : 인덱스 자동 부여 [ 삭제시 한칸씩 당겨짐 ] 
				// 4. 메소드 
					// 1. 리스트명.add(객체명)
					// 2. 리스트명.get(인덱스번호)
					// 3. 리스트명.remove(인덱스번호)
					// 4. 리스트명.size()
					// 5. 리스트명.clear()
		
		// 예1) Arraylist
		ArrayList<String> list = new ArrayList<>();
			// 1. 리스트에 객체 추가 
			list.add("java");
			list.add("python");
			list.add("database");
			list.add("C++");
			// 2. 리스트내 요소 호출 [ 인덱스 번호 ]
			System.out.println( list.get(0)) ;
			// 3. 리스트내 요소 삭제 [ 인덱스 번호 ] 
			System.out.println(list);
			list.remove(1); // 삭제시 한칸씩 당겨짐 
			System.out.println(list);
			// 4. 리스트내 요소 수 
			System.out.println(list.size());
			// 5. for과 반복문 활용 
				for( int i = 0 ; i<list.size(); i++ ) {
					System.out.println( list.get(i));
				}
			for( String string : list ) {
				// 임시객체명 : 리스트명   => 리스트내 모든 요소를 하나씩 임시객체에 대입하면서 반복
				System.out.println( string );
			}
			// 6. 리스트내 모든 요소 삭제
			list.clear();
			System.out.println(list);
					
		// 2. set컬렉션 
		
		// 3. map컬렉션 
		
	}

}
