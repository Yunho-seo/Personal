package example21;

public class Button_Run {
	public static void main(String[] args) {
		Button button_ok = new Button();
		button_ok.setClickListener(()->{	// lambda 형태
			System.err.println("버튼클릭");
		});
		button_ok.click();
		
		Button button_cancel = new Button();
		button_cancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("취소버튼");
			}
		});
		button_cancel.click();
	}
}
