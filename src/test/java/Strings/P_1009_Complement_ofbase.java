package Strings;

public class P_1009_Complement_ofbase {

	public int bitwiseComplement(int n) {

		StringBuilder res = new StringBuilder();
		while (n > 0) {
			res.append(1^ (n % 2));
			n = n / 2;

		}

		return Integer.parseInt(res.reverse().toString(), 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1009_Complement_ofbase sample = new P_1009_Complement_ofbase();
		System.out.println(sample.bitwiseComplement(10));
	}

}
