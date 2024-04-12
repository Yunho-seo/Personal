package example02;

public class StaticExampleRun {
	public static void main(String[] args) {
		var example = new StaticExample();
		example.get_value2();
		int result = StaticExample.value;
		StaticExample.get_value();
	}
}
