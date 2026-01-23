package Arrays;

import java.util.Arrays;

public class P_1475_Final_price_with_SpecialDis {

	public int[] finalPrices(int[] prices) {

		int[] Results = prices.clone();
		int len = prices.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (Results[i] >= prices[j]) {
					Results[i] = Results[i] - prices[j];
					break;
				}

			}
		}

		return Results;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1475_Final_price_with_SpecialDis sample = new P_1475_Final_price_with_SpecialDis();
		int[] prices = { 8, 4, 6, 2, 3 };
		System.out.println(Arrays.toString(sample.finalPrices(prices)));
	}

}
