package example21;

public class Button {
	public static interface ClickListener {
		public void onClick();
	}
	
	private ClickListener click_listener;
	
	public void setClickListener(ClickListener listener) {
		this.click_listener = click_listener;
	}
	
	public void click() {
		this.click_listener.onClick();
		
	}
}