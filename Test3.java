package SIT_SEMI_PROJECT.SYH.syh.web;

import java.util.Scanner;

// 3. 카멜 표기법을 스네이크 표기법으로 바꿔주는 메서드
// userName -> user_name
public class Test3 {
	
	public static String trans(String str) {
		String result = "";
		
		char c = str.charAt(0);  			 // 첫번째 글자 변환
		result += Character.toLowerCase(c);  // 소문자로 (첫번째글자)
		// result = result + Character.toLowerCase(c);
		
		for (int i=1; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {  // ch 문자열에 대문자가 있다면.
				result += '_';				 // 언더바 추가하고
				result += Character.toLowerCase(ch);  // 언더바 다음 문자를 소문자로 바꾸기
			} else {  // 대문자 없다면
				result += ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("변수명 입력하세요 > ");
		
		String str = scanner.nextLine();
		System.out.println(t.trans(str));
		
		scanner.close();
	}
}
