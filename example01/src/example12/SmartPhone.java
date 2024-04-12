package example12;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	public void connect_internet() {
		System.out.println("인터넷 서핑");
	}
}
