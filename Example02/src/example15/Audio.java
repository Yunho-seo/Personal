package example15;

public class Audio implements RemoteControl {

	@Override
	public void turn_on() {
		System.out.println("Audio On");
	}

	@Override
	public void turn_off() {
		System.out.println("Audio Off");
	}
	

}
