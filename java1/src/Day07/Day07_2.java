package Day07;

import java.util.Scanner;

public class Day07_2 {
	
	// static : �������� : ���α׷� ���������� ���Ǵ� �޸�
		// �� : ���α׷� ���۽� main�޼ҵ庸�� �޸� �켱�Ҵ� 
			// ���� : �޸𸮰� ���α׷� ����ñ��� �Ҵ�Ǳ⶧���� �ӵ� ������ 
	
	public static void main(String[] args) {
		
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("--- �޴� ---- ");
			System.out.println(" 1. ĳ���� ���� ");
			System.out.println(" 2. ����� ���� ");
			System.out.println(" 3. ���� ���� ");
			
			ĳ���� ĳ���� = new ĳ����();
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				ĳ����.ĳ���ͻ���();
			} 
			if( ���� == 2 ) {
				
				System.out.println(" ���� ���� ");
				���� ���� = new ����();
				System.out.println(" ����Ƚ�� : ");
				int ����Ƚ�� = scanner.nextInt();
				
				for( int i = 0 ; i<����Ƚ�� ; i ++  ) {
					ĳ����.����ġ +=  ����.����( ĳ����.���Ͱ���() );
				}
				
				System.out.println(" ����ġ : " + ĳ����.����ġ);
				
				
			} 
			if( ���� == 3 ) {} 
			
			
			
		}
		
		
	}

}
