package Arrays;

public class P_1732_Find_High_Alt {

	public int largestAltitude(int[] gain) {

		int lgt_al = 0, higALt = 0;

		for (int i : gain) {
			lgt_al += i;
			higALt = Math.max(lgt_al, higALt);
		}

		return higALt;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1732_Find_High_Alt sample = new P_1732_Find_High_Alt();

		int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
		System.out.println(sample.largestAltitude(gain));
	}

}
