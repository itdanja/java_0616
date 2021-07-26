package day03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Day03_4 {

	
	public static void main(String[] args) {
		
		
		// Map 컬렉션  :  <키 , 값>으로 이루어진 한쌍  = 엔트리 
					// 인덱스 없음 
			// 1. hashMap : 동기화x [ 단일스레드]
			// 2. hashTable : 동기화o [ 멀티스레드 ] 
				// 메소드 
					// 1. .put( 키 , 값 ) : 하나의 엔트리 추가 
					// 2. .size() : 엔트리 개수 
					// 3. .get(키) : 해당하는 키의 값 
					// 4. .remove(키) : 해당하는 키의 엔트리 삭제 
					// 5. .keySet() : map에 존재하는 모든 키를 set 컬렉션으로 호출
						// .values() : 모든 값 호출 
					// 6. .clear() : 모든 요소 삭제 
		// 1. 선언 
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		// 2. 객체 추가 
		hashMap.put("유재석" , 80 );
		hashMap.put("강호동" , 70 );
		hashMap.put("신동엽" , 60 );
		
		// 3. 출력 
		System.out.println( hashMap );
		// 4. 수 
		System.out.println( hashMap.size() );
		// 5. 호출[검색]
		System.out.println( hashMap.get("강호동") );
		// 6. 삭제 
		hashMap.remove("강호동");
		System.out.println( hashMap.get("강호동") );
		
		//7. 모든 키 확인 
		System.out.println( hashMap.keySet() );
		// 모든 값 확인 
		System.out.println( hashMap.values() );
		
		for( String key : hashMap.keySet() ) {
			System.out.println( hashMap.get(key) );
		}
		
		hashMap.clear();
		
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("유재석", 80);
		hashtable.put("강호동", 70);
		hashtable.put("신동엽", 60);
		
		System.out.println( hashtable );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
