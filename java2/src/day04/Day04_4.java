package day04;

import java.util.Scanner;

public class Day04_4 {

	public static void main(String[] args) {
		
		
		// String Ŭ����  : ���ڿ� ���� �޼ҵ� �������ִ� Ŭ���� 
			// Ű���� �Է������� => ��Ʈ�� => ���α׷�
				// ��Ʈ��[ �̵����� : ����Ʈ ]
			// ��/Ư������ 1���� : 1����Ʈ // �ѱ�1���� : 2����Ʈ
				// �ƽ�Ű�ڵ� ��� 
			// String Ŭ������ ����Ʈ�� => ���ڿ� ��ȯ �����ִ� Ŭ���� 
			
			byte[] ����Ʈ�迭 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
							 // H ,   e ,    l ,   l ,  o , ���� , J  , a ,  v , a
			String ���ڿ� = new String( ����Ʈ�迭 );
						// new ������( ����Ʈ�迭 ) 
			System.out.println(" ����Ʈ => ���ڿ� : " + ���ڿ� );
			
			////////////////////
			String ���ڿ�2 = new String( ����Ʈ�迭 , 6 , 4 );
			System.out.println(" ����Ʈ => ���ڿ� : " + ���ڿ�2 );
						// new ������( ����Ʈ�迭 , ������ġ , ���� ) 
			/////////////////////
			byte[] ����Ʈ�迭2 = new byte[100];
			
			System.out.println(" �Է� : ");
			try {
				
				System.in.read( ����Ʈ�迭2 ); // ����� ������ ���ܹ߻�
					// system.in : �Է���ġ 
						// read : �о���� => �迭�� ���� 
				String ���ڿ�3 = new String( ����Ʈ�迭2 );
				System.out.println( "�Էµ� ���� : " + ���ڿ�3 );
				
				///////////////////////
				Scanner scanner = new Scanner( System.in );
				String ���ڿ�4 = scanner.next();
				
			}
			catch (Exception e) {
				// TODO: handle exception
			} 
		///////////////////////String ���� ���Ǵ� �޼ҵ� ///////////////////////
			
			// 1. ���� ���� [ charAt ] 
					// ���ڿ����� �ε��� ���� [ ù��° ���ڴ� �ε��� 0 ] 
				String ���ڿ�5 = "�ڹ� ���α׷���";
				System.out.println( ���ڿ�5.charAt(0) );
				System.out.println( ���ڿ�5.charAt(1) );
				System.out.println( ���ڿ�5.charAt(2) );
				System.out.println( ���ڿ�5.charAt(3) );
				
				String �ֹε�Ϲ�ȣ = "880420-1587452";
				char ���� = �ֹε�Ϲ�ȣ.charAt(7);
				
				switch( ���� ) {
					case '1' :
					case '3' :
						System.out.println(" ���� �Դϴ� ");
						break;
					case '2' :
					case '4' :
						System.out.println(" ���� �Դϴ� ");
						break;
				}
			
			// 2. ���ڿ� �� [ equals ] 
			
				String �̸�1 = new String("���缮"); // ��ü ���� 
							// new ���� ���� 
				String �̸�2 = "���缮"; // "���ڿ�" => �޸�
				
				// ���ڿ��� == �񱳿����ڸ� ����Ҽ� ���� 
				if( �̸�1 == �̸�2 ) System.out.println(" �θ��� �̸��� �����ϴ�1 ");
				
				// ���ڿ��� equals ����ؼ� ��ü �� ���� 
				if( �̸�1.equals(�̸�2) ) System.out.println(" �θ��� �̸��� �����ϴ�2 ");
			
			// 3. ���ڿ� => ����Ʈ [ getBytes ]
				String ���ڿ�6 = "�ȳ��ϼ���";
				byte[] ����Ʈ�迭3 = ���ڿ�6.getBytes();
				System.out.println( ����Ʈ�迭3.length );
						// ���� 1����Ʈ , �ѱ� 2����Ʈ 
				String ���ڿ�7 = new String( ����Ʈ�迭3 );
				System.out.println( ���ڿ�7 );
				
				// ���ڵ�[����Ʈ->���ڿ� ���� ��� ]  : EUC-KR , UTF-8
				try {
					byte[] EUC_KR = ���ڿ�7.getBytes("EUC-KR"); // ���ܹ߻� 
					System.out.println(" EUC-KR ���ڵ� �� ���� : " + EUC_KR.length  );
							// ���� 1����Ʈ , �ѱ� 2����Ʈ 
					byte[] UTF_8 = ���ڿ�7.getBytes("UTF-8");
					System.out.println(" UTF-8 ���ڵ� �� ���� : " + UTF_8.length );
							// ���� 1����Ʈ , �ѱ� 3����Ʈ 
					
				}catch (Exception e) {}
			
			// 4. ���� ã�� [ indexof ]
				String ���ڿ�8 ="�ڹ� ���α׷���";
				
				int index =  ���ڿ�8.indexOf("���α׷���");
				System.out.println(" ã�� ������ �ε��� ��ġ : " + index );
				
				Scanner scanner = new Scanner(System.in );
				String �˻��� =  scanner.next();
				
				if( ���ڿ�8.indexOf(�˻���) != -1 ) {
					// -1 : �ε����� ���ٴ� �� [ �ε����� ������ 0���� ]
					System.out.println(" �ش� ���õ� ������ �ֽ��ϴ� ");
				}else {
					System.out.println(" �ش� ���õ� ������ �����ϴ� ");
				}
				
			// 5. ���� ���� [ length ] : ���� �� 
				System.out.println( ���ڿ�8.length() );		
		
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
}
