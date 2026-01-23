package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class P_1394_Lucky_int {

	public int findLucky1(int[] arr) {

		int len = arr.length;
		// int count = -1;

		for (int i = len - 1; i >= 0; i--) {
			int count = 0;

			for (int j = i; j >= 0; j--) {
				if (arr[j] != arr[i]) {
					break;
				}
				count++;
			}

			if (count == arr[i]) {
				return count;
			}

		}

		return -1;

	}

	public int findLucky2(int[] arr) {

		int len = arr.length - 1, r = len;

		while (r >= 0) {
			int count = 0;
			int l = r;
			int temp = arr[r];
			while (l >= 0) {
				if (arr[l] != temp) {
					break;
				}
				count++;
				l--;
			}

			if (count == temp) {
				return temp;
			}

			r = l;

		}

		return -1;

	}

	public int findLucky10(int[] arr) {

		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

		for (int i : arr) {
			maps.put(i, maps.getOrDefault(i, 0) + 1);
		}

		List<Integer> l1 = new ArrayList(maps.keySet());

		Collections.sort(l1);

		for (int j = l1.size() - 1; j >= 0; j--) {
			int temp = l1.get(j);
			if (maps.get(temp) == temp) {
				return temp;
			}

		}

		return -1;

	}

	public int findLucky(int[] arr) {

		int[] fl = new int[501];
		int max = 0;
		for (int i : arr) {
			fl[i]++;
			max = Math.max(max, i);
		}

		for (int j = max; j >= 0; j--) {
			if (fl[j] == j) {
				return j;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_1394_Lucky_int sample = new P_1394_Lucky_int();

		int[] arr = { 4, 3, 2, 2, 4, 1, 3, 4, 3 };

		System.out.println(sample.findLucky(arr));

	}

}
