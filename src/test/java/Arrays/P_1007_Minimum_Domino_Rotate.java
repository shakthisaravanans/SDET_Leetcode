package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_1007_Minimum_Domino_Rotate {

	public int minDominoRotations(int[] tops, int[] bottoms) {
		int[] check = new int[2];
		check[0] = tops[0];
		check[1] = bottoms[0];
		int mincount = Integer.MAX_VALUE, topmin = 0, bottomsmin = 0;

		for (int i = 0; i < check.length; i++) {
			boolean value = true;
			for (int j = 0; j < tops.length; j++) {
				if (check[i] == tops[j] || check[i] == bottoms[j]) {
					if (check[i] != tops[j]) {
						topmin++;
					}
					if (check[i] != bottoms[j]) {
						bottomsmin++;
					}

				} else {
					value = false;
					topmin = 0;
					bottomsmin = 0;
					break;
				}

			}
			if (value) {
				mincount = Math.min(mincount, Math.min(topmin, bottomsmin));

			}
		}


		return mincount==Integer.MAX_VALUE?-1:mincount;

	}
	
//	public int minDominoRotations1(int[] tops, int[] bottoms) {
//		
//
//		return mincount==Integer.MAX_VALUE?-1:mincount;
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 1, 2, 4, 2, 2 }; // [0,1,2,4,5,3]
		int[] nums1 = { 5, 2, 6, 2, 3, 2 }; // 23

		P_1007_Minimum_Domino_Rotate s = new P_1007_Minimum_Domino_Rotate();
		System.out.println(s.minDominoRotations(nums, nums1));
	}

}
