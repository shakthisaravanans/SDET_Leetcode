package Strings;

public class P_1221_Split_str {

	public int balancedStringSplit(String s) {

		int R_Val = 0, L_Val = 0, Count = 0;

		for (char i : s.toCharArray()) {

			if (i == 'R') {
				R_Val++;
			} else {
				L_Val++;
			}

			if (R_Val == L_Val) {
				R_Val = 0;
				L_Val = 0;
				Count++;
			}

		}

		return Count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1221_Split_str sample = new P_1221_Split_str();

		System.out.println(sample.balancedStringSplit("RLRRRLLRLL"));
	}

}
