package Strings;

public class P_461_Hamming_Dist {

	public int hammingDistance(int x, int y) {

		int result = 0;

		while (x != 0 || y != 0) {
			if (x % 2 != y % 2) {
				result++;
			}
			x = x / 2;
			y = y / 2;
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_461_Hamming_Dist sample = new P_461_Hamming_Dist();

		System.out.println(sample.hammingDistance(3, 1));
	}

}
