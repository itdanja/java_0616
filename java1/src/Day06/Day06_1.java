package Day06;

import java.util.ArrayList;
import java.util.List;

public class Day06_1 {

	// 변수 : 하나를 저장할수 메모리 할당 
	// 배열 : 동일한 자료형/클래스의 여러개 메모리 할당
		// 인덱스 : 배열에 저장된 요소들의 순서 번호 
		// 배열선언과 동시에 메모리 할당 => 
		// 메모리 정적 표현
	
	// 리스트 : 동일한 자료형/클래스의 객체를 담을수 있는 객체 
		// 메모리 동적 표현 
		// 추가,삭제,호출 등 여러 메소드 제공 
			// 리스트명.add( 객체명 ) 
			// 리스트명.remove( 인덱스 ) : 해당 인덱스번호 위치에 삭제 
			// 리스트명.get( 인덱스 ) : 해당 인덱스번호 위치에 요소 호출 
	
	public static void main(String[] args) {
		
		// 1. 배열 선언 : int형 5개 변수를 저장할수 있는 배열 
		int[] 배열 = new int[5];
		
			// 배열 요소 추가 
			배열[0] = 3;
			배열[1] = 4;
			// 배열 요소 삭제 
			배열[0] = 0;
			// 배열 요소 호출
			System.out.println( 배열[0] );
		
		// 2. 리스트[객체] 선언 
		List<Integer> 리스트 = new ArrayList<>();
			// 리스트 요소 추가 = 리스트명.add( 객체명 ) 
			리스트.add(3);
			리스트.add(4);
			// 리스트 요소 삭제 
			리스트.remove(0) ; // 첫번째 요소 [ 인덱스 = 0 ]
			// 리스트 요소 호출 
			System.out.println( 리스트.get(0) );
			
	
		
	}
	
	
	
}
