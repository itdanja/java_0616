package day03;

import java.util.LinkedList;
import java.util.Scanner;

public class Day03_2_��������α׷� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		while(true) {
			System.out.println("����� 1. ����߰� 2.������� 3.�����");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("�ο��� : ");	int count = scanner.nextInt();
				linkedList.add( count );
				System.out.println(" ���� ����ȣ�� : " + linkedList.size() );
			}
			if( ch == 2 ) {
				System.out.println("��� ���� ���ּ��� ");
				linkedList.remove(0); // ���� �տ� �ִ� �ε��� ���� ��
			}
			if( ch == 3 ) {
				int no = 1;
				for( Integer integer : linkedList ) {
					System.out.println( no + " �� �ο��� : " + integer);
					no++;
				}
			}
			
		}
		
	}

}
