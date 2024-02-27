package SIT_SEMI_PROJECT.SYH.syh.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tiles.request.collection.KeySet;
import java.text.DecimalFormat;
import java.util.*;

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
	
	// JSON 형식 : {"key" : "value"}
	
	/*
	// jackson.databind 라이브러리 사용하여 구현
	public static String ex2(Map<String, Object> map) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(map);  // map 타입 -> JSON형식
	}
	*/
	// 라이브러리 사용하지 않고 구현해보기
	/*
	public static String ex2(String key, Object value) {
	    StringBuffer sb = new StringBuffer();
	    
	    sb.append("{");
	    sb.append("\"").append(key).append("\":\"").append(value).append("\"");
	    sb.append("}");
	    return sb.toString();
	}
	*/
	public static String ex2(Map<String, Object> map) {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        
        boolean firstEntry = true;  // 첫번째 쌍 있다면..
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!firstEntry) {  // 여러 데이터 쌍을 ','로 구분짓기
                sb.append(",");
            }
            sb.append("\"").append(entry.getKey()).append("\":\"").append(entry.getValue()).append("\"");
            firstEntry = false;
        }

        sb.append("}");

        return sb.toString();
    }
	
	
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
	
	/*
	public static String ex3(String str) {
		StringBuffer sb = new StringBuffer();
		
		boolean camel = str.contains("_");
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == '_') {	// 언더바있으면 --> 스네이크
				camel = true;
			} else if (camel && Character.isUpperCase(ch)) {
				if (i > 0) {
					sb.append('_');
				}
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(ch);
			}
		}
		
		if (!camel && sb.indexOf("_") != -1) {
	        // Convert to camel case
	        String[] parts = sb.toString().split("_");
	        sb.setLength(0);
	        sb.append(parts[0]);
	        for (int i = 1; i < parts.length; i++) {
	            sb.append(Character.toUpperCase(parts[i].charAt(0)))
	                  .append(parts[i].substring(1));
	        }
	    }

	    return sb.toString();
	}
	*/
	
	/*
	// 카멜 <-> 스네이크 표기법
	public static String ex3(String str) {
	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);

	        if (Character.isUpperCase(ch)) {  // 대문자라면
	            if (i > 0) {				  // 대문자가 첫번째 글자가 아니면..
	                sb.append('_');			  // '_' 추가
	            }
	            sb.append(Character.toLowerCase(ch));  // '_' 추가 후 대문자를 소문자로
	        } else {
	            sb.append(ch);  // 이외의 경우에는 그대로 문자열에 추가한다.
	        }
	    }

	    return sb.toString();  // 내부 메서드 (출력)
	}
	*/
	
	/*
	public static String ex3(String str) {
	    StringBuffer sb = new StringBuffer();
	    boolean camel = str.contains("_");    // "_" 있는지 없는지 검사
	     
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);

	        if (Character.isUpperCase(ch)) {  // 대문자라면
	            if (i > 0) {				  // 대문자가 첫번째 글자가 아니면..
	                sb.append('_');			  // '_' 추가
	            }
	            sb.append(Character.toLowerCase(ch));  // '_' 추가 후 대문자를 소문자로
	        } else {
	            sb.append(ch);  // 이외의 경우에는 그대로 문자열에 추가한다.
	        }
	    }

	    return sb.toString();  // 내부 메서드 (출력)
	}
	/*
	
	
	/*
	 *  스네이크 -> 카멜
	 */
	
	/*
		public static String ex3(String str) {
		  	if (str.indexOf('_') < 0 && Character.isLowerCase(str.charAt(0))) {
		  		return str;
		  	}  // '_'가 없으며, 앞자리가 소문자 => 카멜 표기법
		  	
			StringBuffer sb = new StringBuffer();
		    boolean camel = false;
	
		    for (int i = 0; i < str.length(); i++) {
		        char ch = str.charAt(i);
	
		        if (ch == '_') {		// 현재 문자가 '_'일떄
		            camel = true;
		        } else if (camel) {		// 대문자로 변환하여 sb에 추가 (true)
		            sb.append(Character.toUpperCase(ch));
		            camel = false;
		        } else {
		            sb.append(ch);
		        }
		    }
	
		    return sb.toString();
		}
	*/
	
	// 통합
	public static String ex3(String str) {
        if (str.contains("_")) {	// 변수에 "_"가 있는지 체크 / 스네이크 -> 카멜
            String[] part = str.split("_");  // "_" 기준으로 나누기
            StringBuffer sb = new StringBuffer(part[0]);
            
            for (int i=1; i<part.length; i++) {
                sb.append(Character.toUpperCase(part[i].charAt(0))).append(part[i].substring(1));
                // 분리 단어 첫 글자를 대문자로
                // parts[i].substring(1) => 첫글자만 제외하고 가져오기 ==> append로 병합
            }
            return sb.toString();
        
        } else {	// 카멜 -> 스네이크
        	StringBuffer sb = new StringBuffer();
            boolean upper = false;  // 이전에 처리된 문자가 대문자인지?

            // String 문자열을 char로 쪼개기 -> 문자에 대해 접근이 쉬움.
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {  // 대문자인지? 아닌지? (isUpperCase)
                    if (!upper) {  
                    	sb.append('_');  // '_' 추가
                    }
                    sb.append(Character.toLowerCase(c));  // '_' 추가 후 대문자를 소문자로
                    upper = true;
                } else {
                	sb.append(c);
                	upper = false;
                }
            }
            return sb.toString().toUpperCase();
        }
    }
	
	
		// 원본 소스
		/*
		 * char c = str.charAt(0); // 첫번째 글자 변환
		 * result += Character.toLowerCase(c); //
		 * 소문자로 (첫번째글자)
		 */
		
		///////
		/*
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
		/*
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
	*/
	
	
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
	
	// <key, value> AS <K, V>
	public static <K, V> Map<K, String> ex5(Map<K, V> map1, Map<K, V> map2) {
		Map<K, String> diff = new HashMap<>();  // 다른 키를 저장할 Map
		
		Set<K> allKeys = new HashSet<>();		// 모든 키를 저장할 set
        allKeys.addAll(map1.keySet());  // keySet() : 키값만 가져오기
        allKeys.addAll(map2.keySet());  // allKeys에 map1, map2의 모든 key를 추가한다.

        for (K key : allKeys) {
            V value1 = map1.get(key);  // 현재 키에 대한 map1의 Value
            V value2 = map2.get(key);  // ... map2의 Value 가져오기
            
            // 맵의 value가 같은지? 다른지?
            // 값이 하나는 null이고 다른 것은 null이 아니거나 / 둘다 null이 아니면서 값이 서로 다른경우.
            if ((value1 == null && value2 != null) || (value1 != null && !value1.equals(value2))) {
            	System.out.println("키 " + key + "에 대해 값이 " + value1 + "에서 " + value2 + "로 바뀌었다.");
            }
        }

        return diff;
    }
	
	
	/*
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
	/*
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
	*/
}
