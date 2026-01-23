package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class P_1128_NoEqu_Domino {

	public int numEquivDominoPairs(int[][] dominoes) {

		HashMap<Integer, Integer> maps = new HashMap<>();
		int Result =0;

		for (int[] d : dominoes) {
			//int a = Idominoes[0], b = Idominoes[1];
			int a = Math.min(d[0],d[1]);
            int b = Math.max(d[0],d[1]);
			int key = Integer.parseInt(""+a+b);
			int Count = maps.getOrDefault(key, 0);
			Result+=Count;
			maps.put(key,++Count);
		
		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums = {{1,2},{2,1},{3,4},{5,6}};

		P_1128_NoEqu_Domino s = new P_1128_NoEqu_Domino();
		System.out.println(s.numEquivDominoPairs(nums));
	}

}
