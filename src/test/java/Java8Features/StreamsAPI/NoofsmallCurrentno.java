package Java8Features.StreamsAPI;

import java.util.Arrays;

public class NoofsmallCurrentno {
	
	//private static final int Current = 0;

	public int[] smallerNumbersThanCurrent(int[] nums) {
		
		
	 Arrays.stream(nums).map(Current -> (int)Arrays.stream(nums).filter(n->n<Current).count()).toArray();
		
		return  Arrays.stream(nums).map(Current -> (int)Arrays.stream(nums).filter(n->n<Current).count()).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
