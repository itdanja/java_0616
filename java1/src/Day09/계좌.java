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
	public void �Ա�() { // ���¹�ȣ,��й�ȣ => ��ġ�ϸ� => �Աݾ� => ���� 
				
		int ��� = ����ã��();
		if( ��� == -1 ) {
			System.out.println("[[[[ ������ ���°� ������ �����ϴ� ]]]]");
			return;
		}else {
			System.out.print("[[[ �Աݾ� : ");	int �Աݾ� = Day09_6.scanner.nextInt();
			Day09_6.���¸��.get(���).���ݾ� += �Աݾ�;
			System.out.println("[[[[ ����ó���� �Ǿ����ϴ� ]]]]");
		}
	}
	public void ���() {
		int ��� = ����ã��();
		if( ��� == -1 ) {
			System.out.println("[[[[ ������ ���°� ������ �����ϴ� ]]]]");
			return;
		}else {
			System.out.print("[[[ ��ݾ� : ");	int ��ݾ� = Day09_6.scanner.nextInt();
			// ���ݺ��� ��ݾ� �� ū��� ���ó�� x 
			if( Day09_6.���¸��.get(���).���ݾ� < ��ݾ� ) { 
				System.out.println("[[[[ ������ �����մϴ� ]]]]");
				return;
			}
			Day09_6.���¸��.get(���).���ݾ� -= ��ݾ�;
			System.out.println("[[[[ ���ó���� �Ǿ����ϴ� ]]]]");
		}
	}
	public void ��ü() {
		
	}
	public int ����ã��() {
		// return ��ȯ�Ǵ� ������ Ÿ�� 
		
		System.out.print("[[[ ���¹�ȣ : ");	String ���¹�ȣ = Day09_6.scanner.next();
		System.out.print("[[[ ��й�ȣ : ");	int ��й�ȣ = Day09_6.scanner.nextInt();
		
		int ã������ = -1;
		for( ���� temp : Day09_6.���¸��  ) {
			// for( �ӽð�ü : ����Ʈ�� ) : ����Ʈ�� ��� ��ü����ŭ �ӽð�ü�� �ϳ��� ���� 
			ã������++;
			if( temp.���¹�ȣ.equals(���¹�ȣ) && temp.��й�ȣ==��й�ȣ ) {
				// ���� ���¹�ȣ/��й�ȣ��  ��� ���� �Էµ� ����/��й�ȣ�� �����ϸ� 
				return ã������; // return : �޼ҵ� ��ȯ / �޼ҵ� ���� 
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
