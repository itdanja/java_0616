package Day09;

import java.util.ArrayList;

public class Day09_5 {
	
	// ȸ�� Ŭ���� [ ����Ŭ���� ]
		// ���̵� , ��й�ȣ 
		// ������ 2�� 
		// �޼ҵ� : ȸ������ 
	// vip Ŭ���� [ ����Ŭ���� ]
		// ���
	// ������ Ŭ���� [ ����Ŭ���� ] 
		// ����
	
	public static void main(String[] args) {
		
		ȸ�� ȸ��1 = new ȸ��("qwe","qwe");
		VipŬ���� ȸ��2 = new VipŬ����("qwe", "qwe", "���");
		������Ŭ���� ȸ��3 = new ������Ŭ����("qwe", "qwe", "�븮");
		
		ȸ��1.ȸ������();
		System.out.println("---------------------------------");
		ȸ��2.ȸ������();
		System.out.println("---------------------------------");
		ȸ��3.ȸ������();
		System.out.println("---------------------------------");
		
		// ����Ʈ
		ArrayList<ȸ��> ȸ����� = new ArrayList<>();
		ArrayList<VipŬ����> vip��� = new ArrayList<>();
		ArrayList<������Ŭ����> �����ڸ�� = new ArrayList<>();
		
		ȸ�����.add(ȸ��1);
		ȸ�����.add(ȸ��2);
		ȸ�����.add(ȸ��3);
			ȸ�����.get(0).ȸ������();
			ȸ�����.get(1).ȸ������();
			ȸ�����.get(2).ȸ������();
		System.out.println("---------------------------------");
		//vip���.add(ȸ��1);	����Ŭ������ ������ ����Ʈ�� ����Ŭ������ X
		vip���.add(ȸ��2); 	
		//vip���.add(ȸ��3);	���� �ٸ� Ŭ������ X
			vip���.get(0).ȸ������();
		
		System.out.println("---------------------------------");
		
		// �����ڸ��.add(ȸ��1); ����Ŭ���� ������ ����Ʈ�� ����Ŭ������ X	
		// �����ڸ��.add(ȸ��2); ���� �ٸ� Ŭ������ X 
		�����ڸ��.add(ȸ��3);
			�����ڸ��.get(0).ȸ������();
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}