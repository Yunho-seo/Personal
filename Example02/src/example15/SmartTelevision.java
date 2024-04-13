package example15;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search() {
		System.out.println("Searching");
	}

	@Override
	public void turn_on() {
		System.out.println("Turn On");
	}

	@Override
	public void turn_off() {
		System.out.println("Turn Off");
	}

}
