package example31;

public class Exception_Run {

	public static void main(String[] args) {
		String str = "Java";
		string_length(str);
		str = null;
		string_length(str);
	}
	
	private static void string_length(String str) {
		try {
			int length = str.length();
			System.out.println("문자열길이: " + length);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}