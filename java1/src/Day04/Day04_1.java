package Day04;

import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
		
		// ���� : 369 ���� ��� 
			// 1. �ϳ��� ������ �Է¹޾� �ش� ���������� ���� ��� 
			// 2. ��½� 3 Ȥ�� 6 Ȥ�� 9 �� ���ԵǾ� ������ ���� => �ڼ� ��� 
			// 3. ��)   3->�ڼ�	13->�ڼ�		33 ->�ڼ��ڼ�
		
		// 1. �Է¹ޱ�=> Scanner Ŭ���� 
		Scanner scanner = new Scanner(System.in); // �Է� ��ü 
		
		// 2. �Է°�ü���� �Է¹��� �� �������� .next()
		System.out.print("�ϳ��� ���� �Է� : "); int ���� = scanner.nextInt();
		
		// 3. ���ѷ��� [ �Է��� ������ �ݺ��ϱ� ]
			int i = 1; // ���۹�ȣ : 1
	
		while(true) { // ���ѷ���
			int j = i/10; //10���ڸ� �Ǵ� ���� 
			// 1�� �ڸ� �ڼ� = i
			// ������ 10 ������ ���������� 3 Ȥ�� 6 Ȥ�� 9 �̸� 
			if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9   ) {
				
				System.out.print("�ڼ�");
				
				// 10�� �ڸ� �ڼ� 
				if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9 ) {
					System.out.print("�ڼ�");
				}
			}
			// 10�� �ڸ� �ڼ� = j
			else if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9 ) {
				System.out.print("�ڼ�");
			}
			else {
				System.out.print( i ); // i�� ��� 
			}
			
			System.out.println(); // �ٹٲ�
	
			i++; // i = i+1;  // i += 1 ; // i 1������
			// i�� 1�������ϸ鼭 �Է��� �������� Ŀ���� �ݺ��� ����
			if( ���� < i ) break; // break; �ݺ��� ���� 
			
		}
		
		
		
		
		
		
		
		
	} // main end
} // class end
