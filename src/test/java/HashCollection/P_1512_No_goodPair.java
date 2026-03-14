package HashCollection;

import java.util.HashMap;

public class P_1512_No_goodPair {

	public int numIdenticalPairs(int[] nums) {
		int results = 0;
		HashMap<Integer, Integer> Actualmap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> Pastmap = new HashMap<Integer, Integer>();
		for (int i : nums) {
			Actualmap.put(i, Actualmap.getOrDefault(i, 0) + 1);

		}

		for (int i : nums) {

			results += (Actualmap.get(i) - 1) - Pastmap.getOrDefault(i, 0);
			Pastmap.put(i, Pastmap.getOrDefault(i, 0) + 1);
		}

		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1512_No_goodPair sample = new P_1512_No_goodPair();
		int[] nums = { 1, 1, 1, 1 };
		System.out.println(sample.numIdenticalPairs(nums));
	}

}
