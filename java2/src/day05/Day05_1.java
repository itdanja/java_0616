package day05;

public class Day05_1 {
	
	public static void main(String[] args) {
		
		
		/*
		 String Ŭ���� : ����Ʈ�� => ���ڿ� ��ȯ Ŭ���� 
			 *�޼ҵ�
			 	1. ���� ���� [ charAt() ] 
				2. ���ڿ� �� [ equals() ] 
				3. ���ڿ� => ����Ʈ [ getBytes() ]
				4. ���� ã�� [ indexOf() ]
				5. ���ڿ� ���� [ length() ] ��ȯ : ���ڼ�
				6. ���ڿ� �߶󳻱� [ substring() ] 
				7. ���ڿ� ���� [ split() ]
				8. ���ڿ� ġȯ [ replace() ]
				9. ��ҹ��� ��ȯ [ toLowerCase() : �ҹ��ں�ȯ  / toUpperCase() : �빮�ں�ȯ ] 
				10. ���ڿ� �յ� ���� ���� [ trim() ]
				11. ���ڿ��� ��ȯ [ valueOf() ] 
		*/
		
		// 5. ���ڿ� ���� [ length() ] ��ȯ : ���ڼ�
		String ���ڿ� = "�ڹ� ���α׷���";
		System.out.println("���ڿ� ���ڼ� : "+���ڿ�.length() );
		
			// ��ȿ���˻� 
			String �ֹε�Ϲ�ȣ = "880420-2554114";
			System.out.println("�ֹε�Ϲ�ȣ ���ڼ� : " + �ֹε�Ϲ�ȣ.length() );
			
			if( �ֹε�Ϲ�ȣ.length() == 14 ) { System.out.println("�ֹε�Ϲ�ȣ�� ���ڼ��� �½��ϴ� ");}
			else {System.out.println("�ֹε�Ϲ�ȣ�� ���ڼ��� �ٸ��ϴ� ");}
		
		// 6. ���ڿ� �߶󳻱� [ substring() ] : �ε�������[��ġ] ���� ���ڿ� �ڸ��� 
			System.out.println( �ֹε�Ϲ�ȣ.substring(7) ); // 7�� �ε������� �ڷ� ��� 
			System.out.println( �ֹε�Ϲ�ȣ.substring(0,6)); // 0 ~ 5 ���� ��� 
			
		// 7. ���ڿ� ���� [ split() ]  : ���ڱ��� ���� ���ڿ� �ڸ��� => ��ȯ : �迭 
			String[] ���ع迭 = �ֹε�Ϲ�ȣ.split("-"); // "-" ���� �������� ���� [ String 2�� => �迭���� ] 
			System.out.println( ���ع迭[0] );
			System.out.println( ���ع迭[1] );
			
		// 8. ���ڿ� ġȯ [ replace() ] : ��ü�ҹ��� , ���ο�� 
			String ���ڿ�2 ="�ڹ� ���α׷���";
			String ��ü���� = ���ڿ�2.replace("�ڹ�", "java");
			System.out.println( "���ڿ� ���� : " + ���ڿ�2 );
			System.out.println( "���ڿ� ��ü�� : " + ��ü���� );
		
		// 9. ��ҹ��� ��ȯ [ toLowerCase() : �ҹ��ں�ȯ  / toUpperCase() : �빮�ں�ȯ ] 
			String ���ڿ�3 = "Java Programming";
			System.out.println(" �ҹ��ڷ� ��ȯ : " + ���ڿ�3.toLowerCase() );
			System.out.println(" �빮�ڷ� ��ȯ : " + ���ڿ�3.toUpperCase() );
			
		// 10. ���ڿ� �յ� ���� ���� [ trim() ] :
			String ���ڿ�4 = "         �ڹ�          ���α׷���      ";
			System.out.println(" �յ� �������� : " + ���ڿ�4.trim() );
			
		// 11. ���ڿ��� ��ȯ [ valueOf() ] 
			int ���� = 10; 		String ���ڿ�5 = String.valueOf(����);
			System.out.println( " ���� ---> ���ڿ�  ��ȯ �� : " + ���ڿ�5);
			
			double �Ǽ� = 10.5;	String ���ڿ�6 = String.valueOf(�Ǽ�);
			System.out.println( " �Ǽ� ---> ���ڿ�  ��ȯ �� : " + ���ڿ�6 );
			
			boolean �� = true;	String ���ڿ�7 = String.valueOf(��);
			System.out.println( " �� ---> ���ڿ�  ��ȯ �� : " + ���ڿ�7 );
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
