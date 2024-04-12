package example01;

public class Test {
	
	public static void main(String[] args) {
		
		int[] int_array = {0, 1, 2, 3};
		var value = 10;
		var value2 = 10.3F;
		
		for(int element = 0; element < int_array.length; ++element) {
			System.out.println(element);
		}
		
		for(int element : int_array)
		{
			System.out.println(element);
		}
	}
}
