package day04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day04_1 {
	
	
	// �ڷᱸ�� : ��ǻ�Ͱ� �޸𸮸� �����ϴ� ��� 
		// ���� : Stack : LIFO [ Last in First out ] : ���� ���� 
			// ���������� �Էµ� �����Ͱ� ���� ��� 
			// ��) ����� ������ �ѹ��� 
				// ���λ��� , ctrl+z[�ڷΰ��� ] �� 
			// �޼ҵ� 
					// .push( ��ü ) 
					// .size() 
					// .pop() : ��ü ���� 
					// .isEmpty() : �������� true / false
		// ť : Queue : FIFO [ First in First out ] : ���� ���� 
			// ���� �Էµ� �����Ͱ� ���� ��� 
			// ��) ����� ������ ����� 
				// �ټ���� , ����ö �� 
	
	public static void main(String[] args) {
	/////////////////////////////���� ����///////////////////////////////////	
		Stack<����> �������� = new Stack<>();
			// <���׸�> : Ŭ���� ������ ���� �Ű� Ŭ����
		
		��������.push( new ����(100) );
		��������.push( new ����(200) );
		��������.push( new ����(300) );
		
		System.out.println(" ���� ������ ������ : " + ��������.size() );
		
		// ��� 
		for( ���� temp : �������� ) {
			System.out.println( temp );
			System.out.println( temp.���� );
		}
		
		��������.pop(); // ���� [ ������ ���� �����ͼ����� ���� ] 
		
		System.out.println(" ���� ������ ������ : " + ��������.size() );
		
		// ��� 
		for( ���� temp : �������� ) {
			System.out.println( temp );
			System.out.println( temp.���� );
		}
		
		// �ϳ��� ����ϸ鼭 ���� 
		while( !��������.isEmpty() ) {
			 // ���ø޸𸮰� ��� �ִ��� 
			 ���� �����ȵ��� = ��������.pop();
			 System.out.println(" ���� ���� " + �����ȵ���.���� );
		}
	/////////////////// ť  ���� ////////////////////////////////////////////
		
	
		Queue<����> ��������2 = new LinkedList<����>();
		
		��������2.offer( new ����(100));
		��������2.offer( new ����(200));
		��������2.offer( new ����(300));
		
		System.out.println(" ���� ������ ������ : " + ��������2.size() );
		
		// ��� 
		for( ���� temp : ��������2 ) {
			System.out.println(temp);
			System.out.println(temp.����);
		}
		
		��������2.poll(); // ���� [ ���� ���� �����ͼ����� ���� ] 
		
		System.out.println(" ���� ������ ������ : " + ��������2.size());
		
		// ��� 
		for( ���� temp : ��������2 ) {
			System.out.println(temp);
			System.out.println(temp.����);
		}
		
		while( !��������2.isEmpty() ) {
			���� �����ȵ��� = ��������2.poll();
			System.out.println(" ���� ���� : " + �����ȵ���.����);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}
	
	

}
