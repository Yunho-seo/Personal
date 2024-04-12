package example14;

/**
 * final - 자식 클래스를 더이상 만들 수 없다는 의미
 */
public final class Employee extends Person {
	public void work() {
		System.out.println("생산하다.");
	}
}
