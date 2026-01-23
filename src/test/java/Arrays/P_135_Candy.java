package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P_135_Candy {
	public int candy(int[] ratings) {

		int[] candysforchild = new int[ratings.length];

		int countCandy = 0;

		Arrays.fill(candysforchild, 1);

		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candysforchild[i] = candysforchild[i - 1] + 1;
			}
		}

		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i] < ratings[i - 1]) {
				candysforchild[i] = Math.max(candysforchild[i] + 1, candysforchild[i - 1]);
			}

			countCandy += candysforchild[i];

		}

		return countCandy + candysforchild[0];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_135_Candy s = new P_135_Candy();

		int[] ratings = { 1, 2, 2 };

		System.out.println(s.candy(ratings));

	}

}
