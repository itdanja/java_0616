package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day04_3 {
	
	// Queue
		// 1. ��ö �о�� 
		// 2. �� : ������ -> ��� -> ���� -> ����
		// 3. ������ : ��ö 3���� ��ü 
		// 4. �Ź� ��ȣ�� �޾Ƽ� �ش翪���� ����ؼ� �������� ����
		// 5. ���� �ҿ�ð� 3�� 

	public static Queue<String> ������ = new LinkedList<>();
	public static Queue<String> ��꿪 = new LinkedList<>();
	public static Queue<String> ���￪ = new LinkedList<>();
	public static Queue<String> ���ο� = new LinkedList<>();

	public static ArrayList< Queue<String> > ��ö��Ȳ = new ArrayList<Queue<String>>();
		
	public static void main(String[] args) {
	
			��ö��Ȳ.add(������); ��ö��Ȳ.add(��꿪); ��ö��Ȳ.add(���￪); ��ö��Ȳ.add(���ο�);
			
			��ö��Ȳ.get(0).offer("��ö1");
			��ö��Ȳ.get(0).offer("��ö2");
			��ö��Ȳ.get(0).offer("��ö3");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println(" ==========[[���� ��ö�� ��Ȳ]]===========");
					// ��ö�� ��Ȳ ��� �޼ҵ� 
					��ö����Ȳ();
				System.out.println(" ��ö ��� ��ȣ : 1.���� 2.��� 3.���� 4.����");
				int ch = scanner.nextInt();
				if( ch ==1 ) { ��߽�ȣ(0); }
				if( ch ==2 ) { ��߽�ȣ(1); }
				if( ch ==3 ) { ��߽�ȣ(2); }
				if( ch ==4 ) { ��߽�ȣ(3); }
			}	
	} // main �޼ҵ� �� 
	
	public static void ��ö����Ȳ() {
		System.out.println(" ���� �������� ��ö ��Ȳ : " + ��ö��Ȳ.get(0) );
		System.out.println(" ���� ��꿪�� ��ö ��Ȳ : " + ��ö��Ȳ.get(1) );
		System.out.println(" ���� ���￪�� ��ö ��Ȳ : " + ��ö��Ȳ.get(2) );
		System.out.println(" ���� ���ο��� ��ö ��Ȳ : " + ��ö��Ȳ.get(3) );
	}
	
	public static void ��߽�ȣ( int ��ȣ) {
		
		if( ��ö��Ȳ.get(��ȣ).isEmpty() ) {
			System.out.println("[[[ ���� ������� ��ö�� �����ϴ� ]]]");
			return;
		}
	
		String temp = ��ö��Ȳ.get(��ȣ).poll();
		System.out.println( "[[ ��� : " + temp );
		System.out.println(" �ҿ�ð� : 1��");
		try {
			Thread.sleep(1000); // ����ó�� �߻�  // 3�ʰ� ��� 
			if( ��ȣ+1 > 3 )  ��ö��Ȳ.get(0).offer(temp);
			else ��ö��Ȳ.get(��ȣ+1).offer(temp);
			System.out.println("[[ ���� : " + temp );
		}
		catch (Exception e) {}
	}
	
	
	
	
	
	
	
	
	
}
