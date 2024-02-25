package SIT_SEMI_PROJECT.SYH.syh.web;

import java.util.HashMap;
import java.util.Map;

// 5. Map 혹은 VO 형식의 매개변수를 두 개를 받아, 두 Map 혹은 VO의 Key값과 Value 값을 비교하여 차이점을 문자열로 반환하는 메서드
/* 먼저 받는 매개변수가 더 이전의 상태이다.
 * ex1) 
 * Map<String, String1> A : {"a" : "a'"}
 * Map<String, String1> B : {"a" : "c'"}
 * ==> 맵A와 맵B가 키a에 대해서 다르다.
 * ==> 키a에 대해서 값이 a'에서 c'으로 변경되었다.
 * 
 * :: 구조가 같은 두 매개변수를 과거 -> 현재 순서로 어떤 값이 어떻게 바뀌었는지 문자열로 반환한다.
 * */

public class Test5 {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
	}
}
