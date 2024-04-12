package example;

public class Hello extends Object {
	
	// 필드 혹은 멤버 라고 함 (인스턴스 변수)
	private int age;
	private String name;
	
	public Hello() {	// defalut
		super();
		this.age = 0;
		this.name = "KarL";
	}  
	
	public int get_age() {
		return this.age;
	}
	
	public String get_name() {
		return this.name;
	}
}
