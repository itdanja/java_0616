package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_3_ƽ���� {
	
	public static void main(String[] args) {
		
		// 1.�� ���� => String 9���� �����Ҽ� �ִ� �迭 ����� �ʱⰪ 
		String[] ������ = {	"[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]"  };
		Scanner scanner = new Scanner(System.in);
		String �¸��� = ""; // �¸��� �� 
		
		while( true ) { // ���ѷ��� [ ��� �����ǿ� ���� �ΰų� �¸��ڰ� ���ð�� ���� ] 
			// 2.�� ��� 
			for( int i = 0 ; i<������.length ;i++ ) {
				System.out.print( ������[i]);
				// 3������ �ٹٲ� [ �ε��� : 2 5 8  ] 
				if( i % 3 == 2 ) System.out.println();
			}
			
				// �����¸���
				if( �¸���.equals("[O]")) {
					System.out.println("[ �÷��̾� �¸� ]");
					break;
				}
				if( �¸���.equals("[X]")) {
					System.out.println("[ ��ǻ�� �¸� ]");
					break;
				}
				
			// 3. �ڸ��� �Է¹޾� �ش� �ڸ��� �� �α� 
				while( true ) { // ���ѷ��� [ �÷��̾ 0 ~ 8 ������ ���� �Է½� �ǰų� Ȥ�� �������� ���� �ξ����� ���� ]
					System.out.print("��ġ���� [ 0~8 ] : ");	int �÷��̾� = scanner.nextInt();
					// 1. 0 ~ 8 ���̸� �Է¹ޱ� ���� => �ٽ� �Է¹ޱ� 
					if( �÷��̾� < 0 || �÷��̾� > 8 ) {
						System.out.println("[�˼����� ��ȣ �Դϴ�]");
					}else {
						// 2. �̹� �� �ڸ��� �ٽ� �Է¹ޱ� ����
						if( !������[�÷��̾�].equals("[ ]") ) {
							System.out.println("[�̹� ���� �����ϴ� ��ġ �Դϴ�]");
						}else {
							������[�÷��̾�] = "[O]"; // �Է¹��� �ε��� ��ġ�� ���� ����]
							break; // �������� �� �� �ξ����� ���ѷ��� ���� 
						} // else end
					} // else end 
				} // while2 end 
				
						int �˼� = 0;
						// ��� �ڸ��� ���� ������� ���� ���� 
						for( int i = 0  ; i<9 ; i++ ) {
							if( !������[i].equals("[ ]") ) �˼�++;
						}
						if( �˼� == 9 ) {
							// 2.�� ��� 
							for( int i = 0 ; i<������.length ;i++ ) {
								System.out.print( ������[i]);
								// 3������ �ٹٲ� [ �ε��� : 2 5 8  ] 
								if( i % 3 == 2 ) System.out.println();
							}
							System.out.println("[��� ���� �� �ξ����ϴ� [���º�] ]");
							break;
						}
			
			// 4. ��ǻ�ʹ� 0~8 ������ ���� ���� �ؼ� �� �α� [X]
				// �� 0~8 ���̸� ���� ���� �ϰ� �̹� ���ڸ����� �ٽ� ���� �����ؼ� �α� 
				while( true ) { // ���ѷ��� [ ��ǻ�Ͱ� �������� ���� �ξ����� ���� ]
					Random random = new Random(); // ���� ���� ��ü 
					int ��ǻ�� = random.nextInt(9);
								// .nextInt() : ���� ���� �������� [ 0 ~ int ǥ�� �� ]
								// .nextInt(10) : 0 ~ 9 ������ ���� 
								// .nextInt( 9 ) : 0 ~ 8 ������ ���� 
					if( ������[��ǻ��].equals("[ ]") ) {
						������[��ǻ��] ="[X]"; break;
					}
				} // while3 end 
			
			// 5. �¸� ����
				
				// 1. ���η� �̱�¼�[ 0 1 2 , 3 4 5 , 6 7 8 ]
				for( int i = 0 ; i<=6 ; i+=3 ) {
					if( ������[i].equals( ������[i+1]) && ������[i+1].equals(������[i+2]) ) {
						if( !������[i].equals("[ ]") ) �¸��� = ������[i]; 
						// ��� �����Ѱ�� �¸��� ���� �� �ֱ� 
					}
				}	
				// 2. ���η� �̱�¼�[ 0 3 6 , 1 4 7 , 2 5 8 ]
				for( int i = 0 ; i<=2 ;i++ ) {
					if( ������[i].equals(������[i+3]) && ������[i+3].equals( ������[i+6]) ) {
						if( !������[i].equals("[ ]") ) �¸��� = ������[i]; 
					}
				}
				// 3. �밢�� �̱�¼� [ 0 4 8 , 2 4 6 ]
					// ����~~~
				
				
		} // while end
	} // main end
} // class end 
