package Arrays;

public class P_2401_longest_nice {

	public int longestNiceSubarray1(int[] nums) {

		/*
		 * l is slow pointer and r will fast pointer and long subarray l will be 0 and r
		 * =1 xor=nums[0] if(l&r!=0){ xor^l;l++;} r++;
		 * 
		 * xor=xor+r; longsubarray=
		 * 
		 * 
		 * Xor
		 */
		int l = 0, maxlong = 0, r = 0;

		long xor = 0;

		while (l < nums.length) {

			System.out.println(xor & nums[r]);
			if ((xor & nums[r]) != 0) {
				xor ^= nums[l];
				l++;

			}
			maxlong = Math.max(maxlong, r - l + 1);
			if (r <= nums.length) {
				xor += nums[r];
			}
			if (r < nums.length - 1) {

				r++;
			}

		}

		return maxlong;

	}

	public int longestNiceSubarray(int[] nums) {

		int maxlong = 0,l = 0,
		xor = 0;
		for (int r = 0; r < nums.length; r++) {

			while((xor&nums[r])!=0) {
				xor^=nums[l];
				l++;
			}
			xor+=nums[r];
			maxlong=Math.max(maxlong, r-l+1);
		}

		return maxlong;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2401_longest_nice s = new P_2401_longest_nice();
		int[] nums = { 1, 3, 8, 48, 10 };

		System.out.println(s.longestNiceSubarray(nums));

	}

}
