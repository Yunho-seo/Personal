package example23;

import java.util.List;
import java.util.Vector;

public class Vector_Example {
	public static void main (String[] args) throws InterruptedException {
		List<Board> list = new Vector<Board>();
		
		Thread thread1 = new Thread(()->{
			for(int i=0; i<1000; ++i) {
				list.add(new Board(new String("title" + i), 
								   new String("content" + i),
								   new String("writer" + i)));
			}
		});
		
		Thread thread2 = new Thread(()->{
			for(int i=1000; i<2000; ++i) {
				list.add(new Board(new String("title" + i), 
								   new String("content" + i),
								   new String("writer" + i)));
			}
		});
		
		Thread thread3 = new Thread(()->{
			for(int i=2000; i<3000; ++i) {
				list.add(new Board(new String("title" + i), 
								   new String("content" + i),
								   new String("writer" + i)));
			}
		});
		
		Thread thread4 = new Thread() {
			@Override
			public void run() {
				for(int i=3000; i<4000; ++i) {
					list.add(new Board(new String("title" + i), 
									   new String("content" + i),
									   new String("writer" + i)));
				}
			}
		};
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		
		int size = list.size();
		System.out.println("size: " + size);
//		for(Board element : list) {
//			System.out.println(element);
//		}
	}
}
