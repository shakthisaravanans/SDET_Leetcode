package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P_1399_Count_Largest_group {

	public int countLargestGroup(int n) {

		/*
		 * hashmap , integer largegroup =0; fortill n { based on the ith no we sum the
		 * num and add in map sum =0 while(n!=0) { sum+= n%10; // get last digit of num
		 * and add it to sum n=n/10;remove the last }
		 * 
		 * 
		 * here largegroup max of largegroup,itsum) int nooflagregroup =0; for(int s
		 * :maps.values) { if(s==largegroupmax) { nooflagregroup++; } }
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 */

		Map<Integer, Integer> maps = new HashMap<>();
		int lagGroup = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int N = i;

			while (N > 0) {
				sum += N % 10;
				N /= 10;

			}

			maps.put(sum, maps.getOrDefault(sum, 0) + 1);
			lagGroup = Math.max(lagGroup, maps.get(sum));
		}
		int noofgroup=0;

		for (int s : maps.values()) {
			if (s==lagGroup) {
				noofgroup++;
			}
		}

//		int lagGroup1 = lagGroup;
//		int noofgroup = (int) maps.values().stream().filter(s -> s == lagGroup1) // lagGroup is used but not modified
//				.count();
		return noofgroup;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_1399_Count_Largest_group s = new P_1399_Count_Largest_group();
		System.out.println(s.countLargestGroup(13));
	}

}
