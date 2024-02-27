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
	
	public void ex2() {
		Scanner scanner = new Scanner(System.in);
		
		// 맵(Map) 만들기
        Map<String, Object> map = new HashMap<>();
        
        while (true) {
            System.out.print("key 값을 입력하세요 (종료는 'exit'입력) >> ");
            String key = scanner.nextLine();

            // equalsIgnoreCase : Java에서 문자열을 비교
            if ("exit".equalsIgnoreCase(key)) {
                break;
            }

            System.out.print("value 값을 입력하세요 >> ");
            Object value = scanner.nextLine();

            map.put(key, value);
        }
        
		// 출력하기
		System.out.println("맵 : " + map);
		System.out.print("JSON : " + test.ex2(map));
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
		Map<String, String> map1 = new HashMap<>();
		map1.put("seo", "25");
		map1.put("kim", "25");
		map1.put("lee", "26");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("seo", "24");
		map2.put("kim", "26");
		map2.put("lee", "27");
		
		System.out.println(map1);
		System.out.println(map2);
		Map<String, String> diff = test.ex5(map1, map2);
		
		/*=
		System.out.print("Map B의 value값?");
		// String value2 = scanner.nextLine();
		
		Map<String, String> Map2 = new HashMap<>();
		Map2.put(key1, value2);
		System.out.println("Map B : " + Map2);
		
		System.out.println(test.ex5(Map1, Map2));
		scanner.close();
		*/
	}
	
	
	public static void main(String[] args) {
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
