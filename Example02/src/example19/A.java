package example19;

public class A {
	class B {
		int field1 = 1;
		static int field2 = 2;
		B() {
			
		}
		void method1() {
			this.field1 = 10;
		}
		
		// static은 static만 볼수있다.
		static void method2() {
			field2 = 3;
		}
	}
	void use_B() {
		B b = new B();
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
}
