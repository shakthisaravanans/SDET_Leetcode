package Arrays;

import java.util.Arrays;

public class missingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] findthemissing = new int[] { 5, 6, 8, 9 };

		for (int i = 1; i < findthemissing.length; i++) {

			if (findthemissing[i - 1] + 1 != findthemissing[i]) {
				System.out.println(findthemissing[i - 1] + 1);
				break;
			}

		}
///--------------------------------
		String a = "hello";
		String b = "worlds";

		a = a + b;

		System.out.println("merged a " + a);
		b = a.substring(0, a.length() - b.length());
		a = a.substring(a.length() - b.length() - 1, a.length());
		System.out.println(a);

		System.out.println(b);
		// -----------------------------------------

		int[] movezero = new int[] { 1, 2, 0, 4, 3, 0, 5, 0 };

		int[] moverzero = new int[movezero.length];

		Arrays.fill(moverzero, 0);
		int count = 0;

		for (int i = 0; i < movezero.length; i++) {
			if (movezero[i] != 0) {
				moverzero[count] = movezero[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(moverzero));
		//----------------------------------------------------

	}

}
