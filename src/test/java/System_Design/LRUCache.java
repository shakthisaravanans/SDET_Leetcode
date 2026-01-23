package System_Design;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {

	public LinkedHashMap<Integer, Integer> maps = new LinkedHashMap<Integer, Integer>();
	public LinkedList<Integer> lists = new LinkedList<Integer>();
	public int Mapsize = 0;

	public LRUCache(int capacity) {
		Mapsize = capacity;

	}

	public int get(int key) {

		if (lists.contains(key)) {
			lists.remove(Integer.valueOf(key));
			lists.addFirst(key);
			return maps.get(key);

		}

		return -1;

	}

	public void put(int key, int value) {

		if (lists.contains(key)) {
			lists.remove(Integer.valueOf(key));
			lists.addFirst(key);
			maps.put(key, value);
		} else {
			if (lists.size() < Mapsize) {
				lists.addFirst(key);
				maps.put(key, value);
			} else {
				lists.removeLast();
				maps.put(key, value);
				lists.addFirst(key);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(2, 1); // cache is {2=1}
		lRUCache.put(1, 1); // cache is {1=1, 2=1}
		lRUCache.put(2, 3);// cache is {2=3,1=1}
		lRUCache.put(4, 1);//cache is {2=3,4=1}
		System.out.println(lRUCache.get(1)); // return -1
		System.out.println(lRUCache.get(2)); //3
		

		/*
		 * LRUCache lRUCache = new LRUCache(2); lRUCache.put(1, 1); // cache is {1=1}
		 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
		 * System.out.println(lRUCache.get(1)); // return 1 lRUCache.put(3, 3); // LRU
		 * key was 2, evicts key 2, cache is {1=1, 3=3}
		 * System.out.println(lRUCache.get(2)); // returns -1 (not found)
		 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		 * System.out.println(lRUCache.get(1)); // return -1 (not found)
		 * System.out.println(lRUCache.get(3)); // return 3
		 * System.out.println(lRUCache.get(4)); // return 4
		 */	}

}
