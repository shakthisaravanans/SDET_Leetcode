package Strings;

public class P_657_RobotRetuen {

	public boolean judgeCircle(String moves) {

		int[] judge = new int[4];
		for (char i : moves.toCharArray()) {
			if (i == 'L') {
				judge[0]++;
				continue;
			}
			if (i == 'R') {
				judge[1]++;
				continue;
			}
			if (i == 'U') {
				judge[2]++;
				continue;
			}
			if (i == 'D') {
				judge[3]++;
				continue;
			}

		}

		return judge[0] == judge[1] && judge[2] == judge[3];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_657_RobotRetuen sample = new P_657_RobotRetuen();

		String s = "UD";

		System.out.println(sample.judgeCircle(s));
	}

}
