package Day10;

public class ����� implements ������ {
	
	int ���� = 0 ;
	
	// �߻�޼ҵ� ������
	@Override
	public void ����() {
		System.out.println("����� ����");	
	}
	@Override
	public void ����() {
		System.out.println("����� ����");	
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
