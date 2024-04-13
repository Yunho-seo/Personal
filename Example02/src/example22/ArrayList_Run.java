package example22;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Run {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("title1", "content1", "writer1"));
		list.add(new Board("title2", "content2", "writer2"));
		list.add(new Board("title3", "content3", "writer3"));
		list.add(new Board("title4", "content4", "writer4"));
		
		int size = list.size();
		System.out.println("갯수: " + size);
		
		var board = list.get(0);
		System.out.println(board);
		System.out.println(board.subject());
		
		for(var element : list){
			System.out.println(element);
		}
	}
}