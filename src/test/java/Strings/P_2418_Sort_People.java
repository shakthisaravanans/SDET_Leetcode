package Strings;

import java.util.TreeMap;

public class P_2418_Sort_People {
	public String[] sortPeople(String[] names, int[] heights) {

		TreeMap<Integer, Integer> heightsmaps = new TreeMap<Integer, Integer>();
		int len =heights.length;
		String[] Result = new String[len];
		int count = 0, nameCount = len-1;

		for (int i : heights) {
			heightsmaps.put(i, count++);

		}

		for (Integer s : heightsmaps.values()) {
			Result[nameCount--] = names[s];
		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2418_Sort_People sample = new P_2418_Sort_People();
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };

		System.out.println(sample.sortPeople(names, heights));
	}

}
