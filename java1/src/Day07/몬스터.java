package Day07;

public class ���� {
	
	// �ʵ� 
	String �����̸�;
	int hp;
	int power;
	int ����ġ;
	
	// ������ 
	public ����() {
		this.�����̸� = "ȣ����";
		this.hp = 100;
		this.power = 50;
		this.����ġ = 10;
	}
	
	public int ����( int ���ط� ) {
		
		System.out.println("������ ���ط� : " + ���ط�);
		this.hp -= ���ط�;
		if( hp < 0 ) {
			System.out.println("���� ó��");
			return this.����ġ;
		}
		System.out.println("������ ���� hp : " + hp);
		return 0;
	}

}
