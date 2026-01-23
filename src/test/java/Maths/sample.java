package Maths;

public class sample {

	public boolean checkPowersOfThree(int n) {
		int x = 10;

		while (x >= 0)

		{
			if (n >= (int) Math.pow(3, x)) {
				n = n - (int) Math.pow(3, x);
				if (n == 0) {
					return true;
				}
			}
			x--;
		}
		return false;
	}

	public static void main(String[] args) {

		sample s = new sample();
		System.out.println(s.checkPowersOfThree(21));

		// System.out.println((int) Math.pow(3, 1));
	}
}
