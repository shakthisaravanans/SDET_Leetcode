package Maths;

public class Ugly_num {

	public boolean isUgly(int n) {

		if (n <= 0) {
			return false;
		}
		if (n <= 6) {
			return true;
		}
		while (n > 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else if (n % 3 == 0) {
				n /= 3;
			} else if (n % 5 == 0) {
				n /= 5;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ugly_num sample = new Ugly_num();
		System.out.println(sample.isUgly(14));
	}

}
