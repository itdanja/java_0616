package day02;

public class �ڽ� < �Ű�Ŭ���� > {

	
	private String ������; //
	private �Ű�Ŭ����[] ���;
	
	public �ڽ�( String ������ , int �ο��� ) {
		this.������ = ������;
		��� = (�Ű�Ŭ����[])new Object[�ο���];
	}
	
	public void �߰�( �Ű�Ŭ���� �Ű���ü ) {
		for( int i = 0 ; i<���.length ; i++ ) {
			if( ���[i] == null ) {
				���[i] = �Ű���ü; break;
			}
		}
	}
	
	// get , set
	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public �Ű�Ŭ����[] get���() {
		return ���;
	}

	public void set���(�Ű�Ŭ����[] ���) {
		this.��� = ���;
	}
	

}
