package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class P_2444_Count_subarray_withFixBound {
	public long countSubarrays1(int[] nums, int minK, int maxK) {

		/*
		 * Step 1 : intilized count as 0
		 * 
		 * Step 2 : for loop till end nums and set boolean minkflag ,maxkflag = fasle
		 * 
		 * Step 3 : while loop till end nums & nums[l]>=mins & nums[l]<=maxk
		 * 
		 * Step 4 : if(nums[l] ==mink) then {minkflag = true} simillarly do for max also
		 * 
		 * Step 5 : if both minkflag and max flag == true then count++
		 * 
		 * Step 6 : increase left count
		 * 
		 * 
		 * 
		 */

		int Count = 0;
		for (int i = 0; i < nums.length; i++) {
			boolean minkflag = false, maxkflag = false;
			int l = i;
			while (l < nums.length && nums[l] >= minK && nums[l] <= maxK) {
				if (nums[l] == minK) {
					minkflag = true;
				}
				if (nums[l] == maxK) {
					maxkflag = true;
				}

				if (maxkflag & minkflag) {
					Count++;
				}
				l++;
			}

		}
		return Count;

	}

	public long countSubarrays(int[] nums, int minK, int maxK) {

//		
//		  im getting TLE error at last 5 problem step so im introduce to new apporach
//		  
//		  3pointer Approach 
//		  
//		  Step 1 : intilized count as 0 and minpos = -1 maxpos =-1, badpos =-1
//		  
//		  Step 2 : for loop till end here trick is need to
//		  
//		  a)check badpos like not matching condition of kmins and Kmax and get index of
//		  it
//		  
//		  b)check kmin values and note down index similarly do for Kmax too
//		  
//		  Step 3 : this is heart of code for entire problem
//		  
//		  now here get minof good min or max index which is good position
//		  
//		  then check weather it is greater than badpos then add them to count
//		  
//		  
		  
		  
		  
		 

		long Count = 0;
		int Kminpos = -1, Kmaxpos = -1, Badpos = -1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < minK || nums[i] > maxK) {
				Badpos = i;
			}

			if (nums[i] == minK) {
				Kminpos = i;
			}
			if (nums[i] == maxK) {
				Kmaxpos = i;
			}

			if (Math.min(Kminpos, Kmaxpos) > Badpos) {
				Count += Math.min(Kminpos, Kmaxpos) - Badpos;
			}

		}

		return Count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 5, 2, 7, 5 }; // 2

		int[] a1 = { 1, 3, 5, 2, 7, 5 }; // 2 k 2,5 bbad pos = 0 ,2 3

		int[] b = { 1, 1, 1, 1 }; // 10

		P_2444_Count_subarray_withFixBound s = new P_2444_Count_subarray_withFixBound();
		System.out.println(s.countSubarrays(a, 1, 5));

	}

}
