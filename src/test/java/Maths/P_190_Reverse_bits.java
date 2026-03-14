package Maths;

import java.math.BigInteger;

public class P_190_Reverse_bits {

	public int reverseBits(int n) {

		String Old = Integer.toBinaryString(n);

		StringBuilder Results = new StringBuilder();
		Results.append("000000000000000000000000000000000", 0, 32 - Old.length()).append(Old).reverse();
		return Integer.parseInt(Results.toString(),2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_190_Reverse_bits sample = new P_190_Reverse_bits();

		int a = 43261596;

		StringBuilder Results = new StringBuilder();

		String binaryString = Integer.toBinaryString(a);

		Results.append("0000000000000000000000000000000000000000000", 0, 32 - binaryString.length());

		Results.append(binaryString).reverse();

		System.out.println(Results);

		int Res = Integer.parseInt(Results.toString(), 2);
		System.out.println(Res);
	}

}
