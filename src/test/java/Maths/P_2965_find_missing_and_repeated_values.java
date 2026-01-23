package Maths;

import java.util.Arrays;
import java.util.HashMap;

public class P_2965_find_missing_and_repeated_values {
	
	 public int[] findMissingAndRepeatedValues(int[][] grid) {
	        int n = grid.length;
	        int size = n * n;
	        int[] count = new int[size + 1];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                count[grid[i][j]]++;
	            }
	        }

	        int a = -1, b = -1;

	        for (int num = 1; num <= size; num++) {
	            if (count[num] == 2) {
	                a = num;
	            } else if (count[num] == 0) {
	                b = num;
	            }
	        }

	        return new int[]{a, b}; 
	    }

	public int[] findMissingAndRepeatedValues1(int[][] grid) {

		int n = grid.length;
		int size = n * n;
		int[] output = new int[2];
		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				maps.put(grid[i][j], maps.getOrDefault(grid[i][j], 0) + 1);

				if (maps.get(grid[i][j]) == 2) {
					output[0] = grid[i][j];
				}

			}
		}
		int k = 0;
		while (k < size) {
			k++;
			if (!maps.containsKey(k)) {
				output[1] = k;
			}

		}

		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = { { 1, 3 }, { 2, 2 } };

		P_2965_find_missing_and_repeated_values s = new P_2965_find_missing_and_repeated_values();
		System.out.println(Arrays.toString(s.findMissingAndRepeatedValues(grid)));

	}

}
