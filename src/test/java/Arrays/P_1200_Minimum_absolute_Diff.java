package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_1200_Minimum_absolute_Diff {

	public List<List<Integer>> minimumAbsDifference1(int[] arr) {

		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(arr);

		int temp = Integer.MAX_VALUE, Len = arr.length;

		for (int i = 1; i < Len; i++) {

			temp = Math.min(temp, Math.abs(arr[i] - arr[i - 1]));

		}

		for (int i = 1; i < Len; i++) {

			if (Math.abs(arr[i] - arr[i - 1]) == temp) {			
				list.add(Arrays.asList(arr[i-1],arr[i]));
			}

		}

		return list;
	}

	public List<List<Integer>> minimumAbsDifference(int[] arr) {

		ArrayList<List<Integer>> list = new ArrayList<>();

		Arrays.sort(arr);

		int temp = Integer.MAX_VALUE, Len = arr.length;

		for (int i = 1; i < Len; i++) {

			if (Math.abs(arr[i] - arr[i - 1]) <= temp) {
				int Lasttemp=Math.abs(arr[i] - arr[i - 1]);
				ArrayList<Integer> Templist = new ArrayList<Integer>();
				Templist.add(arr[i - 1]);
				Templist.add(arr[i]);
				
				if (Lasttemp == temp) {

					list.add(Templist);
				} else {
					list.clear();
					list.add(Templist);
				}
				
				temp=Lasttemp;
			}

		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_1200_Minimum_absolute_Diff sample = new P_1200_Minimum_absolute_Diff();

		int[] a = { 4, 2, 1, 3 };
		int[] b = { 3, 8, -10, 23, 19, -4, -14, 27 };

		System.out.println(sample.minimumAbsDifference(b));

	}

}
