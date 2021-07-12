package Day09;

public class 학생 extends 사람 {
	int 학년;
	public 학생() {
		super();
	}
	public 학생(String 이름, int 나이) {
		super(이름, 나이);	
	}
	@Override
	public void 정보() { 
		super.정보();
		System.out.println("학생의 이름 : " + 이름 ); 
	}
	
	
	
	
}
