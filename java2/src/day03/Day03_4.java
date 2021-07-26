package day03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Day03_4 {

	
	public static void main(String[] args) {
		
		
		// Map �÷���  :  <Ű , ��>���� �̷���� �ѽ�  = ��Ʈ�� 
					// �ε��� ���� 
			// 1. hashMap : ����ȭx [ ���Ͻ�����]
			// 2. hashTable : ����ȭo [ ��Ƽ������ ] 
				// �޼ҵ� 
					// 1. .put( Ű , �� ) : �ϳ��� ��Ʈ�� �߰� 
					// 2. .size() : ��Ʈ�� ���� 
					// 3. .get(Ű) : �ش��ϴ� Ű�� �� 
					// 4. .remove(Ű) : �ش��ϴ� Ű�� ��Ʈ�� ���� 
					// 5. .keySet() : map�� �����ϴ� ��� Ű�� set �÷������� ȣ��
						// .values() : ��� �� ȣ�� 
					// 6. .clear() : ��� ��� ���� 
		// 1. ���� 
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		// 2. ��ü �߰� 
		hashMap.put("���缮" , 80 );
		hashMap.put("��ȣ��" , 70 );
		hashMap.put("�ŵ���" , 60 );
		
		// 3. ��� 
		System.out.println( hashMap );
		// 4. �� 
		System.out.println( hashMap.size() );
		// 5. ȣ��[�˻�]
		System.out.println( hashMap.get("��ȣ��") );
		// 6. ���� 
		hashMap.remove("��ȣ��");
		System.out.println( hashMap.get("��ȣ��") );
		
		//7. ��� Ű Ȯ�� 
		System.out.println( hashMap.keySet() );
		// ��� �� Ȯ�� 
		System.out.println( hashMap.values() );
		
		for( String key : hashMap.keySet() ) {
			System.out.println( hashMap.get(key) );
		}
		
		hashMap.clear();
		
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("���缮", 80);
		hashtable.put("��ȣ��", 70);
		hashtable.put("�ŵ���", 60);
		
		System.out.println( hashtable );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
