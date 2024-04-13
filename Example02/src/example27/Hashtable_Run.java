package example27;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable_Run {
	public static void main(String[] args) throws InterruptedException {
		Map<String, Integer> hash_table = new Hashtable<>();
		
		Thread thread1 = new Thread(()->{
			for(int i=0; i<1000; ++i) {
				hash_table.put(String.valueOf(i), i);
			}
		});
		
		Thread thread2 = new Thread(()->{
			for(int i=1000; i<2000; ++i) {
				hash_table.put(String.valueOf(i), i);
			}
		});
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println("갯수: " + hash_table.size());
	}
}
