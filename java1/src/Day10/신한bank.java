package Day10;

import Day09.��������;

public class ����bank extends ���� {
	
	// �ʵ�
	int �����ڵ� = 123;
	
	public ����bank() { super(); }
	public ����bank( String ���¹�ȣ , int �ݾ�) {
		super(���¹�ȣ, �ݾ�);
	}
	@Override
	public void �޴�() {
		super.�޴�();
	}
	
	@Override
	public void ���µ��() {
		
		System.out.println(" [[[ �������� ���� ��� ]]] ");
		System.out.println(" ���¹�ȣ ");
		String ���¹�ȣ = Day10_5.scanner.next();
		
		//  ����bank ����bank = new ����bank(���¹�ȣ, 0);
		Day10_5.���¸��.add( new ����bank(���¹�ȣ, 0));
	
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		super.����();
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		super.���();
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		super.��ü();
	}@Override
	public void �ܰ�() {
		// TODO Auto-generated method stub
		super.�ܰ�();
	}
	
	

}
