package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		// ����[0]����[1]��[2] ����
		Scanner scanner = new Scanner(System.in);	
		// ����
			int ����Ƚ�� = 0;
			int �÷��̾�1�¸��� = 0;
			int �÷��̾�2�¸��� = 0;
			int �÷��̾�1 ;
			
		while( true ) {  // ���� ��ü ���ѷ���
			
			while(true) { // �÷��̾�1�� �Է� ���ѷ��� [ 0~3 ���� �Է½� Ż�� ]
				System.out.print("�÷��̾�1 ���� [0:���� , 1:���� , 2:�� 3:���� ] : "); 
				�÷��̾�1 = scanner.nextInt();
					// 0~3 ���̸� �Է¹ޱ� 
					if(  �÷��̾�1 >= 0  && �÷��̾�1 <= 3 ) break; // �ݺ��� Ż��
					else System.out.println("----> �˼����� ��ȣ �Դϴ� ");
			}
			
			// �ݺ��� ���� 
				if( �÷��̾�1 == 3 ) { 
					System.out.println("----> �������� "); 
					System.out.println("----> �� ����Ƚ�� : " + ����Ƚ�� );
					
					if( �÷��̾�1�¸��� > �÷��̾�2�¸��� ) System.out.println("----> �����¸� : �÷��̾�1");
					else if( �÷��̾�1�¸��� < �÷��̾�2�¸��� )System.out.println("----> �����¸� : �÷��̾�2");
					else System.out.println("----> �����¸� : ���º�");
					break;  // �ݺ��� Ż��[ ���ѷ��� ������ ] 
				}
				
			System.out.print("�÷��̾�2 ���� [0:���� , 1:���� , 2:�� ] : "); 
			int �÷��̾�2 = scanner.nextInt();
		
		// �̱�� ����Ǽ� 
			// �÷��̾�1 => ���� ������   	[ ����:�� ] �¸�
			if( �÷��̾�1 == 0 ) {
				if( �÷��̾�2 == 2  ) {
					System.out.println("�÷��̾�1 �¸�");
					�÷��̾�1++; // 1����
				}
				else if( �÷��̾�2 == 1 ) {
					System.out.println("�÷��̾�2 �¸�");
					�÷��̾�2++;
				}
				else System.out.println("���º�");
			}
			// �÷��̾�1 => ���� ������   	[ ����:���� ] �¸�
			if( �÷��̾�1 == 1 ) {
				if( �÷��̾�2 == 0  ) {
					System.out.println("�÷��̾�1 �¸�");
					�÷��̾�1++; // 1����
				}
				else if( �÷��̾�2 == 2 ) {
					System.out.println("�÷��̾�2 �¸�");
					�÷��̾�2++; // 1����
				}
				else System.out.println("���º�");
			}
			// �÷��̾�1 => �� ������		[ ����:���� ] �¸�
			if( �÷��̾�1 == 2 ) {
				if( �÷��̾�2 == 1  ) {
					System.out.println("�÷��̾�1 �¸�");
					�÷��̾�1++; // 1����
				}
				else if( �÷��̾�2 == 0 ) {
					System.out.println("�÷��̾�2 �¸�");
					�÷��̾�2++; // 1����
				}
				else System.out.println("���º�");
			}	
			
			// ����Ƚ��+=1; 
			// ����Ƚ�� = ����Ƚ�� + 1 ;
			����Ƚ��++; // ����Ƚ�� ���� 
			
		} // while end
	} // main end
} // class �� end












