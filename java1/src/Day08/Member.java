package Day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Member {
	
	// �ʵ� 
		String ���̵� ; 
		String ��й�ȣ ; 
		String �̸� ;
		String �̸���; 
		String ����ó;
		int ����Ʈ;
		String ���;
	// ������ : ��ü ����� �ʱⰪ 
	// �������
	public Member() {
		// TODO Auto-generated constructor stub
	}
	// ����ʵ� ���� ������ 
	public Member(String ���̵�, String ��й�ȣ, String �̸�, String �̸���, String ����ó, int ����Ʈ, String ���) {
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.�̸��� = �̸���;
		this.����ó = ����ó;
		this.����Ʈ = ����Ʈ;
		this.��� = ���;
	}
	// Ư���ʵ常 ���� ������ [ ȸ�����Խ� // ����Ʈ , ��� ����  ] 
	public Member(String ���̵�, String ��й�ȣ, String �̸�, String �̸���, String ����ó) {
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.�̸��� = �̸���;
		this.����ó = ����ó;
			this.����Ʈ = 0 ;		// ����Ʈ,����� �Է¹��� �ʰ� �⺻������ ���� 
			this.��� = "�Ϲ�";
	}
	
	// �޼ҵ� 
	// 1. ȸ������ �ϴ� �޼ҵ� [ �ڵ��� ��Ȱ�� ] 
	public int ȸ������() {
	// �޼ҵ� ���� : ���������� ��ȯŸ�� �޼ҵ��(�μ���,~~ ) { �ڵ� }
	// public : ���� ������ 	
		// int : �޼ҵ� ������ ������ ��ȯ���ִ� Ÿ��
			// ȸ������() : �μ��� ���� �޼ҵ�� 
		System.out.println("\n[[[[ ȸ������ ȭ�� ]]]]");		// �ٸ�Ŭ������ ����� ȣ��� [ Ŭ������.����� ]  
		System.out.print("[[[ ���̵� : ");		String ���̵� = Day08_Start.scanner.next();
			// ���̵� �ߺ�üũ 
			for( Member member : Day08_Start.members  ) {
				// for ����ƮȰ�� 
				// for( Ŭ������ ��ü�� : ����Ʈ�� ) : ����Ʈ�� ��� ��ü�� �ϳ��� ��ü�� ����
				if( member.���̵�.equals(���̵�) ) {
					return 1; // return ���� 1�� ��ȯ��Ű�� �޼ҵ带 ���� [ ���̵� �ߺ� ] 
				}
			}
		System.out.print("[[[ ��й�ȣ : ");		String ��й�ȣ = Day08_Start.scanner.next();
		System.out.print("[[[ �̸� : ");		String �̸� = Day08_Start.scanner.next();
		System.out.print("[[[ �̸��� : ");		String �̸��� = Day08_Start.scanner.next();
		System.out.print("[[[ ����`ó : ");		String ����ó = Day08_Start.scanner.next();
		
		// �����ڸ� �̿��� ��ü ���� 
		Member member = new Member(���̵�, ��й�ȣ, �̸�, �̸���, ����ó);
		
		// ��� ȸ������ �� ȸ���� ����Ʈ�� ��� 
		Day08_Start.members.add(member);
		
		// ���Ͽ� �����ϱ� 
		try { // try { } �ȿ��� ����(����) �߻��� catch �� �̵� 
			
			FileOutputStream fileOutputStream = new FileOutputStream( "c:/java/memberlist.txt");
			for( Member temp : Day08_Start.members ) {
				String �������� = temp.���̵�+","+temp.��й�ȣ+","+temp.�̸�+","+
								temp.����ó+","+temp.�̸���+","+ temp.����Ʈ+","+ temp.���+"\n";
				fileOutputStream.write( ��������.getBytes() );
			}
		} catch (Exception e) { // Exception : ��� ����(����) ���� ó�� 
			return 2;
		}
		
		return 0; // return ���� 0�� ��ȯ��Ű�� �޼ҵ带 ���� [ ȸ������ ���� ] 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}