package example14;

/**
 * non-sealed => 봉인을 해제한다는 의미
 * 자식 클래스를 만들수는 있다.
 */
public non-sealed class Manager extends Person {
	public void work() {
		System.out.println("생산관리하다.");
	}
}
