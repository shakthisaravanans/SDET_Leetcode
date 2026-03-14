package Arrays;

public class P_693_Binary_no {

	public boolean hasAlternatingBits(int n) {

		String binaryString = Integer.toBinaryString(n);

		for (int i = 1; i < binaryString.length(); i++) {
			if (binaryString.charAt(i - 1) == binaryString.charAt(i)) {
				return false;
			}
		}

		return true;

	}

	public int hammingWeight(int n) {

		int result = 0;

		String binaryString = Integer.toBinaryString(n);

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				result++;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_693_Binary_no sample = new P_693_Binary_no();
		System.out.println(sample.hasAlternatingBits(11));
		System.out.println(sample.hammingWeight(11));

	}

}
