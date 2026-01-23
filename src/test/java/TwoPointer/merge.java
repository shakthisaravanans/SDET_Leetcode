package TwoPointer;

import java.util.Arrays;

public class merge {

	public void merges(int[] nums1, int m, int[] nums2, int n) {

		int indexoonum1 = m + n - 1;
		while ((n - 1 >=0)) {

			if ((m - 1) >= 0 && nums1[m - 1] > nums2[n - 1]) {
				nums1[indexoonum1] = nums1[m - 1];
				m--;
				//indexoonum1--;

			} else {
				nums1[indexoonum1] = nums2[n - 1];
				n--;
				//indexoonum1--;
			}
			indexoonum1--;
		}
		

	}

	public static void main(String[] args) {

		int[] nums1 = { 2, 0 };
		int[] nums2 = { 1 };
		// TODO Auto-generated method stub
		merge m = new merge();
		m.merges(nums1, 1, nums2, 1);
	}

}
