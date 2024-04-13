package example15;

public class RemoteControl_Run {
	
	public static void main(String[] args) {
		RemoteControl remotecontrol;
		remotecontrol = new Television();
		remotecontrol.turn_on();  // 텔레비전이 켜짐
		remotecontrol = new Audio();
		remotecontrol.turn_on();  // 오디오가 켜짐
	}
}
