package Arrays;

public class P_121_best_time_to_buy_and_sell {

	public int maxProfit(int[] prices) {
		
		int minval=Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			
			if(minval>prices[i]) {
				minval=prices[i];
			}

			if(profit<(prices[i]-minval)) {
				profit=prices[i]-minval;
			}
		}
		return profit;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 7, 1, 5, 3, 6, 4 };
		int[] B = { 7, 2, 18, 1, 6, 21 };
		
		
		int minval=Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < B.length; i++) {
			
			if(minval>B[i]) {
				minval=B[i];
			}

			if(profit<(B[i]-minval)) {
				profit=B[i]-minval;
			}
		}
		
		System.out.println(minval);
		System.out.println(profit);

	}

}
