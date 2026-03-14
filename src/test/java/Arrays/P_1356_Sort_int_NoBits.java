package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class P_1356_Sort_int_NoBits {

	public int[] sortByBits(int[] arr) {

		Arrays.sort(arr);

		TreeMap<Integer, LinkedList<Integer>> Treemap = new TreeMap<Integer, LinkedList<Integer>>();

		for(int i :arr)
		{
			int Temp = Integer.bitCount(i);
			LinkedList<Integer> li = TreeMap.
		//	TreeMap.put(Temp,));
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1356_Sort_int_NoBits sample = new P_1356_Sort_int_NoBits();

	}

}
