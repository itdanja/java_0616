package Day09;

public class Day09_1 {
	
	// ���������� : 
		// public : ������ ������Ʈ�� ��� ������ ���� ���� 
		// protected : ������ ��Ű���� ���� ���� 
			// ���� �ٸ� ����Ŭ������ ����Ŭ������ �ִ� ��Ű���� ���� ���� 
		// default[����]  : ������ ��Ű���� ���� ���� 
		// private : ������ Ŭ������������ ���� ���� 
	
	// Ű���� :
		// final : ������ �������� [ ������ ] 
			// ����� �ʱ�ȭ������ ���� 
		// static : main�޼ҵ� ���� �޸� �Ҵ� [ �������� ] 
			// ���α׷� ���۽� �޸� �Ҵ� 
			// ���α׷� ����� �޸� �ʱ�ȭ 
				// ���α׷� �������� �޸� ���� 
	
	public int ���� = 10;
	protected int ����2 = 20;
	int ����3 = 30;
	private int ����4 = 40;
	
	public final int ����5 = 50; 
	
	public static void main(String[] args) {
		Day09_1 day09_1 = new Day09_1();
		System.out.println( day09_1.���� );
		System.out.println( day09_1.����2 );
		System.out.println( day09_1.����3 );
		System.out.println( day09_1.����4 );	
		day09_1.���� = 100;
		day09_1.����5 = 100; // final ���� �Ұ� 
	}
}
