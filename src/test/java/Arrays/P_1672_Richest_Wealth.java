package Arrays;

public class P_1672_Richest_Wealth {

	public int maximumWealth(int[][] accounts) {

		int Result = 0;

		int ColAccount = accounts[0].length, RowAccount = accounts.length;

		for (int i = 0; i < RowAccount; i++) {
			int temp = 0;
			for (int j = 0; j < ColAccount; j++) {
				temp += accounts[i][j];
			}
			Result = Math.max(Result, temp);
		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1672_Richest_Wealth sample = new P_1672_Richest_Wealth();
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
		System.out.println(sample.maximumWealth(accounts));
	}

}
