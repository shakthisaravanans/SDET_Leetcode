package Arrays;

import java.util.HashMap;

public class P_560_subarray_sum_equals_k {

	public int subarraySum(int[] nums, int k) {

		/*
		 * Simple and stringforward case is Step1 int count =0 to count no of subarrays
		 * match with k Step2: for loop till end of array and nested loop till length
		 * array and if sum = k them count as +1; return count
		 * 
		 */

//		int Subarraycount = 0, tempcount = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == k) {
//				Subarraycount++;
//			}
//			tempcount = nums[i];
//
//			for (int j = i + 1; j < nums.length; j++) {
//				tempcount = tempcount + nums[j];
//				if (tempcount == k) {
//					Subarraycount++;
//				}
//
//			}
//
//			tempcount = 0;
//		}
		
		
		/*
		 *  Prefixsum method 
		 *   create hashmap add only sum arrays 
		 *   check if x+y=k y will be forloop index and x with previoous count 
		 *   k-y=x
		 *   int count=1
int ans =0
hashmap 
map.put(0,1)

for
{
if(map.contains(k-i)) 3-3
{
ans++;
)
map.put(count+i),1)

		 */
		
//		https://www.youtube.com/watch?v=xvNwoz-ufXA
		
		int prefixsum =0,Subarraycount=0;
		
		Math.pow(2, 0);
		
		
		HashMap<Integer,Integer> maps= new HashMap<Integer, Integer>();
		maps.put(0,1);
		for(int i=0;i<nums.length;i++)
		{
			if(maps.containsKey(k-nums[i]))
			{
				Subarraycount++;
			}
			maps.put(prefixsum+nums[i],1);
			
		}
		

		return Subarraycount;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_560_subarray_sum_equals_k s = new P_560_subarray_sum_equals_k();

		int[] nums = {1,-1,0};
		System.out.println(s.subarraySum(nums, 0));

	}

}
