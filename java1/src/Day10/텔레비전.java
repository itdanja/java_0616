package Day10;

public class �ڷ����� implements ������ {
	
	int ���� = 0;
	
	// �߻�޼ҵ带 ������[ override ]
	@Override
	public void ����() {
	
		System.out.println("�ڷ����� ����");
		
	}
	@Override
	public void ����() {
		System.out.println("�ڷ����� ����");
		
	}
	@Override
	public void ��������(int ����) {
		
		if( ���� > ������.�ִ���� ) {
			���� = ������.�ִ����;
		}else if( ���� < ������.�ּҼ��� ) {
			���� = ������.�ּҼ���;
		}else {
			this.���� = ����;
		}
		
	}

}
