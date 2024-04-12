package example12;

public abstract class Phone extends Object {
	String name;
	
	public Phone(String owner) {
		super();
		this.name = owner;
	}
	
	public void turn_on() {
		System.out.println("Power on");
	}
	
	public void turn_off() {
		System.out.println("Power off");
	}
}
