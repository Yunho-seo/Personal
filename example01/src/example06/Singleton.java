package example06;

public class Singleton {
	private static Singleton instance;
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
