package Day06;

import java.util.Scanner;

public class Day06_2_ȸ�����迭 {
	
	// 1. 2�����迭 ��� 
	// 2. ȸ�� [ ���̵� , ��й�ȣ ] �ִ� 100����� ȸ������ ���� 
	// 3. �޴� 
		// 1. ȸ������ [ �ߺ� ���̵� ���� ] 
		// 2. �α��� 
		// 3. ���� 
	// 4. �α��ν� 
		// 1. ȸ��Ż��
		// 2. ��й�ȣ����
		// 3. �α׾ƿ� 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. �迭 ���� [ 100���� ȸ���� ���̵�� ��й�ȣ ]
			// 100�� => 100�� ��  // ���̵� , ��й�ȣ => 2��
		String[][] ȸ����� = new String[100][2];
		while(true) { // ���ѷ��� [ 3�� ���Ḧ �Է��ϸ� ���ѷ��� ���� ] 
		
			System.out.println(" ------ ȸ���� ���α׷� ------ ");
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				// �Է¹ޱ� 
				System.out.println(" -----> ȸ������ ȭ�� -----> ");
				System.out.print(" ���̵� : "); 	String ���̵� = scanner.next();
				
				// �̹� �迭�� ������ ���� ������� �ߺ����� 
				int �ߺ�üũ = 0 ; // �⺻���� 0
				for( int i = 0 ; i<ȸ�����.length ; i++ ) {
					if( ȸ�����[i][0] !=null && ȸ�����[i][0].equals(���̵�) ) {
						System.err.println("[���] : �̹� ������� ���̵� �Դϴ�" );
						�ߺ�üũ = 1; // ������ ���̵� ������ 1
					}
				}
				if( �ߺ�üũ ==0 ) { // �ߺ�üũ 0 �̸� �ߺ��� ����
					// �迭 ���� 
					System.out.print(" ��й�ȣ : ");	String ��й�ȣ = scanner.next();
					for( int i = 0 ; i<ȸ�����.length ; i++ ) {
							// i�� 0���� ȸ����� �迭�� �����[100] ��ŭ 1�� �����ϸ鼭 �ݺ�
						if( ȸ�����[i][0] == null ) {
							ȸ�����[i][0] = ���̵�;
							ȸ�����[i][1] = ��й�ȣ;
							break;
						}
					}
				}
			} // ���� 1�� if�� end 
			else if( ���� == 2 ) {
				System.out.println(" -----> �α��� ȭ�� -----> ");
				System.out.print(" ���̵� : "); 	String ���̵� = scanner.next();
				System.out.print(" ��й�ȣ : ");	String ��й�ȣ = scanner.next();
				
				// ������ ���̵� ��й�ȣ �ϰ�� �α��� ó�� 
				int �α���üũ = 0;
				for( int i = 0 ; i<ȸ�����.length ; i++ ) {
					if( ȸ�����[i][0] !=null && ȸ�����[i][0].equals(���̵�) && ȸ�����[i][1].equals(��й�ȣ) ) {
						System.err.println("[�α��μ���] " + ���̵� + "�� �α����� �Ǿ����ϴ� ");
						�α���üũ = 1;
						
						// ��� ȸ�� ���
						System.out.println("\n------------ ȸ����� ------------");
						System.out.println("\t���̵�\t��й�ȣ");
			
						for( int j = 0 ; j<ȸ�����.length ; j++ ) {
							if(  ȸ�����[j][0] !=null ) System.out.println("\t"+ȸ�����[j][0] + "\t" + ȸ�����[j][1]);
						}
						
						// �α��ν� �޴� 
						while( true ) { // �α��ν� �޴��� �ݺ��� ���� [ 3���� �Է������� ���ѷ��� ���� ] 
							System.out.println("1.ȸ��Ż�� 2.��й�ȣ���� 3.�α׾ƿ�");
							int ����2 = scanner.nextInt();
							if( ����2 == 1 ) {
								// i �� �α��ε� ȸ���� ����ġ
								ȸ�����[i][0] = null;
								ȸ�����[i][1] = null;
								// ������ �ε��� �ڷ� �ε��� ��ĭ�� ���� 
								for( int h = i ; h<ȸ�����.length ; h++ ) {
									
									if( ȸ�����[h+1][0] != null ) { // ������ ȸ�� �ڷ� ���� ȸ���� ������ 
										ȸ�����[h][0] = ȸ�����[h+1][0];
										ȸ�����[h][1] = ȸ�����[h+1][1];
									}
									else { // ������ ȸ���̸� 
										ȸ�����[h][0] = null;
										ȸ�����[h][1] = null;
										break; // ���� ����� �ݺ��� Ż��
									}
								}
								System.out.println("[Ż�𼺰�] ȸ��Ż�� �Ǿ����ϴ�");
								break; // �α��ν� �޴� while Ż�� 
							}
							else if( ����2 == 2 ) {
								// i : ���� �α��ε� ȸ���� ����ġ
								System.out.println(" -----> �н����� ���� ȭ�� ");
								System.out.println(" ������ �н����� : "); ȸ�����[i][1] =  scanner.next();
								System.out.println("[����Ϸ�] �н����尡 ����Ǿ����ϴ� "); break;
							}
							else if( ����2 == 3 ) { 
								System.err.println("[�α׾ƿ�] �α׾ƿ� �մϴ�");
								break;
							}
						}
					}
				}
				if( �α���üũ == 0 ) {
					System.err.println("[�α��ν���] ���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			}
			else if( ���� == 3 ) { System.err.println("\n[����] �̿����ּż� �����մϴ�"); break;}
			else { System.err.println("\n[���] �˼� ���� ��ȣ �Դϴ� ");}
		} // while end
	} // main end 
	
	
	
	
	
	
	
	
	
	
} // class end 
