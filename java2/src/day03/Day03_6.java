package day03;

import java.util.HashMap;
import java.util.Scanner;

public class Day03_6 {

	/*
	����2 : �Խ���
		[ ���Ժ��� �Խù��ۼ� ] �޴� 
		����1 : �Խù�[map] ����(string) , ����(string)
		����2 : ȸ��[ map ] ���̵�[string] , ��й�ȣ[string]
	
		����3 : �ΰ��� map�� ��� �ִ� map ���� 
	*/
	


	public static void main(String[] args) {
		
		// �������� map ��� map
		HashMap<String, HashMap<String, String >> maplist = new HashMap<String, HashMap<String,String>>();
		
		// �Խù� 
		HashMap<String , String > boardmap = new HashMap<>();
		// ȸ�� 
		HashMap<String, String> membermap = new HashMap<String, String>();
		
		
		maplist.put("member", membermap);
		maplist.put("board", boardmap );
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(" ���� map ��Ȳ : " + maplist );
			System.out.println(" ���� ȸ�� ��� :  " + maplist.get("member"));
			System.out.println(" ���� �Խù� ��� :  " + maplist.get("board"));
			
			System.out.println("1.ȸ���߰� 2.�۾��� "); int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				System.out.println("���̵� "); 	String id = scanner.next();
				System.out.println("��й�ȣ "); String pw = scanner.next();
				
				maplist.get("member").put(id, pw);
				
			}
			if( ch == 2 ) {
				System.out.println("���� "); 	String title = scanner.next();
				System.out.println("���� "); String password = scanner.next();
				
				maplist.get("board").put(title, password);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
