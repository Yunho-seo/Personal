package SIT_SEMI_PROJECT.SYH.syh.web;

// 1. 입력받은 숫자 혹은 문자열(숫자)에 대해서 세자리 마다 , 를 찍어 주는 메서드

import java.text.*;
import java.util.Scanner;

public class Test1 {
	
	public static String ex1(Number number) {
		
		DecimalFormat num = new DecimalFormat("#,###");
		return num.format(number);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // 값 입력받기 (scanf)
		System.out.print("숫자 입력하세요 > ");
		
		int x = scanner.nextInt();  // int형으로 입력받기
		String a = ex1(x);
		
		System.out.println(a);
		scanner.close();
	}
}