package example15;

public class Television implements RemoteControl {

	@Override
	public void turn_on() {
		System.out.println("Television On");
	}

	@Override
	public void turn_off() {
		System.out.println("Television Off");
	}
}