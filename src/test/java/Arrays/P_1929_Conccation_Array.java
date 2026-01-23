package Arrays;

import java.util.Arrays;

public class P_1929_Conccation_Array {
	public int[] getConcatenation(int[] nums) {

		int maxlen = nums.length * 2, Len = nums.length;
		int i = 0;
		int[] concen = new int[maxlen];
		while (i < maxlen) {
			int j = i % Len;
			concen[i++] = nums[j];
		}

		System.out.println(Arrays.toString(concen));
		return concen;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1929_Conccation_Array sample = new P_1929_Conccation_Array();
		int[] nums = { 1, 2, 1 };
		System.out.println(sample.getConcatenation(nums));
	}

}
