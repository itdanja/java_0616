package Day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day07_3 {
	
	// main �ۿ� �ۼ��ϴ� ���� : main �޼ҵ� �ܿ����� ���Ǵ� ��� [ �ٸ� Ŭ������ ��밡�� ] 
	public static Scanner scanner = new Scanner(System.in);
	
	// ����Ʈ ���� : <Ŭ����>  <> �ȿ� ���� ��ü�� ������ �����Ҽ��ִ� �Խù���� ����Ʈ 
	public static List<�Խù�> �Խù���� = new ArrayList<>();
		// ����Ʈ��.add( ��ü�� ) : �ش簴ü�� ����Ʈ�� �߰� 
		// ����Ʈ��.get( �ε�����ȣ ) : �ش� �ε��� ��ȣ�� ��ü ȣ�� 
			// �ε��� : ����Ʈ��[ ����� ����  = 0������ ] 
	public static void main(String[] args) {
		
		while(true ) {
			
			System.out.println(" -----------------------> Ŀ�´�Ƽ --------------------> ");
				
				�Խù�.�Խù����();	
				
			System.out.println("1.��� 2.�󼼺���");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				�Խù�.�Խù����();
			}
			if( ���� == 2 ) { // �Խù��� ��ȣ�� �Է¹޾� �ش� �Խù��� ��� ������ ��� 
				System.out.println("---> �Խù� ��ȣ ���� : ");
				int �Խù���ȣ = scanner.nextInt();
				�Խù�.�Խù��󼼺���(�Խù���ȣ);
			}
		
			
		}
		
		
	}

}
