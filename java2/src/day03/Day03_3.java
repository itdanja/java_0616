package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Day03_3 {

	
	public static void main(String[] args) {
		
		// list �÷��� : ������ �ִ� ���[�ε���o]
		// set �÷��� : ������ ���� ���[�ε���x] 
			// 1.Hashset
			// 2.�޼ҵ� 
				// 1. add(��ü) : �ش� ��ü�� �߰� 
				// 2. remove(��ü) : �ش� ��ü�� ���� 
				// 3. hashSet.iterator() : set ��ȸ ȣ��
				// 4. contains(��ü) : �ش� ��ü�� �̷��� �̹� ���ԵǾ� �ִ��� ���� 
			// Iterator �������̽� 
				// ������ ���� ��Ͽ� ��ü�ϳ��� ��ȸ �������̽� 
				// .hasNext() : ���� ��ü ���� Ȯ�� [ ���� ��Ұ� ������ true ] 
				// .next() : ���� ��ü ȣ�� [ ���� ��Ҹ� �ҷ����� ] 
		//��1) Hashset
		// 1. ���� 
		HashSet<String> hashSet = new HashSet<>();
		
		// 2. �޼ҵ� 
		hashSet.add("java");
		hashSet.add("java");// ������ ��ü�� ����[ �ߺ����� ] 
		hashSet.add("c");
		hashSet.add("database");
		System.out.println(" set�� ��ü �� :  " + hashSet.size() );
		hashSet.remove("c"); // ��ü ���� 
		System.out.println(" set�� ��ü �� : " + hashSet.size() );
		
		// 1. for �ݺ��� Ȱ���� ��ü ȣ�� 
		for( String string : hashSet ) {
			System.out.println( string );
		}
		
		// 2. Iterator �������̽� Ȱ���� ��ü ȣ�� 
		Iterator< String > iterator = hashSet.iterator();
		
		while( iterator.hasNext() ) { // ���� ��Ұ� ������� true ������ false
			String string = iterator.next(); // 
			System.out.println(string);
		}
		
		/*
			����1 : HashSet Ŭ���� 
			1. 6���� ���ڸ� �Է¹ޱ� set���� [ �ߺ����� ]
			2. set����� 6���� ���� ��� 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for( int i = 0 ; i<6 ; i++) {
			
			int num = scanner.nextInt();
			// ���࿡ �ߺ��� ������ �̸� i ���� 
			if( set.contains(num) ) {
				System.out.println("�ߺ��� "); i--;
			}
			set.add(num);
			
		}
		System.out.println( set );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
