package Arrays;

public class P_1390_Four_divs {

	public int sumFourDivisors(int[] nums) {

		int SumFourdiv = 0;

		for (int k : nums) {

			int Temp = 0, Count = 0;

			for (int i = 1; i <= k; i++) {
				if (k % i == 0) {
					Count++;
					Temp += i;
				}
				if (Count > 4) {
					break;
				}
			}
			if (Count == 4) {
				SumFourdiv += Temp;
			}
		}

		return SumFourdiv;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 21, 4, 7 };

		P_1390_Four_divs sample = new P_1390_Four_divs();

		System.out.println(sample.sumFourDivisors(nums));

	}

}
