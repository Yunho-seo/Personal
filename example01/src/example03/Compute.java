package example03;

public class Compute {
	public int sum(int ... values) {
		int sum = 0;
		for (var value : values) {
			sum += value;
		}
		return sum;
	}
}
