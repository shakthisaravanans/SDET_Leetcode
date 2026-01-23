package TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class P75_Sort_Colors {

	public void sortColors(int[] nums) {

		/*
		 * // Step 1 : Create Hashmap with both key and value as integer
		 * 
		 * HashMap<Integer, Integer> maps = new HashMap();
		 * 
		 * // Step 2 : Add them to 0,1,2 maps.put(0, 0); maps.put(1, 0); maps.put(2, 0);
		 * 
		 * // Step 3 : for each them and till end of nums and added them in maps
		 * 
		 * for (int i : nums) { maps.put(i, maps.get(i) + 1);
		 * 
		 * }
		 * 
		 * // Step 4 for loop till end of map and nested forloop till end of count of it
		 * int numscount = 0; for (int j = 0; j < maps.size(); j++) { for (int k = 0; k
		 * < maps.get(j); k++) { nums[numscount] = j; numscount++; } }
		 */

		/**
		 * normal Apporach like adding "0" and adding "1" and "2" and take 3 for loop
		 * add them in nums
		 * 
		 * 
		 */

		// normal Approach like intilized int for zero ,ones,two's and Array count
		int Zerocount = 0, Onecount = 0, twocount = 0, Arraycount = 0;
		
		//Count them and add them based on the integer

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				Zerocount++;
			} else if (nums[i] == 1) {
				Onecount++;
			} else if (nums[i] == 2) {
				twocount++;
			}

		}
		
		// looping them with no of count 
		for(int zero=0;zero<Zerocount;zero++)
		{
			nums[Arraycount]=0;
			Arraycount++;
		}
		
		for(int One=0;One<Onecount;One++)
		{
			nums[Arraycount]=1;Arraycount++;
		}
		
		for(int Two=0;Two<twocount;Two++)
		{
			nums[Arraycount]=2;Arraycount++;
		}
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		P75_Sort_Colors s = new P75_Sort_Colors();

		int[] a = {0};
		int[] b = { 0, 0, 1, 1, 2, 2 };

//		int rightinx = 3, leftindex = 3, mid = 3;
		s.sortColors(a);
	}

}
