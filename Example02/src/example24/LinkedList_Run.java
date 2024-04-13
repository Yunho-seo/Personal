package example24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import example23.Board;

public class LinkedList_Run {
	
	public static void main(String[] args) {
		List<Board> list1 = new LinkedList<>();
		List<Board> list2 = new ArrayList<Board>();
		
		long start_time = 0L;
		long end_time = 0L;
		start_time = System.nanoTime();
		for(int i=0; i<5000; ++i) {
			list1.remove(0);
		}
		
		for(int i=0; i<10000; ++i) {
			list1.add(new Board(new String("title" + i), 
					   new String("content" + i),
					   new String("writer" + i)));
		}
		end_time = System.nanoTime();
		System.out.println("걸린시간: " + (end_time-start_time));
		
	}
}