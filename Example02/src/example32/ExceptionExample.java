package example32;

public class ExceptionExample {

	public static void main(String[] args) {
		String [] strings = new String[] {"100", "1OO", "1A0F"};
		try {
			find_exception(strings);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		for(int i=0; i<=strings.length; ++i) {
			int value = Integer.valueOf(strings[i]);
			System.out.println(value);
		*/
			/*
			try {
				int value = Integer.valueOf(strings[i]);
				System.out.println(value);
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			*/
		}
		
		private static void find_exception(String[] args) throws Exception {
			for(int i=0; i<=args.length; ++i) {
				int value = Integer.valueOf(args[i]);
				System.out.println(value);
		}
	}
}