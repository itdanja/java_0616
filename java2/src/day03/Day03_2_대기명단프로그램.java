package day03;

import java.util.LinkedList;
import java.util.Scanner;

public class Day03_2_��������α׷� {
//	����1 : ����� ���α׷� [ Linkedlist Ŭ���� ��� ]
//			�޴� [ ���ѷ��� ]
//			1. ��� �߰� [ �ο��� �Է¹޾�--> ����ȣ �ο� ] 
//			2. ��� ���� [ ���� �տ� �ִ� ����ȣ ���� ]
//			3. ��� ��� ��� 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			// 1. ����Ʈ ���� 
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		while(true) {
			System.out.println("����� 1. ����߰� 2.������� 3.�����");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("�ο��� : ");	int count = scanner.nextInt();
				// 2. ����Ʈ ��ü �߰� 
				linkedList.add( count );
				System.out.println(" ���� ����ȣ�� : " + linkedList.size() );
			}
			if( ch == 2 ) {
				System.out.println("��� ���� ���ּ��� ");
				// 3. ����Ʈ�� ��ü ����
				linkedList.remove(0); // ���� �տ� �ִ� �ε��� ���� ��
			}
			if( ch == 3 ) {
				int no = 1;
				// 4. ����Ʈ�� ��� ��ü ȣ�� 
				for( Integer integer : linkedList ) {
					System.out.println( no + " �� �ο��� : " + integer);
					no++;
				}
			}
			
		}
		
	}

}
