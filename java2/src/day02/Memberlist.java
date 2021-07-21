package day02;

public class Memberlist<T> {
	
	private String name;
	private T[] list;
	
	public Memberlist(String name) {
		this.name = name;
		list = (T[])new Object[10];
	}
	
	// 목록에 추가 
	public void add( t t ) {
		for( int i = 0 ; i<list.length ; i++ ) {
			if( list[i] == null ) {
				list[i] = t;
				break;
			}
		}
	}
	// get , set 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getList() {
		return list;
	}

	public void setList(T[] list) {
		this.list = list;
	}
	
	
	
	
	

}
