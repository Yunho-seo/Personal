package example08;

public class SmartPhoneRun {
	public static void main(String[] args) {
		
		var smartphone = new SmartPhone("갤럭시", "레드");
		smartphone.WIFI_state = true;
		smartphone.connect_internet();
		smartphone.bell();
		smartphone.send_voice("Hello");
		smartphone.receive_voice("Welcome");
		smartphone.hang_up();
		
		Phone phone = (Phone)new SmartPhone("아이폰", "레드");

		SmartPhone smartphone2 = (SmartPhone)phone;
	}
}
