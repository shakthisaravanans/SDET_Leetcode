package Arrays;

import java.util.Arrays;

public class P_2144_Mim_cost {

	public int minimumCost(int[] cost) {

		int Result = 0, Len = cost.length - 1;

		Arrays.sort(cost);

		for (int i = Len; i >= 0; i--) {

			if ((Len - i) % 3 != 2) {
				Result += cost[i];
			}

		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2144_Mim_cost sample = new P_2144_Mim_cost();
		int[] cost = { 5, 5 };

		System.out.println(sample.minimumCost(cost));
	}

}
