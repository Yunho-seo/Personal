package example26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Run {
	public static void main(String[] args) {
		Map<String, Board> hash_map = new HashMap<String, Board>();
		hash_map.put("A", new Board("1", "1-1", "1-1-1"));
		hash_map.put("B", new Board("2", "1-1", "1-1-1"));
		hash_map.put("C", new Board("3", "1-1", "1-1-1"));
		hash_map.put("D", new Board("4", "1-1", "1-1-1"));
		hash_map.put("A", new Board("1", "1-1", "1-1-1"));
		hash_map.put("B", new Board("2", "1-1", "1-1-1"));
		System.out.println("갯수는: " + hash_map.size());
		
		Board board = hash_map.get("A");
		System.out.println(board);
		var key_set = hash_map.keySet();
		// Set<String> key_set
		Iterator<String> iterator = key_set.iterator();
		while(iterator.hasNext()) {
			String _key = iterator.next();
			Board element = hash_map.get(_key);
			System.out.println(element);
		}
	}
}
