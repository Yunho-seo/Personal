package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.get(0);  	// 0번째 객체가져오기
		System.out.println(list.get(0));
	}
}
