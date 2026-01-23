package Arrays;

import java.util.Arrays;

public class P_2145_Count_the_Hidden {
	public int numberOfArrays1(int[] differences, int lower, int upper) {
		int upComVal = 0, minpos = 0, maxpos = 0,Count=0;
		for (int i : differences) {
			upComVal += i;
			if (maxpos > upComVal && upComVal < minpos) {
				minpos = upComVal;
			} else if(maxpos<upComVal) {
				maxpos = upComVal;
			}

		}		
		Count = (upper-lower) - (maxpos-minpos)+1;
		return Count>=0?Count:0;

	}
	
	
	public int numberOfArrays(int[] differences, int lower, int upper) {
		int upComVal = 0, minpos = 0, maxpos = 0,Count=0;
		for (int i : differences) {
			upComVal += i;
			minpos = Math.min(minpos, upComVal);
			maxpos = Math.max(maxpos, upComVal);
		}		
		Count = (upper-lower) - (maxpos-minpos)+1;
		return Count>=0?Count:0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2145_Count_the_Hidden s = new P_2145_Count_the_Hidden();
		int[] nums = {3,-4,5,1,-2}; // 1 2 5 7 9

		System.out.println(s.numberOfArrays(nums,-4,5));
	}

}
