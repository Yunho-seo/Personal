package example25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Run {
	public static void main(String[] args) {
		Set<Board> hash_set = new HashSet<Board>();
		hash_set.add(new Board("1", "1-1", "1-1-1"));
		hash_set.add(new Board("2", "2-2", "2-2-2"));
		hash_set.add(new Board("3", "3-3", "3-3-3"));
		hash_set.add(new Board("1", "1-1", "1-1-1"));
		hash_set.add(new Board("2", "2-2", "2-2-2"));
	
		System.out.println(hash_set.size());
		for(Board element : hash_set) {
			System.out.println(element);
		}
		Iterator<Board> iterator = hash_set.iterator();	// iterator 타입
		while(iterator.hasNext()) {
			Board board = iterator.next();
			
			if(board.subject().equals("3")) {
				iterator.remove();
			}
		}
		for(Board element : hash_set) {
			System.out.println(element);
		}
	}
}
