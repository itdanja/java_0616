package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day02_3 {
	
//	�������� �̸� , ���� �Է¹޾� ��� ��ġ�ϱ� 
	
//	��� Ŭ����
//				<����>	��ġ�� ���  [ ���̰� 8�̸��̸� ] 
//				<�л�>	�ʵ��л� ��� [ ���̰� 8�̻��̸� ] 
//<���>			<�л�>	���л� ��� [ ���̰� 14�� �̻��̸� ]
//				<�л�>	����л� ��� [ ���̰� 17�� �̻��̸� ] 
//				<����>	���л� ��� [ ���̰� 20�� �̻��̸� ] 
//				<����>	������ ��� [ ���̰� 25�� �̻��̸� ]
	
    public static Scanner scanner = new Scanner(System.in);
	
    public static Memberlist<Kid> memberlist = new Memberlist<>("���Ƹ��");
    

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println(" �� ��� ���� ");
			System.out.println("--------------> ������");
				//
				memberprint(memberlist);
			System.out.println("------------> ����߰�");
			System.out.println("�̸�: "); String name = scanner.next();
			System.out.println("����: "); int age = scanner.nextInt();
			
			if( age < 8 ) {
				Kid kid = new Kid( name , age );
				System.out.println("[[ ������ ���Ƹ�ܿ� �߰� �Ǿ����ϴ� ]] ");
				memberlist.add(kid);
			}
			else if( age >= 8 ) {}
			else if( age >= 14 ) {}
			else if( age >= 17 ) {}
			else if( age >= 20 ) {}
			else if( age >= 25 ) {}
			else {System.out.println("-----------> ���� �Է� ����");}
		}
	} // main end
	
	public static void memberprint( Memberlist<?> list ) {
		
		System.out.println( list.getName()+" ��� �ο� : " + Arrays.toString(list.getList()));
		
		for( int i = 0 ; i<list.getList().length; i++ ) {
			if( list.getList()[i] != null ) {
				System.out.print( list.getList()[i]);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
