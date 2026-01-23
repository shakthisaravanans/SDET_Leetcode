package Strings;

public class P_67_AddBinary {

	public String addBinary(String a, String b) {

		int i = 0, LenA = a.length(), Lenb = b.length();
		int remainder = 0;
		StringBuilder Result = new StringBuilder();
		while (i < LenA || i < Lenb) {

			int Achar = 0;
			int Bchar = 0;

			if (i < LenA) {
				if (a.charAt(LenA - i - 1) == '1') {
					Achar = 1;
				}
			}
			if (i < Lenb) {
				if (b.charAt(Lenb - i - 1) == '1') {
					Bchar = 1;
				}
			}

			switch (Achar + Bchar + remainder) {
			case 3:

			{
				Result.append("1");
				remainder = 1;
				break;
			}
			case 2:

			{
				Result.append("0");
				remainder = 1;
				break;
			}
			case 1:

			{
				Result.append("1");
				remainder = 0;
				break;
			}
			case 0:

			{
				Result.append("0");
				remainder = 0;
				break;
			}

			}
			
			//if case is slow and check each loop 

			/*
			 * if ((Achar + Bchar + remainder) == 3) { Result.append("1"); remainder = 1;
			 * 
			 * }
			 * 
			 * else if ((Achar + Bchar + remainder) == 2) { Result.append("0"); remainder =
			 * 1;
			 * 
			 * } else if ((Achar + Bchar + remainder) == 1) { Result.append("1"); remainder
			 * = 0;
			 * 
			 * } else if ((Achar + Bchar + remainder) == 0) { Result.append("0"); remainder
			 * = 0;
			 * 
			 * }
			 */

			i++;

		}
		if (remainder == 1) {
			Result.append("1");
		}

		return Result.reverse().toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_67_AddBinary sample = new P_67_AddBinary();
		System.out.println(sample.addBinary("11", "1"));
	}

}
