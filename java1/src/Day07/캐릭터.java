package Day07;

import java.util.Random;
import java.util.Scanner;

public class ĳ���� {
	
	static Scanner scanner = new Scanner(System.in);
	
	// 1. �ʵ�[ ĳ���� ���� ] 
	String ĳ�����̸�;
	int ����;
	int hp;
	int power;
	int ����ġ;
	// 2. ������ 
	public ĳ����() {
		this.���� = 1;
		this.hp = 100;
		this.power = 50;
		this.����ġ = 0;
	}
	// 3. �޼ҵ� 
	public void ĳ���ͻ���() {
		System.out.println("ĳ�����̸� : "); 
		String ĳ�����̸� = scanner.next();
		System.out.println("ĳ���Ͱ� ���� �Ǿ����ϴ� ");
		this.ĳ�����̸� = ĳ�����̸�;
	}
	
	public int ���Ͱ���() {
		
		Random random = new Random();
		int ���ݷ� = random.nextInt(power);
					//   0  ~~  power ������ ���� �߻�
		System.out.println("���Ϳ��� "+���ݷ�+"��ŭ ����!!");
		return ���ݷ�;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
