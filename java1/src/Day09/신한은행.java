package Day09;

public class �������� extends ���� {
	
	final String �����ڵ� = "101"; // final ������ �����Ұ� => ��� 

	public ��������() {
		super();
	}
	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������, int ���ݾ�) {
		super(���¹�ȣ, ��й�ȣ, ������, ���ݾ�);
	}
	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������) {
		super(���¹�ȣ, ��й�ȣ, ������);
	}
	
	@Override
	public void ���µ��() {
		System.out.println("[[[[ �������� ���µ�� ȭ�� ]]]]");
		System.out.println("[[[ ���¹�ȣ : ");		String ���¹�ȣ = Day09_6.scanner.next();
		System.out.println("[[[ ��й�ȣ : ");		int ��й�ȣ = Day09_6.scanner.nextInt();
		System.out.println("[[[ ������ : ");		String ������ =  Day09_6.scanner.next();
		
		�������� temp = new ��������(���¹�ȣ, ��й�ȣ, ������);
		Day09_6.���¸��.add(temp);
		System.err.println("\n[[[ ���� ]]] : ���� ����� �Ǿ����ϴ� ");
	}
	
	@Override
	public void �Ա�() {
		super.�Ա�();
	}
	@Override
	public void ���() {
		super.���();
	}
	
}
