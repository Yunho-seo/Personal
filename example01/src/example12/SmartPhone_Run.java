package example12;

public class SmartPhone_Run {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("Sagan");
		
//		Phone phone2 = new Phone("");
		phone.connect_internet();
		phone.turn_on();
		phone.turn_off();
		
		Phone phone2 = new Phone("Sagon") {
			@Override
			public void turn_on() {
				System.out.println("POWER ON");
			}
		};
		phone2.turn_on();
		phone2.turn_off();
	
		Phone new_phone = new Phone("sagon") {
			@Override
			public void turn_on() {
				System.out.println("POWER ON");
			}
		};
	}
}
