package Day10;

public interface 키오스크 {
	
	// 추상메소드 : 선언o정의x
	public void 메뉴();
	public void 장바구니();
	public void 결제();
	
	// default 메소드  : 선언o정의o
	public default void 종료() {
		System.out.println("[[[키오스크 종료]]]");
	}
	

}
