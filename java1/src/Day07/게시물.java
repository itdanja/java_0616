package Day07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class �Խù�{

	// 1. �ʵ� 
	String ���� ; 
	String ���� ;
	String �ۼ��� ; 
	String �ۼ��� ;
	int ��ȸ�� ;
	// 2. ������ [ �Խù� �ۼ��� �ʱⰪ ] 
	public �Խù�( String ����, String ���� , String �ۼ��� ) {
		this.���� = ����;
		this.���� = ����;
		this.�ۼ��� = �ۼ���;
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		this.�ۼ��� = format.format(date);
		this.��ȸ�� = 0;
	}
	// 3. �޼ҵ� 
	public static void �Խù���� ( ) {
		System.out.println(" [�Խù� ��� ������]");
			// .nextLine(); �ι� �̻� ���� ���� �߻� 
			Day07_3.scanner.nextLine(); // ���� ó�� ���
		System.out.print(" ���� : ");	String ���� = Day07_3.scanner.nextLine();
			// .next() : ���� �Է� �Ұ� 
			// .nextLine() : ���� ���� �Է� ���� 
		System.out.print(" ���� : ");	String ���� = Day07_3.scanner.nextLine();
		System.out.print(" �ۼ��� : ");	String �ۼ��� = Day07_3.scanner.nextLine();
		
		�Խù� temp = new �Խù�(����, ����, �ۼ���);
		System.out.println(" [�Ϸ�] �Խù��� ��� �Ǿ����ϴ� ");
		// �Խù��� �迭 Ȥ�� ����Ʈ�� ���� 
		Day07_3.�Խù����.add(temp);
	}
	public static void �Խù����() {
		// �Խù� ��� 
		// for( Ŭ������ �ӽð�ü�� : ����Ʈ�� ) : ����Ʈ�� ��ü�� �ӽð�ü�� �ϳ��� ���� 
		System.out.println("�Խù���ȣ \t �Խù����� \t\t �ۼ��� \t �ۼ��� \t\t ��ȸ�� ");
		
		int i = 0 ; // �Խù� ���� ���� 
		
		for( �Խù� �Խù� : Day07_3.�Խù���� ) {
			System.out.println( i +" \t\t "+�Խù�.����+" \t\t "+�Խù�.�ۼ���+"\t"
							+�Խù�.�ۼ���+" \t "+�Խù�.��ȸ��);
			i++; // �Խù� �� �ϳ��� 1�� ���� 
		}
	}
	
	public static void �Խù��󼼺���( int �Խù���ȣ) {
		System.out.println(" [ �Խù� �������� ] ");
		// �Խù���ȣ[�ε���]�� �μ��� �޴� �޼ҵ� 
			// �󼼺��� ������ ��ȸ�� ���� 
			Day07_3.�Խù����.get(�Խù���ȣ).��ȸ�� ++ ;
		
		// ���� �Խù� �������� 
		�Խù� temp = Day07_3.�Խù����.get(�Խù���ȣ);
		// �Խù� ��� 
		System.out.println(" ���� : " + temp.����);
		System.out.println(" �ۼ��� : " + temp.�ۼ��� +
				" �ۼ��� : " + temp.�ۼ��� +
				" ��ȸ�� : " + temp.�ۼ���);
		
		System.out.println(" ���� : " + temp.����);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
