package day02;

import java.util.ArrayList;

public class Day02_4 {
	
	public static void main(String[] args) {
		
		// �÷��� �����ӿ�ũ : �÷���[����] : �޸� ���� Ŭ���� ���� 
			// �÷��� : ���� 
			// �����ӿ�ũ : �̸� ������� ���̺귯�� => ���α׷�
		
		// 1. List�÷���
			// 1. Arraylist 2.Vector 3.Linkedlist
				// 1. �迭�� ����Ʈ ������
					// 1. �迭[�����޸�] : �������� �޸� ����x 
					// 2. list[�����޸�] 
				// 2. �ε������ : ��Ұ� ����Ǵ� ���� [ 0:����~~ ]
				// 3. �߰�,������ : �ε��� �ڵ� �ο� [ ������ ��ĭ�� ����� ] 
				// 4. �޼ҵ� 
					// 1. ����Ʈ��.add(��ü��)
					// 2. ����Ʈ��.get(�ε�����ȣ)
					// 3. ����Ʈ��.remove(�ε�����ȣ)
					// 4. ����Ʈ��.size()
					// 5. ����Ʈ��.clear()
		
		// ��1) Arraylist
		ArrayList<String> list = new ArrayList<>();
			// 1. ����Ʈ�� ��ü �߰� 
			list.add("java");
			list.add("python");
			list.add("database");
			list.add("C++");
			// 2. ����Ʈ�� ��� ȣ�� [ �ε��� ��ȣ ]
			System.out.println( list.get(0)) ;
			// 3. ����Ʈ�� ��� ���� [ �ε��� ��ȣ ] 
			System.out.println(list);
			list.remove(1); // ������ ��ĭ�� ����� 
			System.out.println(list);
			// 4. ����Ʈ�� ��� �� 
			System.out.println(list.size());
			// 5. for�� �ݺ��� Ȱ�� 
				for( int i = 0 ; i<list.size(); i++ ) {
					System.out.println( list.get(i));
				}
			for( String string : list ) {
				// �ӽð�ü�� : ����Ʈ��   => ����Ʈ�� ��� ��Ҹ� �ϳ��� �ӽð�ü�� �����ϸ鼭 �ݺ�
				System.out.println( string );
			}
			// 6. ����Ʈ�� ��� ��� ����
			list.clear();
			System.out.println(list);
					
		// 2. set�÷��� 
		
		// 3. map�÷��� 
		
	}

}
