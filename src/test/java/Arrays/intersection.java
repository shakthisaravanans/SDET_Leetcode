package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class intersection {

	public String intersections(int[] nums1, int[] nums2) {
		
/**
 * 
 */

//		step1 : Sort the both arrays

		Arrays.sort(nums1);
		Arrays.sort(nums2);

//		step2 : create integer array with min length of array (becs as per intersection it wont go greater then min size)

		int minlen = Math.min(nums1.length, nums2.length);

		int[] inter = new int[minlen];

//		step3: check num1 element index with num2 if num1 is greater num2++ else num1++ 
		int nums1index = 0, nums2index = 0, interindex = 0;
		while (nums1index < nums1.length && nums2index < nums2.length) {

			if (nums1[nums1index] > nums2[nums2index]) {
				nums2index++;
			} else if (nums1[nums1index] < nums2[nums2index]) {
				nums1index++;
			}
//			step4:else itmeans it is equal so it come to else path so here we need to check last index = num1 if present skip else add in array.

			else {
				if (interindex != 0) {

					if (inter[interindex-1] != nums1[nums1index]) { // index 1 : 3 4 {2,3,3}
						inter[interindex] = nums1[nums1index];
						interindex++;
						
					}
				} else {
					inter[interindex] = nums1[nums1index];
					interindex++;

				}
				
				nums1index++;
				nums2index++;

			}

		}

//		step 5 loop till while condition become false and return Arrays.copyOfRange(a, 0, index)
//		
//		

		return Arrays.toString(Arrays.copyOfRange(inter, 0, interindex));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		intersection s = new intersection();
		System.out.println(s.intersections(nums1, nums2));

		int[] a = new int[4];

		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, 6)));
	}

}
