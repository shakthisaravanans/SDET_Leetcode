package System_Design;

import java.util.HashMap;
import java.util.HashSet;

public class P_706_Design_Hashmap {
	



	
	HashMap<Integer, Integer> Maps;

	public void MyHashMap() {
		Maps = new HashMap<Integer, Integer>();
		
	}

	public void put(int key, int value) {
		Maps.put(key, value);
		
		HashSet<Integer> myhash = new HashSet<Integer>();
		myhash.add(key);
		myhash.remove(key);
		myhash.contains(key);
	}

	public int get(int key) {

		return Maps.getOrDefault(key, -1);

	}

	public void remove(int key) {
		Maps.remove(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_706_Design_Hashmap sample = new P_706_Design_Hashmap();

	}

}
