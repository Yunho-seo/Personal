package example14;

/**
 * Person의 자식 클래스는 Employee, Manager 클래스만 상속 가능하다는 의미 (permits)
 */
public sealed class Person permits Employee, Manager {
	public String name;
	
	public void work() {
		System.out.println("일을 하다.");
	}
}
