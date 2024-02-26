// import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DecimalFormat;
import java.util.*;

// import org.apache.tiles.request.collection.KeySet;

public class Test {
	
	/**
	 * 1. 숫자 입력받아 세자리마다 ','를 찍어주는 메서드
	 * @param number 숫자
	 * @return 포맷된 숫자를 리턴
	 */
	public static String ex1(Number number) {
		DecimalFormat num = new DecimalFormat("#,###");
		
		return num.format(number);
	}
	
	/**
	 * 2. Map를 입력받아 JSON 형식의 문자열로 리턴하는 메서드
	 * 라이브러리 사용하지 않고 구현. jackson/gson .... (X)
	 * 
	 * @param 입력받은 map
	 * @return JSON 문자열 리턴
	 */
	/*
	public static String ex2(Map<String, Object> map) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(map);  // map 타입 -> JSON형식
	}
	*/
	
    /* 
	public static String ex2(Map<String, Object> map) throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		return objectMapper.writeValueAsString(map);
	}
    */
	
	
	/** 
	 * 3. 카멜 표기법을 스네이크 표기법으로 변환하는 메서드
	 * 
	 * ++ 역순 ==> 스네이크가 들어오면 카멜
	 * 카멜이 들어오면 스네이크
	 * 스네이크 결과값은 UPPER CASE
	 * 
	 * 
	 * @param str 입력받은 변수
	 * @return 포맷된 결과를 리턴
	 */
	public static String ex3(String str) {
		String result = "";
		
		// 원본 소스
		/*
		 * char c = str.charAt(0); // 첫번째 글자 변환
		 * result += Character.toLowerCase(c); //
		 * 소문자로 (첫번째글자)
		 */
		
		
		char c = str.charAt(0);
		
		// 버퍼 소스
		StringBuffer sb = new StringBuffer();
		sb.append(Character.toLowerCase(c));
		
		
		// ==> 원본 소스와 버퍼 소스는 완전히 동일한 기능을 한다.
		
		// result = result + Character.toLowerCase(c);
		
		/*
		for (int i=1; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {  // ch 문자열에 대문자가 있다면.
				result += '_';				 // 언더바 추가하고
				result += Character.toLowerCase(ch);  // 언더바 다음 문자를 소문자로 바꾸기
			} else {  // 대문자 없다면
				result += ch;
			}
		}
		*/
		
		// 문자열에 대해 반복문 돌면서 변환하는 로직
		for (int i=0; i<=str.length(); i++) {
			if(i == 0) {
				// 원본 소스
				char c = str.charAt(0);  			 // 첫번째 글자 변환
				result += Character.toLowerCase(c);  // 소문자로 (첫번째글자)
			} else {
				char ch = str.charAt(i);
				
				if(Character.isUpperCase(ch)) {  // ch 문자열에 대문자가 있다면.
					result += '_';				 // 언더바 추가하고
					result += Character.toLowerCase(ch);  // 언더바 다음 문자를 소문자로 바꾸기
				} else {  // 대문자 없다면
					result += ch;
				}
			}
		}
		return result;
	}
	
	/**
	 * 4. 문자열 받아 순서대로 리스트를 만드는 메서드
	 * @param LinkedHashSet 데이터
	 * @return 합쳐진 문자열 리턴
	 */
	public static LinkedHashSet<String> ex4() {
		Scanner scanner = new Scanner(System.in);
	    LinkedHashSet<String> list = new LinkedHashSet<>();
	
	    while (true) {
	        System.out.println("번호 입력하세요");
	        System.out.println("1:데이터추가, 2:데이터삭제, 3:종료");
	        
	        int cnt = scanner.nextInt();
	        scanner.nextLine();
	
	        switch (cnt) {
	            case 1:
	                System.out.print("데이터 입력하세요 >> ");
	                String input = scanner.nextLine();
	                
	                list.add(input);
	                System.out.println(list);
	                break;
	            case 2:
	                System.out.print("삭제할 데이터 입력하세요 >> ");
	                String output = scanner.nextLine();
	                
	                if (list.remove(output)) {
	                    System.out.println("데이터가 삭제되었습니다.");
	                } else {
	                    System.out.println("입력한 데이터가 없습니다.");
	                }
	                
	                System.out.println(list);
	                break;
	            case 3:
	                scanner.close();
	                System.exit(0);
	            default:
	                System.out.println("잘못된 입력입니다.");
	        }
	    }
	}
	
	//공백검증
	//1. value1 == '';
	//2. value1.equals('');
	//3. ''.equals(value1);
	
	/**
	 * 5. Map 혹은 VO 형식의 변수 두개를 받아 key-value 값 비교하여 차이점을 반환하는 메서드
	 * 
	 * dataSet 무조건 1인 경우는 없으니까,
	 * 여러개일 경우도 한번 해주세요.
	 * 
	 * ex) Map a {k1=v1, k2=v2, k3=v3 .....}
	 * ex) Map b {k1=v1, k2=v2, k3=v3 .....}
	 * ==> 키 k1 에 대해 값이 k1 에서 k2로 바뀌었고, 키 k2에 대해 값이 v2에서 v3로 바뀌었고 ....
	 * 
	 * @param 
	 * @return 차이점 리턴
	 */
	public static List<String> ex5(Map<String, String> map1, Map<String, String> map2) {
		List<String> result = new ArrayList<>();
		Set<String> keys = new HashSet<>(map1.keySet());
		
		for (String key : keys) {
			String value1 = map1.get(key);  // value1에 해당하는 key값 가져오기
        	String value2 = map2.get(key);	// value2에 해당하는 key값 가져오기
		
        /*
		for (Map.Entry<String, String> entry : map1.entrySet()) {  // 반복문 돌리기
	        String key = entry.getKey();
	        String value1 = entry.getValue();  // map1에서 값 가져오기 -> value1 
	        String value2 = map2.get(key);	   // map2에서 같은 키에 해당하는 값 가져오기-> value2
	        
	        if (value1 != null && !value1.equals(value2)) {
	            // value1 값이 있으며 value2과 다름
	        	System.out.println("키 " + key + "에 대해 값이 " + value1 + "에서 " + value2 + "로 바뀌어졌습니다");
	        }
         */  
        	if (!value1.equals("") && !value2.equals("") && !value1.equals(value2)) {  // .equals (비교)
	            // value1, 2 값이 있으며 value1과 다름
	        	System.out.println("키 " + key + "에 대해 값이 " + value1 + "에서 " + value2 + "로 바뀌어졌습니다");
	        }
	       
	        else {
	        	System.out.println("Map A, B의 value가 같습니다.");
	        }
		}
		return result;
	}
}
