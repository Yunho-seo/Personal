package example20;

public class A {
	public void method1(final int arg) {
		final int value = 1;
		
		class B {
			void method2() {
				System.out.println(arg);
				System.out.println(value);
			}
			
//			arg = 2;
//			value = 2;
		}
	}
}