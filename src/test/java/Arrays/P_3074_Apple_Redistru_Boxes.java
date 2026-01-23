package Arrays;

import java.util.Arrays;

public class P_3074_Apple_Redistru_Boxes {

	public int minimumBoxes(int[] apple, int[] capacity) {
		int Results = 0, applesize = 0, capsount = 0, lenbox = capacity.length;

		for (int i : apple) {
			applesize += i;
		}

		Arrays.sort(capacity);

		for (int i = lenbox; i > 0; i--) {
			capsount += capacity[i];
			Results++;
			if (applesize <= capsount) {
				return Results;
			}

		}

		return Results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3074_Apple_Redistru_Boxes sample = new P_3074_Apple_Redistru_Boxes();
		int[] apple = { 1, 3, 2 };
		int[] Cap = { 4, 3, 1, 5, 2 };

		System.out.println(sample.minimumBoxes(apple, Cap));
	}

}
