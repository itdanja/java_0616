package day03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Day03_1 {
	
	// �÷��� �����ӿ�ũ : �÷���[����] : �޸� ���� Ŭ���� ���� 
		// �÷��� : ���� 
		// �����ӿ�ũ : �̸� ������� ���̺귯�� => ���α׷�
		// ���׸� : Ŭ���� ������ ���� �Ű�Ŭ����/�ڷ��� 
	
	public static void main(String[] args) {
		
		// 1. List�÷���
			// 1. Arraylist 2.Vector 3.Linkedlist
				// 1. �迭�� ����Ʈ ������
					// 1. �迭[�����޸�] : �������� �޸� ����x 
					// 2. list[�����޸�] : �̸� ������� �޼ҵ�[�ڵ�]
				// 2. �ε������ : ��Ұ� ����Ǵ� ���� [ 0:����~~ ]
				// 3. �߰�,������ : �ε��� �ڵ� �ο� [ ������ ��ĭ�� ����� ] 
				// 4. �޼ҵ� 
					// 1. ����Ʈ��.add(��ü��)
					// 2. ����Ʈ��.get(�ε�����ȣ)
					// 3. ����Ʈ��.remove(�ε�����ȣ)
					// 4. ����Ʈ��.size()
					// 5. ����Ʈ��.clear()
					// ��
				// 5. ����Ʈ�� ������ 
					// 1. Arraylist : ����ȭx [ ���� ������ ���� ] : �˻�����[�ε����� �����ϱ⶧���� ������ ã�� ���� ] 
					// 2. Vector : ����ȭo	[ ��Ƽ ������ ���� ] 
						// ����ȭ : ��Ƽ������ ����
							// �ΰ� �̻��� �����尡 �ϳ��� ����/�޼ҵ忡 �����Ҷ� ���� ���� �ű��
							// �ϳ��� �����徿 ��ó�� �ϴ� ���� �ٸ� ������� ������ 
					// 3. Linkedlist : ����/���� ����
		
		// ��) Vector Ŭ���� 
		Vector<String> vector = new Vector<>();
			// ���׸� : <String> Vector ��ü�� String ��ü ��� 
				// < �Ű�Ŭ����/�ڷ��� > 
		vector.add("java");
		vector.add("python");
		vector.add("database");
		vector.add("C++");
		
		System.out.println( vector.get(0) );
		
		System.out.println( vector );
	
		vector.remove(1); // �ι�° �ε��� ���� 
		System.out.println( vector );
		
		System.out.println( vector.size() );
		
		for( String string : vector ) {
			System.out.println( string ) ;
		}
		
		vector.clear();
		System.out.println( vector );
		
		// ��) Linkedlist Ŭ���� 
		
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // ���� �ð�[����] �޼ҵ� 
		for( int i = 0 ; i<10000 ; i++ ) {
			arrayList.add( 0 , String.valueOf(i) );	// i �� ���ڿ� ��ȯ�� ����Ʈ ��� [ ���� ]
		}
		end = System.nanoTime(); // ����ð� 
		System.out.println("arraylist ���� �����ϵ� �ɸ��ð� : " + (end-start) );

		start = System.nanoTime();
		for( int i = 0 ; i<10000 ;i++ ) {
			linkedList.add(0 , String.valueOf(i) );
		}
		end = System.nanoTime();
		System.out.println("Linkedlist ���� �����ϵ� �ɸ��ð�"
				+ ": " + (end-start) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
