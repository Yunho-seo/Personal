package example03;

public class ComputerRun {
	public static void main(String[] args) {
		Compute compute = new Compute();
		int result = compute.sum(1, 2, 3, 4, 5, 6);
		System.out.println(result);
		
		// int[] values = {1, 2, 3, 4, 5, 6};
		// result = compute.sum(result);
		// System.out.println(result);
	}
}
