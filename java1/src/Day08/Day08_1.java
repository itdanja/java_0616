package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day08_1 {
	
	// ����ó�� : java ���� �� �ٸ� ���� �ٷ�� 
		// ��Ʈ�� : �������α׷��� �ܺ���ġ ���� �� [ ������ ��� ] 
			// ��Ʈ�� ��� ���� : ����Ʈ 
				// �뷮���� : bit[0Ȥ��1] -> byte[8bit] -> kbyte -> mbyte
		// FileOutputStream : ���� �������� 
				// .write( ����Ʈ�迭 ) 
		// FileInputStream : ���� �о���� 
				// .read( ����Ʈ�迭 ) 
	
	public static void main(String[] args) throws Exception {
		
		// 1. ���� ���� 
		FileOutputStream outputStream = new FileOutputStream("c:/java/test.txt"); // ���� ���� �ۼ� 
		// ��ü ���� 
		// FileOutputStream : ���� ���Ŭ���� 
			// outputStream : ��ü�� ( ���� �̸� )
				// new : ��ü �޸� �Ҵ� 
					// FileOutputStream( ) : ������ ( ��ü ����� �ʱⰪ )
		
		// 2. ���� ���� 
		String ���� = "java�Դϴ�"; // ���ڿ� �������� �Ұ�
			// ���ڿ�.getBytes() : ���ڿ� ---> ����Ʈ�� 
		outputStream.write( ����.getBytes() );  // ���ڿ��� ����Ʈ�� ������ 
			// ��Ʈ��.write( ����Ʈ�� ) ; // ���ڿ� �������� 
		
		// 3. �Է°� ���� 
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Ͽ� �ۼ��� ���� �Է� : ");				String ����2 = scanner.nextLine();	// nextLine : �������� �Է¹ޱ� 
		outputStream.write( ����2.getBytes() );
		
		// 4. �̾�� 
		outputStream = new FileOutputStream( "c:/java/test.txt" , true ); // true : �������� ������� �̾��
		System.out.println(" �̾�� ���Ͽ� �ۼ��� ���� �Է� : ");		String ����3 = scanner.nextLine();	// nextLine : �������� �Է¹ޱ� 
		outputStream.write( ����3.getBytes() );
		
		// 5. �ٹٲ� �� 
		String ù��°�� = "\n \\ ";
		outputStream.write(ù��°��.getBytes());
		
		// 6. ���� �о���� 
		FileInputStream inputStream = new FileInputStream("c:/java/test.txt");
			// �Է½�Ʈ���� �о�ö� ����Ʈ ���� 
		byte[] ����Ʈ�迭 = new byte[1000]; // ����Ʈ 1000�� �����Ҽ� �ִ� �迭 
		
		inputStream.read(����Ʈ�迭); // �о�� ����Ʈ�� ����Ʈ�迭�� �����ϱ� 
		
		System.out.println(" ----- ���ϳ� �ؽ�Ʈ ��� ----- ");
		System.out.println( new String(����Ʈ�迭)); // ����Ʈ�� ---> ���ڿ� ��ȯ 
		
		// ���� : 
			// ȸ������ : ���̵�� ��й�ȣ �Է¹޾� ���Ͽ� �����ϱ� 
			// ������ �Է��� ���̵�� ��й�ȣ�� �ֿܼ� ����ϱ� 
		
		FileOutputStream outputStream2 = new FileOutputStream("c:/java/test2.txt"); // ���� ���� �ۼ� 
		
		System.out.println("���̵� �Է�: "); String ���̵� =  scanner.next();
		System.out.println("��й�ȣ �Է�: ");String ��й�ȣ = scanner.next();
		String ȸ��1 = ���̵� +","+��й�ȣ+"\n"; // ���̵�� ��й�ȣ�� ������ ���ڿ� [ ���� ,  ] 
		
		outputStream2.write( ȸ��1.getBytes() );
		outputStream2.write( ȸ��1.getBytes() );
		outputStream2.write( ȸ��1.getBytes() );
		outputStream2.write( ȸ��1.getBytes() );
		outputStream2.write( ȸ��1.getBytes() );
		outputStream2.write( ȸ��1.getBytes() );
		
		FileInputStream inputStream2 = new FileInputStream("c:/java/test2.txt" );
		byte[] ����Ʈ�迭2 = new byte[1000];
		
		inputStream2.read(����Ʈ�迭2);
		System.out.println( new String(����Ʈ�迭2));

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
