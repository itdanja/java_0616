package Day08;

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
		
		while(true) { // ���ѷ��� ���� [ 5�� �Է½� ���ѷ��� ���� ] 
			
			Member temp = new Member(); // �� ȸ����ü 
			
			System.out.println("\n[[[[ ȸ���� Ŀ�´�Ƽ ]]]]");
			System.out.println("[[[[ 1. ȸ������  2.�α���  3.���̵�ã�� 4.��й�ȣã�� 5.���� ]]]] ");
			System.out.print("[[[ ����� ��ȣ ���� : ");	int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				int �޼ҵ��� = temp.ȸ������();
				if( �޼ҵ��� == 0 ) System.err.println("\n[[[[ ȸ�����Լ��� : �������ּż� �����մϴ� ]]]] ");
				if( �޼ҵ��� == 1 ) System.err.println("\n[[[[ ȸ�����Խ��� : �ߺ��� ���̵� �����մϴ�(�ڷΰ���) ]]]] ");
				if( �޼ҵ��� == 2 ) System.err.println("\n[[[[ ȸ�����Խ��� : ����ó�� ����[ �����ڿ��� ���� ]  ]]]] ");
			}
			else if( ���� == 2 ) {}
			else if( ���� == 3 ) {}
			else if( ���� == 4 ) {}
			else if( ���� == 5 ) {
				System.err.println("\n[[[[ �̿����ּż� �����մϴ� ]]]]");
				break; // ���ѷ��� ���� 
			}else {}
			
			
		}
		
	}
	
	

}
