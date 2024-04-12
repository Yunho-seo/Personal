package example06;

public class SingletonRun {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		
		if (s1 == s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
