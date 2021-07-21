package day02;

public class 코스 < 매개클래스 > {

	
	private String 과정명; //
	private 매개클래스[] 목록;
	
	public 코스( String 과정명 , int 인원수 ) {
		this.과정명 = 과정명;
		목록 = (매개클래스[])new Object[인원수];
	}
	
	public void 추가( 매개클래스 매개객체 ) {
		for( int i = 0 ; i<목록.length ; i++ ) {
			if( 목록[i] == null ) {
				목록[i] = 매개객체; break;
			}
		}
	}
	
	// get , set
	public String get과정명() {
		return 과정명;
	}

	public void set과정명(String 과정명) {
		this.과정명 = 과정명;
	}

	public 매개클래스[] get목록() {
		return 목록;
	}

	public void set목록(매개클래스[] 목록) {
		this.목록 = 목록;
	}
	

}
