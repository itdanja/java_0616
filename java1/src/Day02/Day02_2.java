package Day02;

import java.util.Scanner; // Scanner Ŭ������ ����ϱ� ���� �ش� ��Ű�� �������� 

public class Day02_2 {
	
	public static void main(String[] args) {
		
		// ����[�޸�] vs ��ü[�޸�]
			// 1. ����[ �ڷ��� ]  /// ��ü [ Ŭ���� ]
			// 2. ����[ �ڷ����� �̹� ũ�Ⱑ ���������� ]
			// 2. ��ü[ new : Ŭ���� ��ŭ�� ��ü�� �޸� �Ҵ� ] 
		
		// ��� : Sysyem.out.print()
		// �Է� : Scanner Ŭ���� 
			// Ű����κ��� �Է¹��� ���� ��ü�� �����Ŀ� ������ �ű�� 
		
		// 1. �Է� ��ü[ Ŭ���� ������� ������� �޸� ]
			//System.out.println(); // java.lang ��Ű���� import ���� ��� ����
		Scanner �Է°�ü = new Scanner(System.in);
			// Scanner : �Է� ���� Ŭ���� [ �̸� ������� Ŭ���� ] 
				// �Է°�ü : Ŭ���� ������� ���� ��ü�� �̸� [������ �̸� ] 
					// new : ��ü ������ �޸� �Ҵ� ������[��ȣ]
						// Scanner(Sysyem.in) : ������( Ű���� )
		
		// 2. �Է¹��� ��ü�� ������ �����ͼ� ������ ����  [ ��ü��.nextInt() ]
		System.out.print(" ���� �Է� : ");
		int �Էº��� = �Է°�ü.nextInt(); 	System.out.println(" ���� �Էµ� ���� : " + �Էº��� );
		System.out.print(" ����2 �Է� : ");
		�Էº��� = �Է°�ü.nextInt(); 		System.out.println(" ���� �ٽ� �Էµ� ���� : " + �Էº��� );
		
		// 2. ���ڿ� [ ��ü��.next() ]
			// char �ϳ��� ���� ���� ���� 
			// String Ŭ������ �̿��� ���ڿ� ���� ���� 
		System.out.print(" ���ڿ� �Է� : ");
		String ���ڿ� = �Է°�ü.next(); System.out.println(" ���� �Էµ� ���ڿ��� : " + ���ڿ� );
		System.out.print(" �ٽ� �Է� : ");
		���ڿ� = �Է°�ü.next();		System.out.println(" �ٽ� �Էµ� ���ڿ��� : " + ���ڿ� );
		
		
		/* ����1 :  1���� ȸ������ ǥ ����� 
		  ����) ���̵�[S] , ��й�ȣ[short] , ����[S] , �̸���[S]  �Է¹޾� ����ϱ�
				
		  ���) 
				//  >>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>
				// ���̵�		��й�ȣ		����		�̸���		
				//	qwe		1234		���缮	itdanja@kakao.com
		 */
		
		System.out.println(">>>>>>>>>> ȸ������ ���� >>>>>>>>>>>>>");
		System.out.print("���̵� : ");	String ���̵� = �Է°�ü.next();
		System.out.print("��й�ȣ : "); 	short ��й�ȣ = �Է°�ü.nextShort();
		System.out.print("���� : ");		String ���� = �Է°�ü.next();
		System.out.print("�̸��� : ");	String �̸��� = �Է°�ü.next();
		System.out.println(">>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵�+"\t"+��й�ȣ+"\t"+����+"\t"+�̸���);
			// ������½� ����ó�� X

	}

}
