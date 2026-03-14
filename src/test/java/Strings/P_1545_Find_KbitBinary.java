package Strings;

public class P_1545_Find_KbitBinary {

	public char findKthBit(int n, int k) {

		StringBuilder s = new StringBuilder().append(0);

		for (int i = 1; i <= n && s.length()<=k; i++) {
			StringBuilder Temps = new StringBuilder().append(s).append(1);	
			for(int j=s.length()-1;j>=0;j--)
			{
				Temps.append((s.charAt(j)-'0'^1));
			}
			
			s=Temps;
			

		}

		return s.charAt(k-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1545_Find_KbitBinary sample = new P_1545_Find_KbitBinary();
		System.out.println(sample.findKthBit(4,12));
	}

}
