package Day10;

import java.util.Scanner;

public class Day10_4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		// 1. �������̽� ��ü ���� 
		Ű����ũ Ű����ũ = null;
		// 2. ������ 
		System.out.println("1.�Ե����� 2.ī��");
		int ������ = scanner.nextInt();
			if( ������ == 1 ) {
				Ű����ũ = new �Ե�����();
				System.out.println("[[ Ű����ũ�� �Ե����Ʒ� ����մϴ� ]] ");
			}
			if( ������ == 2 ) {
				Ű����ũ = new ī��();
				System.out.println("[[ Ű����ũ�� ī�� ����մϴ� ]] ");
			}
			
		while( true ) {
			System.out.println(" [[[[ Ű����ũ ]]]] ");
			System.out.println("1.�޴� 2.��ٱ��� 3.���� 4.���� ");
			System.out.println("���� : "); int ���� = scanner.nextInt();
			if( ���� == 1 ) Ű����ũ.�޴�();
			if( ���� == 2 ) Ű����ũ.��ٱ���();
			if( ���� == 3 ) Ű����ũ.����();
			if( ���� == 4 ) {
				Ű����ũ.����();
				break;
			}
			
		}
			
		
		
	
	}

}
