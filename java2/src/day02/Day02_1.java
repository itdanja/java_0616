package day02;

public class Day02_1 {
	

	public static void main(String[] args) {
		
		// ���׸� : < > 
			// 1. ���� ����Ǵ� �ڷ��� ����ҋ� 

		// ���׸� �̻�� 
		box ���� = new box(); // box ��ü ����
		����.setobject("����ڽ�"); //
		String name = (String)����.getobject();
		System.out.println(name);
		
		����.setobject( new Apple() );
		Apple apple = (Apple)����.getobject();
		System.out.println( apple );
		
		// ���׸� ���� 
		box2<String> ����2 = new box2<>();
		����2.set��ü("����ڽ�");
		String name2 = ����2.get��ü();
		System.out.println(name2);
		
		box2<Integer> ����3 = new box2<>();
		����3.set��ü(10);
		int num = ����3.get��ü();
		System.out.println(num);
		
		box2<Apple> ����4 = new box2<Apple>();
		����4.set��ü( new Apple() );
		System.out.println(����4.get��ü() );
		
		// ��Ƽ ���׸�
		��ǰ<�ڷ�����, String > ��ǰ1 = new ��ǰ<>();
		��ǰ1.setKind( new �ڷ�����() );
		��ǰ1.setModel("����Ʈ�ڷ�����");
		
		System.out.println(" ��ǰ1 : " + ��ǰ1.getKind() + ��ǰ1.getModel());
		
		// �ڵ���Ŭ���� �����ؼ� ��ǰ2 ��ü ���� 
		��ǰ< �ڵ��� , String > ��ǰ2 = new ��ǰ<�ڵ���, String>();
		��ǰ2.setKind( new �ڵ���() );
		��ǰ2.setModel("�����ڵ���");
		System.out.println(" ��ǰ2 : " + ��ǰ2.getKind() + ��ǰ2.getModel());
		
		// ���׸� �޼ҵ� 
		box2<Integer> box2 = ����.<Integer>���׸��޼ҵ�(100);
		int �� = box2.get��ü();
		System.out.println( �� );
		
		// box2<String> box22 = ����.<��������>�޼ҵ��( �μ� );
		box2<String> box22 = ����.���׸��޼ҵ�("���缮");
		String name3 = box22.get��ü();
		System.out.println(name3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
