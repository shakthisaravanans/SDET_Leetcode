package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Samplenew {

	public void intersections(String[] nums1, String[] nums2, String startename) {

//		State1	City1
//		State1	City2
//		State2	City3
//		State2	City4
//		State3	City5
//		State3	City1

		HashMap<String, List<String>> maps = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {
			List<String> l1 = new ArrayList<String>();
			if (maps.get(nums1[i]) == null) {
				l1.add(nums2[i]);
				maps.put(nums1[i], l1);
			} else {
				l1.addAll(maps.get(nums1[i]));
				l1.add(nums2[i]);
				maps.put(nums1[i], l1);

			}

		}

		System.out.println(maps);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nums1 = { "State1", "State1", "State2", "State2", "State3", "State3" };
		String[] nums2 = { "City1", "City2", "City3", "City4", "City5", "City1" };

		Samplenew s = new Samplenew();
		s.intersections(nums1, nums2, "State3");

	}

}
