package Day07;

import java.util.Random;
import java.util.Scanner;

public class 캐릭터 {
	
	static Scanner scanner = new Scanner(System.in);
	
	// 1. 필드[ 캐릭터 상태 ] 
	String 캐릭터이름;
	int 레벨;
	int hp;
	int power;
	int 경험치;
	// 2. 생성자 
	public 캐릭터() {
		this.레벨 = 1;
		this.hp = 100;
		this.power = 50;
		this.경험치 = 0;
	}
	// 3. 메소드 
	public void 캐릭터생성() {
		System.out.println("캐릭터이름 : "); 
		String 캐릭터이름 = scanner.next();
		System.out.println("캐릭터가 생성 되었습니다 ");
		this.캐릭터이름 = 캐릭터이름;
	}
	
	public int 몬스터공격() {
		
		Random random = new Random();
		int 공격력 = random.nextInt(power);
					//   0  ~~  power 사이의 난수 발생
		System.out.println("몬스터에게 "+공격력+"만큼 공격!!");
		return 공격력;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
