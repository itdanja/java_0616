package Day10;

public class Day10_1 {

	// ����ó�� : ���� �߻��� ������ �ٸ��ڵ�� ó�� ��� 
		// ���� : ����ġ���� ������ �߻��� => ����Ŭ������ �ش� ���������� �����ϰ� ó�� 
		// ���� : 
		//	1. try{ �����߻� �����ڵ� }
		//	   catch(����Ŭ���� ��ü��){ �����߻��� ��ü�ڵ� }
		//	   finally{ ������ ����Ǵ� �ڵ� }
		// Ŭ���� :
			// 1. ���ܸ� �˰� �ִ°�� 
				// 1. ArrayIndexOutOfBoundsException
				// 2. NullPointerException
				// 3. NumberFormatException
			// 2. ���ܸ� �𸣴°��
				// 1. Exception [ ����Ŭ���� ]
			
	public static void main(String[] args) {
		
		//��1 ) �迭/������ �ڸ��� �����Ұ�� => ���� �߻� 
		try { // try{  } ���� ���� �߻��ÿ� catch{} �� �̵� 
			int[] �迭 = new int[3];
			�迭[0] = 10;
			�迭[1] = 20;
			�迭[2] = 30;
			�迭[4] = 40;	// �����߻� => catch �̵�
		}catch( ArrayIndexOutOfBoundsException e  ){
				// [���ܹ߻���]����Ŭ���� ��ü��[����]
			System.out.println(" ���� �߻� : " + e);
		}
		
		//��2) ������ null �ΰ�� ��ü������½� => ���� �߻� 
		try {
			String data = null;
			System.out.println( data );
			System.out.println( data.toString() ); // ��ü��.toString() : ��ü�� �����޼ҵ� 
		}catch (NullPointerException e) {
			System.out.println(" ���� �߻� : " + e);
		}
		
		//��3) ���� => ���� // ���� => ���� �� ��ȯ�� => ���� �߻� 
		try {
			String data1 = "100";
			String data2 = "a100";
			System.out.println( Integer.parseInt(data1) ); // Integer.parseInt(���ڿ�);  ���ڿ� => ���ڿ� 
			System.out.println( Integer.parseInt(data2) );
		}
		catch (NumberFormatException e) {
			System.out.println(" ���� �߻� : " + e);
			System.out.println("���ڰ� ���Ե� ���ڴ� ���ڷ� ��ȯ�Ҽ� �����ϴ�");
		}
		
		// ��4) ��� ���ܸ� ó�����ִ� Ŭ���� Exception
		try {
			// 1. 
			int[] �迭 = new int[3];
			�迭[0] = 10;
			�迭[1] = 20;
			�迭[2] = 30;
			�迭[4] = 40;	// �����߻� => catch �̵�
			// 2. 
			String data = null;
			System.out.println( data );
			System.out.println( data.toString() ); // ��ü��.toString() : ��ü�� �����޼ҵ� 
			// 3.
			String data1 = "100";
			String data2 = "a100";
			System.out.println( Integer.parseInt(data1) ); // Integer.parseInt(���ڿ�);  ���ڿ� => ���ڿ� 
			System.out.println( Integer.parseInt(data2) );
		}
		catch (Exception e) {
			System.out.println("[[�����߻�]] : " + e);
		}
		finally { // ������ ����Ǵ� �ڵ� [ ���ܹ߻� ���� ������� ] .
			System.out.println("[[�ڵ� ����]]");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
