package example29;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Run {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(95));
		System.out.println(scores.higher(95));
		
		System.out.println("\r\n");
		NavigableSet<Integer> descending = scores.descendingSet();
		for(Integer element : descending) {
			System.out.println(element);
		}
	}
}