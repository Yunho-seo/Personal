package example08;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super(model, color);
		this.model = model;
		this.color = color;
		this.WIFI_state = false;
	}
	
	@Override
	public void bell() {
		super.bell();  // 부모 호출
// 		super.hang_up();
		System.out.println("MP3 Bell 울린다.");
	}
	
	public boolean WIFI_state;
	
	public void connect_internet() {
		if(this.WIFI_state) {
			System.out.println("인터넷 연결");
		}
	}
}
