package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class Day05_2 {
	
		//	���� �˻� ���α׷� 
		//		[������] : ������� ����Ʈ�� ���� 
		//		1. �ȴ�! ���̹� ��α�&����Ʈ
		//		2. ������ ��Ʈ ���� Ȱ�� ������
		//		3. Tucker�� Go ��� ���α׷���
		//		4. ȥ�� �����ϴ� C ���
			
		//	1. �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ����ϱ� 
		//	2. �˻��� �ܾ ���ο� ��ü�� ���ڸ� �Է¹޾� ��ü �ϱ�
	
	public static void main(String[] args) {
		
		ArrayList<String> booklist = new ArrayList<>();
		booklist.add("�ȴ�! ���̹� ��α�&����Ʈ" );
		booklist.add("������ ��Ʈ ���� Ȱ�� ������" );
		booklist.add("Tucker�� Go ��� ���α׷���" );
		booklist.add("ȥ�� �����ϴ� C ���" );
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print(" �˻��� : ");	String �˻��� = scanner.next();
		
		// �˻��� ��� 
		System.out.println("--- �˻� ��� --- ");
		for( String string :  booklist ) {
			// �Է��� ��ü ã�� 
			if( string.indexOf(�˻���) != -1 ) { // -1�̸� �ε����� ���� => �˻� ��� ���� 
				System.out.println("������ : " + string );
			}
		}
		// ��ü
		System.out.print(" ��ü�� ���� : "); 	String ��ü���� = scanner.next();
		System.out.print(" ���ο� ���� : ");		String ���ο�� = scanner.next();
		
		int i = 0;
		for( String string : booklist ) {
			if( string.indexOf(�˻���) != -1 ) {
				booklist.set( i , string.replace(��ü����, ���ο��) );
				// ����Ʈ��.set( �ε�����ȣ , ���οü ) ; // ����Ʈ�� ��ü ������Ʈ 
			}
			i++;
		}
		// ��ü�� ���
		System.out.println("--- ��ü ��  ��� --- ");
		for( String string :  booklist ) {
			// �Է��� ��ü ã�� 
			if( string.indexOf(���ο��) != -1 ) { // -1�̸� �ε����� ���� => �˻� ��� ���� 
				System.out.println("������ : " + string );
			}
		}
		
		
		
		
		
		
		
	}

}
