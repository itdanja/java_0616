package Day10;

public class ���� implements ATM {

	// �ʵ� 
	String ���¹�ȣ;
	int �ݾ�;
	// ������ 
	public ����() { }
	public ����( String ���¹�ȣ , int �ݾ� ) {
		this.���¹�ȣ=���¹�ȣ;  this.�ݾ�=�ݾ�;
	}
	// �߻�޼ҵ� ������ 
	@Override
	public void �޴�() {
		while(true) {
			System.out.println(" [[[ �޴� ]]] ");
			System.out.println("1.���µ�� 2.���� 3.��� 4.��ü 5.�ܰ� 6.����");
			int ���� = Day10_5.scanner.nextInt();
			if(���� == 1 ) { ���µ��(); }
			if(���� == 2 ) { ����();}
			if(���� == 3 ) { ���(); }
			if(���� == 4 ) { ��ü(); }
			if(���� == 5 ) { �ܰ�(); }
			if(���� == 6 ) { return;}
		}
	}
	@Override
	public void ���µ��() {
	}
	@Override
	public void ����() {

	}@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}@Override
	public void �ܰ�() {
	}
	

}
