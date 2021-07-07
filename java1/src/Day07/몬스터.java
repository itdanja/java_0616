package Day07;

public class 몬스터 {
	
	// 필드 
	String 몬스터이름;
	int hp;
	int power;
	int 경험치;
	
	// 생성자 
	public 몬스터() {
		this.몬스터이름 = "호랑이";
		this.hp = 100;
		this.power = 50;
		this.경험치 = 10;
	}
	
	public int 피해( int 피해량 ) {
		
		System.out.println("몬스터의 피해량 : " + 피해량);
		this.hp -= 피해량;
		if( hp < 0 ) {
			System.out.println("몬스터 처지");
			return this.경험치;
		}
		System.out.println("몬스터의 남은 hp : " + hp);
		return 0;
	}

}
