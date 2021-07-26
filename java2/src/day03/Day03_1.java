package day03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Day03_1 {
	
	// 컬렉션 프레임워크 : 컬렉션[수집] : 메모리 관리 클래스 집합 
		// 컬렉션 : 수집 
		// 프레임워크 : 미리 만들어진 라이브러리 => 프로그램
		// 제네릭 : 클래스 안으로 들어가는 매개클래스/자료형 
	
	public static void main(String[] args) {
		
		// 1. List컬렉션
			// 1. Arraylist 2.Vector 3.Linkedlist
				// 1. 배열과 리스트 차이점
					// 1. 배열[고정메모리] : 컴파일중 메모리 변경x 
					// 2. list[가변메모리] : 미리 만들어진 메소드[코드]
				// 2. 인덱스사용 : 요소가 저장되는 순서 [ 0:시작~~ ]
				// 3. 추가,삭제시 : 인덱스 자동 부여 [ 삭제시 한칸씩 당겨짐 ] 
				// 4. 메소드 
					// 1. 리스트명.add(객체명)
					// 2. 리스트명.get(인덱스번호)
					// 3. 리스트명.remove(인덱스번호)
					// 4. 리스트명.size()
					// 5. 리스트명.clear()
					// 등
				// 5. 리스트간 차이점 
					// 1. Arraylist : 동기화x [ 단일 스레드 사용시 ] : 검색용이[인덱스가 존재하기때문에 빠르게 찾기 가능 ] 
					// 2. Vector : 동기화o	[ 멀티 스레드 사용시 ] 
						// 동기화 : 멀티스레드 사용시
							// 두개 이상의 스레드가 하나의 변수/메소드에 접근할때 접근 순서 매기기
							// 하나의 스레드씩 일처리 하는 동안 다른 스레드는 대기상태 
					// 3. Linkedlist : 삽입/삭제 용이
		
		// 예) Vector 클래스 
		Vector<String> vector = new Vector<>();
			// 제네릭 : <String> Vector 객체에 String 객체 담기 
				// < 매개클래스/자료형 > 
		vector.add("java");
		vector.add("python");
		vector.add("database");
		vector.add("C++");
		
		System.out.println( vector.get(0) );
		
		System.out.println( vector );
	
		vector.remove(1); // 두번째 인덱스 삭제 
		System.out.println( vector );
		
		System.out.println( vector.size() );
		
		for( String string : vector ) {
			System.out.println( string ) ;
		}
		
		vector.clear();
		System.out.println( vector );
		
		// 예) Linkedlist 클래스 
		
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // 현재 시간[나노] 메소드 
		for( int i = 0 ; i<10000 ; i++ ) {
			arrayList.add( 0 , String.valueOf(i) );	// i 값 문자열 변환후 리스트 담기 [ 만개 ]
		}
		end = System.nanoTime(); // 현재시간 
		System.out.println("arraylist 만개 저장하데 걸린시간 : " + (end-start) );

		start = System.nanoTime();
		for( int i = 0 ; i<10000 ;i++ ) {
			linkedList.add(0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		System.out.println("Linkedlist 만개 저장하데 걸린시간"
				+ ": " + (end-start) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
