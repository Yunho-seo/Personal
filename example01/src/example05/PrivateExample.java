package example05;

public class PrivateExample {
	
	private PrivateExample() {
		
	}
	
	private static PrivateExample instance;
	
	public static PrivateExample getInstance() {
		if (instance == null) {
			instance = new PrivateExample();
		}
		return instance;
	}
}
