package Day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day06_3_ȸ��������Ʈ {

	// 1. ����Ʈ ��� 
	// 2. ȸ�� Ŭ���� [ ���̵� , ��й�ȣ ]  : ȸ������ ���� x
	// 3. �޴� 
		// 1. ȸ������ [ �ߺ� ���̵� ���� ] 
		// 2. �α��� 
		// 3. ���� 
	// 4. �α��ν� 
		// 1. ȸ��Ż��
		// 2. ��й�ȣ����
		// 3. �α׾ƿ� 
	

	//Ŭ������ ��ü�� = new ������;
	// 1. ȸ�� : Ŭ������ [ ��ü�� ���� ���赵 ] 
		// 2. temp : ��ü�� [ ������ �̸� ] 
			// 3. new : ��ü ������ �޸� �Ҵ� [ �⺻�ڷ���(ũ�Ⱑ�������ִ�) ���� new ���� ] 
				// 4. ȸ��() : ������ [ ��ü ������ �ʱⰪ ]
	
	// 1.������� �̿��� ��ü���� : ȸ�� temp1 = new ȸ��();
	// temp1.���̵� = ���̵� ;
	// temp1.��й�ȣ = ��й�ȣ;
	// 2.�ʵ带 ���� ������ �̿��� ��ü����  : ȸ�� temp2 = new ȸ��(���̵�, ��й�ȣ);
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// ����Ʈ ���� 
			// List<����Ʈ������Ŭ����> ����Ʈ�� = new ArrayList<>();
		List<ȸ��> ȸ����� = new ArrayList<>();
			// < > : ���׸� 
		while(true) { // ���ѷ��� [ 3�� ���Ḧ �Է��ϸ� ���ѷ��� ���� ] 
			System.out.println(" ------ ȸ���� ���α׷� ------ ");
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				System.out.println(" -----> ȸ������ ȭ�� -----> ");
				System.out.print(" ���̵� : "); 	String ���̵� = scanner.next();
					// ���̵� �ߺ�üũ 
					int �ߺ�üũ = 0;
					for( int i = 0 ; i<ȸ�����.size() ; i++ ) {
								// ����Ʈ��.size() : ����Ʈ�� ��� ��ü���� 
						if( ȸ�����.get(i).���̵�.equals(���̵�) ) {
							// . : ��ü�� Ŭ������ �������
								// .get(�ε���) : �ε�����ġ�� �ش��ϴ� ��� ȣ�� 
							System.err.println("[���] : �̹� ������� ���̵� �Դϴ�" );
							�ߺ�üũ = 1 ; 
						}		
					}
					if( �ߺ�üũ == 0 ) {
						System.out.print(" ��й�ȣ : ");	String ��й�ȣ = scanner.next();
						ȸ�� temp = new ȸ��(���̵�, ��й�ȣ); 	// ȸ�� Ŭ������ �̿��� ȸ�� ��ü ����� 
						ȸ�����.add(temp); // ȸ����ü ����Ʈ�� ���� 
						System.err.println("\n[ȸ������ �Ϸ�] " + ���̵� + "�� ȸ������ �Ǿ����ϴ� ");
					}
			}
			else if( ���� == 2 ) {
				System.out.println(" -----> �α��� ȭ�� -----> ");
				System.out.print(" ���̵� : "); 	String ���̵� = scanner.next();
				System.out.print(" ��й�ȣ : ");	String ��й�ȣ = scanner.next();
				// ������ ���̵� ��й�ȣ �ϰ�� �α��� ó�� 
					//for( Ŭ������ �ӽð�ü�� : ����Ʈ�� )
						// ����Ʈ�� ��Ҹ� �ϳ��� �ӽð�ü ���� 
				int �α���üũ = 0 ;
				for( ȸ�� temp : ȸ����� ) {
					if( temp.���̵�.equals(���̵�) && temp.��й�ȣ.equals(��й�ȣ) ) {
						System.err.println("\n[�α��μ���] " + ���̵� + "�� �α����� �Ǿ����ϴ� ");
						�α���üũ = 1;
						// ��� ȸ�� ���
						System.out.println("\n------------ ȸ����� ------------");
						System.out.println("\t���̵�\t��й�ȣ");
						for( ȸ�� temp2 : ȸ�����) {
							System.out.println("\t"+temp2.���̵� + "\t" + temp2.��й�ȣ);
						}
						// �α��ν� �޴� 
						while( true ) { // �α��ν� �޴��� �ݺ��� ���� [ 3���� �Է������� ���ѷ��� ���� ] 
							System.out.println("1.ȸ��Ż�� 2.��й�ȣ���� 3.�α׾ƿ�");
							int ����2 = scanner.nextInt();
							if( ����2 == 1 ) {
								ȸ�����.remove(temp); // temp : ���� �α��ε� ��ü�� ����� ��ü
								System.out.println("[Ż�𼺰�] ȸ��Ż�� �Ǿ����ϴ�");
								break; // �α��ν� �޴� while Ż�� 
							}
							else if( ����2 == 2 ) {
								System.out.println(" -----> �н����� ���� ȭ�� ");
								System.out.println(" ������ �н����� : "); temp.��й�ȣ =  scanner.next();
								System.out.println("[����Ϸ�] �н����尡 ����Ǿ����ϴ� "); break;
							}
							else if( ����2 == 3 ) { 
								System.err.println("\n[�α׾ƿ�] �α׾ƿ� �մϴ�");
								break;
							}
						}
				
					}
				}
				if( �α���üũ == 0 )	System.err.println("[�α��ν���] ���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			}
			else if( ���� == 3 ) { System.err.println("\n[����] �̿����ּż� �����մϴ�"); break;}
			else { System.err.println("\n[���] �˼� ���� ��ȣ �Դϴ� ");}
		} // while end 
		
		
		
	} // main end 
	
} // class end 
