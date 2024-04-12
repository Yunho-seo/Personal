package example05;

public class PrivateExampleRun {
	public static void main(String[] args) {
		
		// private이기에 외부에서 호출할 수 없다...
		// PrivateExample private = new privateExample()
		
		PrivateExample private1 = PrivateExample.getInstance();
		PrivateExample private2 = PrivateExample.getInstance();
		PrivateExample private3 = PrivateExample.getInstance();
		
		if(private1 == private2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
