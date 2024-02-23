package SIT_SEMI_PROJECT.SYH.syh.web;

import java.util.Scanner;

// 4. 기존문자열, 추가문자열을 매개변수로 받아서 중복이 없고, 입력된 순서대로 리스트를 생성하는 메서드
// 사과, 배, 포도, 바나나
// 1. 사과 추가	=> [사과]
// 2. 배 추가 		=> [사과, 배]
// 3. 사과 추가	=> [사과, 배]
// 4. 포도 추가	=> [사과, 배, 포도]
// 5. 배 삭제		=> [사과, 포도]
// 6. 배 추가		=> [사과, 포도, 배]

public class Test4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("기존문자열 : ");
		String a = scanner.nextLine();  // String nextLine()
		
		System.out.print("추가문자열 : ");
		String b = scanner.nextLine();
		
		System.out.println(a.concat(b));  // 문자열 병합
		
	}
}
