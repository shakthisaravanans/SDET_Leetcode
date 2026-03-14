package Strings;

public class P_868_Binary_Gap {

	public int binaryGap(int n) {

		String stringBin = Integer.toBinaryString(n);

		int l = 0, r = l + 1, Len = stringBin.length(),BinGap=0;

		while (r < Len) {
			
			if(stringBin.charAt(r)=='1')
			{
				BinGap = Math.max(BinGap,r-l);
				l=r;
			}
			r++;

		}

		return BinGap;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_868_Binary_Gap sample = new P_868_Binary_Gap();

		System.out.println(sample.binaryGap(8));
	}

}
