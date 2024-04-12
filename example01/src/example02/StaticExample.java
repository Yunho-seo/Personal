package example02;

public class StaticExample {
	static int value;
	static {
		value = 10;
	}
	
	static int get_value() {
		return value;
	}
	
	int value2;
	int get_value2() {
		return this.value2;
	}
}
