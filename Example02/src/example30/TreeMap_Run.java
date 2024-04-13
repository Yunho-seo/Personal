package example30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Run {
	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap();
		treemap.put("1", 10);
		treemap.put("2", 60);
		treemap.put("3", 40);
		treemap.put("4", 50);
		treemap.put("5", 80);
		treemap.put("6", 70);
		Set<Map.Entry<String, Integer>> entry_set = treemap.entrySet();
		for(var entry : entry_set) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
		
		var descendingMap = treemap.descendingMap();
		var descending_set = descendingMap.entrySet();
		for(var element : descending_set) {
			System.out.println(element);
		}
	}
}
