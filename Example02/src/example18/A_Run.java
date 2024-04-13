package example18;

public class A_Run {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B c = new A().new B();
	}
}
