package Day03;

import java.util.Scanner; // import : �ش� Ŭ���� �������� 

public class Day03_1 {

	// ���� [ ������ ���� ] : �ڷ���(�޸�ũ��) , �ּҰ�(�޸���ġ) 
	// �Է� [ Scanner Ŭ���� ] : import java.util.Scanner
	// ������ 
		// ��������� : +���ϱ� -���� *���ϱ� /������ %������
		// �񱳿����� : >=�̻� >�ʰ� <=���� <�̸� ==���� !=�����ʴ� 
		// �������� : &&�̸鼭 ||�̰ų�	!����
		// ���Կ����� : = ����(�����ʰ��� �������� ����)
				// += ( �����ʰ��� ���ʿ� ���ϱ����Ŀ� ���ʿ� ���� )
				//  -=   *=   %=
				// a = a+3		a += 3
		// ���������� 
				// ++ : 1 ���� 
				// -- : 1 ���� 
	
	public static void main(String[] args) {

		// ��� [ ����� : if ]
			// ~~ ���࿡ ~~ ���� ������ Ȥ�� Ʋ���� 
			// ����  if( T/F )
				// 1. if( T/F ) ���๮;
				// 2. if( T/F ) { ���๮1; ���๮2; }
				// 3. if( T/F ) {  T�� ���๮; }
 				//	  else{   F�� ���๮; }
				// 4. if( T/F ) 
				// 	  else if( T / F )
				//	  else if( T / F )
				// 	  else 
		
		// 1. �Է� ��ü ����� 
		Scanner scanner = new Scanner(System.in);
	
/*		
		// ����1
		if( 3 > 1 ) System.out.println("3��ũ��");
			// T ----------------> ���� 
		if( 3 > 5 ) System.out.println("3��ũ��2");
			// F -----------------> ����X
System.out.println("---------------------------");
		// ����2 
		if( 3 > 1 ) {
			System.out.println("�� �Դϴ�");
			System.out.println("3�� ũ��");
		}
System.out.println("---------------------------");		
		// ����3 
		if( 3 > 5 ) System.out.println("3�� ũ��");
		else System.out.println("5�� ũ��");
System.out.println("---------------------------");			
		//����4 :
		if( 3 > 5 ) System.out.println("3�� 5���� ũ�� ");
		else if( 3 > 4 ) System.out.println("3�� 4���� ũ�� ");
		else if( 3 > 3 ) System.out.println("3�� 3���� ũ�� ");
		else if( 3 > 2 ) System.out.println("3�� 2���� ũ�� ");
		else System.out.println("TRUE �� ���� ");
System.out.println("---------------------------");	

		// ����5 : ������ �Է¹޾� 80���̻��̸� �հ� / �ƴϸ� Ż�� 
			
			// 2. �Է¹��� ��ü�� ������ ������ ���� 
					// .nextInt() : �Է°�ü���� ���빰 ��������
			System.out.print("�����Է�:");
			int ���� = scanner.nextInt();
			// 3. ���� 
			if( ���� >= 80 ) System.out.println("�հ�");
			else System.out.println("Ż��");
System.out.println("---------------------------");				
		// ����1 : �ϳ��� ������ �Է¹޾� 90���̻��̸� A��� 80���̻��̸� B��� 70���̻��̸� C��� �׿ܴ� Ż�� ��� 
			// 0. �Է� ��ü ����� => �� �ڵ忡 �Է°�ü�� ������ ����X
			System.out.print("����2�Է�");
			int ����2 = scanner.nextInt();
			
			if( ����2 >= 90 )		System.out.println("A���");
			else if(����2>=80)	System.out.println("B���");
			else if(����2>=70)	System.out.println("C���");
			else 				System.out.println("Ż��");
System.out.println("---------------------------");				
		// ����2 : ������ ������ �Է¹޾� �����̸鼭 90�� �̻��̸� A-1Ŭ���� ���
								// �����̸鼭 90�� �̻��̸� A-2Ŭ���� ��� 
								// �����̸鼭 80�� �̻��̸� B-1Ŭ���� ��� 
								// �����̸鼭 80�� �̻��̸� B-2Ŭ���� ��� 
								// �׿� CŬ���� ��� 
			System.out.print("���� �Է� : ");	String ���� = scanner.next();
			System.out.print("����3 �Է� : ");	int ����3 = scanner.nextInt();
			// ���ڿ� : String �� �񱳿����� ����Ҽ� ���� 
				// ���ڿ� �񱳸޼ҵ� :   ���ڿ�1.equals(���ڿ�2) 
			if( ����.equals( "����" ) ) {
				if( ����3 >= 90 )System.out.println("A-1Ŭ����");
				else if( ����3>=80 )System.out.println("B-1Ŭ����");
				else System.out.println("CŬ����");
			}else {
				if( ����3 >= 90 )System.out.println("A-2Ŭ����");
				else if( ����3>=80 ) System.out.println("B-2 Ŭ����");
				else System.out.println("CŬ����");
			}
			
System.out.println("---------------------------");	

		//����3 
			System.out.println("����1 : "); int ����1 = scanner.nextInt();
			System.out.println("����2 : "); int ����2 = scanner.nextInt();
			if( ����1 > ����2 ) System.out.println(����1 +" �� �� ũ�� ");
			else System.out.println(����2 +" �� �� ũ�� ");
*/
		//����4 
		System.out.print("����1 : "); int ����1 = scanner.nextInt();
		System.out.print("����2 : "); int ����2 = scanner.nextInt();
		System.out.print("����3 : "); int ����3 = scanner.nextInt();
		
		if( ����1 > ����2 && ����1 > ����3 ) System.out.println(����1 +" �� �� ũ�� ");
		else if( ����2 > ����1 && ����2 > ����3 ) System.out.println(����2 +" �� �� ũ�� ");
		else if( ����3 > ����1 && ����3 > ����2 ) System.out.println(����3 +" �� �� ũ�� ");
		else System.out.println(" ��� �����ϴ� ");
		
		
			

		
			
			
		
	
			
			
			
		
			
			
			
			
			
			





	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
