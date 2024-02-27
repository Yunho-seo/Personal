package SIT_SEMI_PROJECT.SYH.syh.web;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	Test test = new Test();

	public void ex1() {
		System.out.print("숫자를 입력하세요 >> ");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		String result = test.ex1(number);

		System.out.println(result);
		scanner.close();
	}

	public void ex2() throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("key 값을 입력하세요 >> ");
		String key = scanner.nextLine();

		System.out.print("value 값을 입력하세요 >> ");
		Object value = scanner.nextLine();

		Map<String, Object> Map1 = new HashMap<>();
		Map1.put(key, value);

		System.out.println("맵 : " + Map1);
		System.out.print("JSON : " + test.ex2(Map1));
		scanner.close();
	}

	public void ex3() {
		System.out.print("변수명을 입력하세요 >> ");
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		System.out.println(test.ex3(str));
		scanner.close();
	}

	public void ex4() {
		System.out.println(test.ex4());

	}

	public void ex5() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Map A의 key1 값?");
		String key1 = scanner.nextLine();
		System.out.print("Map A의 key2 값?");
		String key2 = scanner.nextLine();
		System.out.print("Map A의 key3 값?");
		String key3 = scanner.nextLine();


		System.out.print("Map A의 value1값?");
		String value1 = scanner.nextLine();
		System.out.print("Map A의 value2값?");
		String value2 = scanner.nextLine();
		System.out.print("Map A의 value3값?");
		String value3 = scanner.nextLine();

		Map<String, String> Map1 = new HashMap<>();
		Map1.put(key1, value1);
		System.out.println("Map A : " + Map1);


		System.out.print("Map B의 value값?");
		// String value2 = scanner.nextLine();

		Map<String, String> Map2 = new HashMap<>();
		Map2.put(key1, value2);
		System.out.println("Map B : " + Map2);

		System.out.println(test.ex5(Map1, Map2));
		scanner.close();
	}


	public static void main(String[] args) throws Exception {
		TestController tc = new TestController();
		Scanner scanner = new Scanner(System.in);

		System.out.print("테스트 번호(1~5) 입력 >> ");
		int cnt = scanner.nextInt();

		switch(cnt) {
			case 1:
				tc.ex1();
				break;

			case 2:
				tc.ex2();
				break;

			case 3:
				tc.ex3();
				break;

			case 4:
				tc.ex4();
				break;

			case 5:
				tc.ex5();
				break;

			default :
				System.out.println("잘못된 입력입니다.");
		}
		scanner.close();
	}
}
