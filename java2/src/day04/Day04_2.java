package day04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Day04_2 {
	
	// ���Ǳ� : stack���� : 3�� ��ǰ 
	// 1. �ݶ� ����[200,10] 2.���̴ٽ���[300,10] 3.ȯŸ����[400,10] 
	// 2. ���� [ scanner ] �Է¹ޱ� 
	// 3. ��ǰ �����ؼ� ��ǰ ����ϰ� ��ǰ ����
	// 4. �ݾ׺����ϸ� ���� x ��ǰ���� x
	// 5. �ܵ� ��� 
	
	public static void main(String[] args) {
	
		Stack<String> �ݶ� = new Stack<String>(); // �ݶ� ����  
		Stack<String> ���̴� = new Stack<>();// ���̴� ����  
		Stack<String> ȯŸ = new Stack<String>(); 	// ȯŸ ���� 
		ArrayList< Stack<String> > ��ǰ��� = new ArrayList<Stack<String>>();
		// ����Ʈ�� 3���� ���� ��� 
		��ǰ���.add(�ݶ�); 	��ǰ���.add(���̴�);	��ǰ���.add(ȯŸ);		
		// �� ���ÿ� ��� 10���� push �ϱ� 
		for( int i = 0 ; i<10 ;i++ ) {  
			��ǰ���.get(0).push("�ݶ�"); 
			��ǰ���.get(1).push("���̴�"); 
			��ǰ���.get(2).push("ȯŸ"); 
		} 
		
		while( true ) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(" �ݾ� : ");	int �ݾ� = scanner.nextInt();
			
			while( true ) {
				System.out.println(" ���� ���� �ݾ� : " + �ݾ� );
				
				if( ��ǰ���.get(0).isEmpty() ) System.out.println("1.�ݶ�[����:200] ��� : ����");
				else System.out.println("1.�ݶ�  [����:200] ��� : " + ��ǰ���.get(0).size());
				
				if( ��ǰ���.get(1).isEmpty() ) System.out.println("2.���̴�[����:300] ��� : ����");
				else System.out.println("2.���̴�[����:300] ��� : " + ��ǰ���.get(1).size());
				
				if( ��ǰ���.get(2).isEmpty() ) System.out.println("3.ȯŸ[����:400] ��� : ����");
				else System.out.println("3.ȯŸ  [����:400] ��� : " + ��ǰ���.get(2).size());
				
				System.out.println("4.�ݾ׹�ȯ ");
				
				int ���� = scanner.nextInt();
				if( ���� == 1 ) {
					if( �ݾ� < 200 ) System.out.println("[[ �ݾ��� �����մϴ� ]]");
					else if( ��ǰ���.get(0).isEmpty() )System.out.println("��� �����ϴ�");
					else {
						System.out.println("[[ �ݶ� ��ȯ ]] ");
						��ǰ���.get(0).pop();
						�ݾ� -= 200;
					}
				}
				
				if( ���� == 2 ) {
					if( �ݾ� < 300 ) System.out.println("[[ �ݾ��� �����մϴ� ]]");
					else if( ��ǰ���.get(1).isEmpty() )System.out.println("��� �����ϴ�");
					else {
						System.out.println("[[ ���̴� ��ȯ ]] ");
						��ǰ���.get(1).pop();
						�ݾ� -= 300;
					}
				}
				if( ���� == 3 ) {
					if( �ݾ� < 400 ) System.out.println("[[ �ݾ��� �����մϴ� ]]");
					else if( ��ǰ���.get(2).isEmpty() )System.out.println("��� �����ϴ�");
					else {
						System.out.println("[[ ȯŸ ��ȯ ]] ");
						��ǰ���.get(2).pop();
						�ݾ� -= 400;
					}
				}
				if( ���� == 4 ) { System.out.println("[[ ���� �ݾ� ��ȯ �մϴ� : " + �ݾ� ); break;} 

			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
