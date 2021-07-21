package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day02_3 {
	
//	여러명의 이름 , 나이 입력받아 명단 배치하기 
	
//	명단 클래스
//				<유아>	유치원 명단  [ 나이가 8미만이면 ] 
//				<학생>	초등학생 명단 [ 나이가 8이상이면 ] 
//<사람>			<학생>	중학생 명단 [ 나이가 14세 이상이면 ]
//				<학생>	고등학생 명단 [ 나이가 17세 이상이면 ] 
//				<성인>	대학생 명단 [ 나이가 20세 이상이면 ] 
//				<성인>	직장인 명단 [ 나이가 25세 이상이면 ]
	
    public static Scanner scanner = new Scanner(System.in);
	
    public static Memberlist<Kid> memberlist = new Memberlist<>("유아목록");
    

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println(" 고객 명단 관리 ");
			System.out.println("--------------> 현재명단");
				//
				memberprint(memberlist);
			System.out.println("------------> 명단추가");
			System.out.println("이름: "); String name = scanner.next();
			System.out.println("나이: "); int age = scanner.nextInt();
			
			if( age < 8 ) {
				Kid kid = new Kid( name , age );
				System.out.println("[[ 고객님은 유아명단에 추가 되었습니다 ]] ");
				memberlist.add(kid);
			}
			else if( age >= 8 ) {}
			else if( age >= 14 ) {}
			else if( age >= 17 ) {}
			else if( age >= 20 ) {}
			else if( age >= 25 ) {}
			else {System.out.println("-----------> 나이 입력 오류");}
		}
	} // main end
	
	public static void memberprint( Memberlist<?> list ) {
		
		System.out.println( list.getName()+" 명단 인원 : " + Arrays.toString(list.getList()));
		
		for( int i = 0 ; i<list.getList().length; i++ ) {
			if( list.getList()[i] != null ) {
				System.out.print( list.getList()[i]);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
