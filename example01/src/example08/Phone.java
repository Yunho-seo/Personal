package example08;

public class Phone extends Object {
	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public Phone() { }
	
	protected String color;
	protected String model;
	
	public void bell() {
		System.out.println("Bell 울린다.");
	}
	
	public void send_voice(String message) {
		System.out.println("본인 " + message);
	}
	
	public void receive_voice(String message) {
		System.out.println("상대 " + message);
	}
	
	public void hang_up() {
		System.out.println("끊다.");
	}
}