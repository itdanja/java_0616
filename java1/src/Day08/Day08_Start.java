package Day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day08_Start {
	
	// ȸ���� �Խ��� 
		// ����ó�� 
		// Ŭ���� : ȸ�� , �Խ��� 
		// ��ü���� : ����Ʈ 
	
	// main�ۿ� �����ϴ� ���� : ���� Ŭ������ �ٸ� Ŭ�������� ȣ���ϱ� ���� 
	public static Scanner scanner = new Scanner(System.in);
	// public : ���������� : ������ ������Ʈ�� ��𼭵� ȣ�� ���� 
		// static : main ���� ���� ����Ǳ� ������ main���� �켱�Ҵ� [ ���α׷� ����� �ʱ�ȭ ]
	
	// Member ��ü �������� ������ �ִ� List ��ü [ ArrayList Ŭ���� �̿��� list ��ü ]
	public static ArrayList<Member> members = new ArrayList<>();
		// ����Ʈ��.add(��ü��) : ����Ʈ�� ��ü ��� 
	
	public static void main(String[] args) {
		
		// ���α׷� ���۽� �������Ʈ�� �ִ� ���Ͽ� ��� ��� �о���� => ����Ʈ ���� 
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/java/memberlist.txt");
				// fileInputStream : ���� �Է� Ŭ���� 
			byte[] ����Ʈ = new byte[1024];  //1024byte => 1kb
			
			fileInputStream.read( ����Ʈ ); // ��� ����Ʈ �о�ͼ� => �迭�� ���� 
	
			// 1. ��� ȸ�� ������ ����Ʈ => ���ڿ� 
			String ��� = new String( ����Ʈ );
			
			// 2. �Ѹ� ȸ�� �и� [ ���ڿ�.split( �и���ȣ ) ] : �Ѹ� ȸ������ ������ �迭�� ���� 
			String[ ] temp = ���.split("\n"); // \n�������� ���� => �迭�� ���� 
			
			for( int i = 0 ; i<temp.length -1 ; i++ ) {	// �迭��-1
				
				String[] string2 =  temp[i].split(","); // �Ѹ��� ȸ���� ������ ���� ��Ű��
				Member member = new Member(string2[0] , string2[1], string2[2], 
							string2[3], string2[4], Integer.parseInt(string2[5]), string2[6]);
									// ���ڿ� ----> ���ڿ� 
									// Integer.parseInt(���ڿ�)  ===> ���� 
				members.add(member); // ����Ʈ�� ��� 
				
			}
		} catch (Exception e) { // Exception : ��� ���ܸ� ó�����ִ� Ŭ���� : Exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) { // ���ѷ��� ���� [ 5�� �Է½� ���ѷ��� ���� ] 
			
			Member temp = new Member(); // �� ȸ����ü 
			
			System.out.println("\n[[[[ ȸ���� Ŀ�´�Ƽ ]]]]");
			System.out.println("[[[[ 1. ȸ������  2.�α���  3.���̵�ã�� 4.��й�ȣã�� 5.���� ]]]] ");
			System.out.print("[[[ ����� ��ȣ ���� : ");	int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				int �޼ҵ��� = temp.ȸ������();
				if( �޼ҵ��� == 0 ) System.err.println("\n[[[[ ȸ�����Լ��� : �������ּż� �����մϴ� ]]]] ");
				if( �޼ҵ��� == 1 ) System.err.println("\n[[[[ ȸ�����Խ��� : �ߺ��� ���̵� �����մϴ�(�ڷΰ���) ]]]] ");
			}
			else if( ���� == 2 ) {
				int �޼ҵ��� = temp.�α���();
				if( �޼ҵ���== 0 ) System.err.println("\n[[[[ �α��μ��� : �ȳ��ϼ��� ]]]] ");
				if( �޼ҵ���== 1 ) System.err.println("\n[[[[ �α��ν��� : �������� �ʴ� ���̵� �Դϴ�  ]]]] ");
				if( �޼ҵ���== 2 ) System.err.println("\n[[[[ �α��ν��� : ��й�ȣ�� �ٸ��ϴ�  ]]]] ");
			}
			else if( ���� == 3 ) {}
			else if( ���� == 4 ) {}
			else if( ���� == 5 ) {
				System.err.println("\n[[[[ �̿����ּż� �����մϴ� ]]]]");
				break; // ���ѷ��� ���� 
			}else {}
		}
	}
}
