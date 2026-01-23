package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_3024_Type_triangle {

	public String triangleType1(int[] nums) {
		Set s = new HashSet<Integer>();

		int a = nums[0], b = nums[1], c = nums[2];

		if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
			for (int i : nums) {
				s.add(i);
			}

			switch (s.size()) {

			case 1: {
				return "equilateral";

			}
			case 2: {
				return "isosceles";
			}
			default: {
				return "scalene";
			}

			}
		}

		return "none";

	}

	public String triangleType(int[] nums) {

		int a = nums[0], b = nums[1], c = nums[2];

		return (a + b > c && a + c > b && b + c > a)
				? ((a == b && b == c) ? "equilateral" : ((a == b || b == c || c == a) ? "isosceles" : "scalene"))
				: "none";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 1, 2, 2 };

		P_3024_Type_triangle s = new P_3024_Type_triangle();
		System.out.println(s.triangleType(nums1));

	}

}
