package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	// �ݺ��� : for�� , while�� , do~while��
		// �ʱⰪ : �ݺ��� ���۰�
		// ���ǹ� : �ݺ����� ����[ �������� ]
		// ������ : ���۰��� ���� ���� 
		// for( �ʱⰪ ; ���ǹ� ; ������ ) {  ���๮; }
	
	public static void main(String[] args) {
	
		// for�� 
		for( int ���� = 0 ; ����<10 ; ����++ ) {
			System.out.print( ���� );
			// �ݺ����� ������� 
				// 1. �ʱⰪ �˻� => ���ǹ��˻�[T] => �ڵ� ���� 
				// 2. ������ => ���ǹ��˻�[T] => �ڵ� ���� 
				// 3. ������ => ���ǹ��˻�[T] => �ڵ� ���� 
				// 	~~~~~~~~~~~~~~
				// 4. ������ => ���ǹ��˻�[F] => ���� 
		}
	System.out.println();
	
		// ����1 : 1~50 ���� ��� 
		for( int i = 1 ; i<=50 ; i++ ) { System.out.print(i);}
	System.out.println();
	
		// ����2 : 1~50���� 3�� ���  ��� 
		for( int i = 3 ; i<=50 ; i += 3 ) {System.out.print(i);}
			// ���ã�� : �� % �� == 0 
				// �������� 0 �̸� ���� �� ���� ��� 
	System.out.println();
		for( int i = 1 ; i<=50 ; i++ ) { if( i % 3 == 0 )System.out.print(i); }
	System.out.println();
	
		// ����3 : 1~50���� �����հ�
		int �����հ� = 0 ;
		for( int i = 1 ; i<=50 ; i++ ) { �����հ� += i; }
	System.out.println( "�����հ� : "+ �����հ�);
	
		// ����4 : 1~50���� 3�� ������� �����հ�
		int ����� = 0;
		for( int i = 1 ; i<=50 ; i++ ) { if( i % 3 ==0 ) �����+=i;  }
	System.out.println("3�ǹ���� �հ� : "+�����);
	
		// ����5 : 2�� ������ [ �� : 2(���)  �� : 1~9(����) ] 
		for( int �� = 1 ; ��<10 ; ��++ ) {
			System.out.println( " 2 X "+�� +" = "+(2*��) ); 
		}
		
			// for�� ��ø ���� 
				// for1( ) {    for2(){}   for3(){}  }
				// 
		
		// ����6 : ������ [ �� : 2~9(����)  �� : 1~9(����) ] : ����Ƚ��
						// �� 2 �ϰ��  �� : 1 ~ 9
						// �� 3 �ϰ��  �� : 1 ~ 9
						// �� 4 �ϰ��  �� : 1 ~ 9
		for( int �� = 2 ; ��<=9 ; ��++ ) {
			System.out.println("���� �������� ������ : "+�� +"�� �Դϴ� "); // 9�� ���� 
			
			for( int �� = 1 ; ��<=9 ; ��++ ) {
				System.out.println( �� +" X "+��+" = " + (��*��) ); // 72�� ���� 
			}
		}
		
		// �Է°�ü 
		Scanner �Է°�ü = new Scanner(System.in);
		
		// ����1 : �Է��� ������ŭ ��[*] ��� 
		System.out.print("�� ���� �Է� : ");int ����1 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����1 ; i++ ) { System.out.print("*"); }
		System.out.println();
		
		// ����2 : �Է��� ������ŭ ��[*] ����ϸ鼭 5������ �ٹٲ�
		System.out.print("�� ���� �Է� : "); int ����2 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����2 ; i++ ){
			System.out.print("*");
			if( i % 5 == 0 ) System.out.println(); // i�� 5�� ������� �ٹٲ�
		}
		System.out.println();
		
		// ����3 : �Է��� �� ��ŭ �� �ﰢ�� ���  [ for�� ��ø : for1: �ٹٲ� for2:����� ] 
			/* ��)  6�Է½� 
			 * 					��			��
			 		*			i=1			s = 1
			 		**			i=2			s = 1 2 
			 		***			i=3			s = 1 2 3 
			 		****		i=4			s = 1 2 3 4
			 		*****		i=5			s = 1 2 3 4 5
			 		******		i=6			s = 1 2 3 4 5 6 
			 					i<=�Է°�		s <= i
			 */
		// Ǯ�� 
		System.out.print("[����3]�ټ� �Է� : "); int ����3 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����3 ; i++ ) {
			
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*"); 
			}
			System.out.println(); // �ٹٲ�
		}
		// ����4 : �Է��� �ټ� ��ŭ ��[*] ��� [ for��ø ]
		/*					��		��
		  		*****	i = 1		s = 1 2 3 4 5
		  		****	i = 2		s = 1 2 3 4
		  		***		i = 3 		s = 1 2 3
		  		**		i = 4		s = 1 2
		  		*		i = 5		s = 1
		  				i<=�Է°�		�ִ��ټ�[�Է°�] - �����ټ�[i] + 1
		 */
		// Ǯ�� 
		System.out.print("[����4]�ټ� �Է� : "); int ����4 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����4 ; i++ ) {
			// �����
			for( int s = 1 ; s<=����4-i+1 ; s++) {
				System.out.print("*");
			}
			// �ٹٲ�
			System.out.println();
		}
		// ����5 : for�ټ�() {    for()����{}  for()��{}  }
		/*					i			b					s
		  			*		i = 1 		b = 1 2 3 4 		s = 1
		  		   **		i = 2		b = 1 2 3			s = 1 2
		  		  ***		i = 3		b = 1 2 			s = 1 2 3
		  		 ****		i = 4		b = 1				s = 1 2 3 4
		  		*****		i = 5		b = 				s = 1 2 3 4 5 
		  					i<=�Է°�		�ִ��ټ�[�Է°�]-�����ټ�		s<=i
		 */
		// Ǯ�� 
		System.out.print("[����5]�ټ� �Է� : "); int ����5 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����5 ; i++ ) {
			
			// ������� 
			for( int b = 1 ; b<=����5-i ; b++ ) { System.out.print(" ");}
			// ����� 
			for( int s = 1 ; s<=i ; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
			
		}
		
		// ����6 : for�ټ�() {    for()����{}  for()��{}  }
		/*					i			b				s
		  		 *****  	i = 1	 	b = 			s = 1 2 3 4 5
		  		  ****		i = 2 		b = 1			s = 1 2 3 4
		  		   ***		i = 3 		b = 1 2			s = 1 2 3
		  		    **		i = 4		b = 1 2 3 		s = 1 2
		  		     *		i = 5		b = 1 2 3 4 	s = 1
		  		     					b<=i-1			�ִ��ټ�-�����ټ�+1
		  		     					
		 */
		System.out.print("[����6] �ټ� �Է� : "); int ����6 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����6 ; i++ ) {
			
			// �������
			for( int b =1 ; b<=i-1 ; b++ ) {System.out.print(" "); }
			// ����� 
			for( int s = 1 ; s<=����6-i+1 ; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
			
		}
		
		// ����7 : for�ټ�() {    for()����{}  for()��{}  }
		/*						i			b						S
		  			*			i = 1 		b = 1 2 3 4				S = 1					i*2 = 2 - 1 = 1
		  		   ***			i = 2		b = 1 2 3				S = 1 2 3 				i*2 = 4 - 1 = 3 
		    	  *****			i = 3		b = 1 2					S = 1 2 3 4 5 			i*2 = 6 - 1 = 5
  			 	 *******		i = 4		b = 1					S = 1 2 3 4 5 6 7 		i*2 = 8 - 1 = 7
  			 	*********		i = 5 		b = 					S = 1 2 3 4 5 6 7 8 9	i*2 = 10 - 1 = 9
  			 								�ִ��ټ�[�Է°�]-�����ټ�		S <= i*2-1
		 */
		System.out.print("[����7] �ټ� �Է� : "); int ����7 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����7 ; i++ ) {
			// �������
			for( int b = 1 ; b<=����7-i ; b++ ) { System.out.print(" ");}
			// �����
			for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
			
		}
		// ����8 : for�ټ�() {    for()����{}  for()��{}  }
		/*
		 			1
		 		   222
		 		  33333
		  		 4444444
		  		555555555
		  	   66666666666
		 */
		System.out.print("[����8] �ټ� �Է� : "); int ����8 = �Է°�ü.nextInt();
		for( int i = 1 ; i<=����8 ; i++ ) {
			// �������
			for( int b = 1 ; b<=����8-i ; b++ ) { System.out.print(" ");}
			// �����
			for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print(i);} // �� ��� i ��� 
			// �ٹٲ�
			System.out.println();
		}
		// ����9 : for�ټ�() {    for()����{}  for()��{}  }
		/*				i 		b 				s 
		  	*********	i = 1	b =  			s = 1 2 3 4 5 6 7 8 9		10 - 1
		     *******	i = 2 	b = 1 			s = 1 2 3 4 5 6 7			10 - 3
		      *****		i = 3	b = 1 2			s = 1 2 3 4 5 				10 - 5
		       ***		i = 4	b = 1 2 3		s = 1 2 3					10 - 7
		        *		i = 5	b = 1 2 3 4 	s = 1 						10 - 9
		        				b<=i-1			s <= �ִ��ټ� * 2 - (i*2 -1)
		 */
		// ����10 : for�ټ�() {    for()����{}  for()��{}  }
		/*
		  	 *     *
		  	  *   *
		       * *
		        *
		       * *
		      *   *
		     *     *
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
