package SIT_SEMI_PROJECT.SYH.syh.web;

import java.text.DecimalFormat;
import java.util.*;

public class Test {
	
	/**
	 * 1. 숫자 입력받아 세자리마다 ','를 찍어주는 메서드
	 * @param number(숫자)
	 * @return 포맷된 숫자를 리턴
	 */
	public static String ex1(Number number) {
		DecimalFormat num = new DecimalFormat("#,###");
		return num.format(number);
	}
	
	/*
	/**
	 * 2. Map를 입력받아 JSON 형식의 문자열로 리턴하는 메서드
	 * @param str (문자열)
	 * @return JSON 문자열 리턴
	public static String ex2() {
		
		return null;
	}
	*/
	
	/** 
	 * 3. 카멜 표기법을 스네이크 표기법으로 변환하는 메서드
	 * @param str(입력받은 변수)
	 * @return 포맷된 결과를 리턴
	 */
	public static String ex3(String str) {
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
	
	/**
	 * 4. 문자열 받아 순서대로 리스트를 만드는 메서드
	 * @param args
	 * @return 합쳐진 문자열 리턴
	 */
	public static String ex4(String[] args) {
		
		return null;
	}
	
	/*
	/**
	 * 5. Map 혹은 VO 형식의 변수 두개를 받아 key-value 값 비교하여 차이점을 반환하는 메서드
	 * @param 
	 * @return 차이점 리턴
	
	public static String ex5() {
	
		return null;
	}
	*/
	
}
