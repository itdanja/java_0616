package Day09;

public class ���� {
	// 1. �ʵ� [ ���� ]
	String ���¹�ȣ; 
	int ��й�ȣ; 
	String ������;
	int ���ݾ�;
	// 2. ������ [ ��ü ������ �ʱⰪ ] 
		// ������� 
	public ����() {}
		// ���µ�Ͻ� ������ 
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.���ݾ� = 0 ;
	}
		// ��� �ʵ带 ���� ������ 
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������, int ���ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.���ݾ� = ���ݾ�;
	}

	// 3. �޼ҵ� [ �ൿ 1.��Ȱ�� 2.�μ�,��ȯ �� ]
	public void ���µ��() { // �Է� => ���� ���� => ��ü ���� => ����Ʈ ���� 
		System.out.println("[[[[ ���µ�� ȭ�� ]]]]");
		System.out.print("[[[ ���¹�ȣ : ");		String ���¹�ȣ = Day09_6.scanner.next();
		System.out.print("[[[ ��й�ȣ : ");		int ��й�ȣ = Day09_6.scanner.nextInt();
		System.out.print("[[[ ������ : ");		String ������ =  Day09_6.scanner.next();
		
		���� temp = new ����(���¹�ȣ, ��й�ȣ, ������);
		Day09_6.���¸��.add(temp);
		System.err.println("\n[[[ ���� ]]] : ���� ����� �Ǿ����ϴ� ");
	}
	public void �Ա�() {
		
	}
	public void ���() {
	}
	public void ��ü() {
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
