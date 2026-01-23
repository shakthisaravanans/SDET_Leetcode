package Strings;

import java.text.ParseException;

public class intToRoman {

//	Input: num = 3749
//
//			Output: "MMMDCCXLIX"
//
//			Explanation:
//
//			3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//			 700 = DCC as 500 (D) + 100 (C) + 100 (C)
//			  40 = XL as 10 (X) less of 50 (L)
//			   9 = IX as 1 (I) less of 10 (X)
//			Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places

//	Symbol	Value
//	I	1
//	V	5
//	X	10
//	L	50
//	C	100
//	D	500
//	M	1000

//	
//	I/p : number
//	o/p : string
//	1) conver num to sting and pass string in loop till length of string 
//	2)if chat is 4 or 9 when seperate one else get max of sting as length add them till it reach it 
//
//1v
//6 : V1

	public String intToRoman(int num) {

//		String s = Integer.toString(num);
//		for (int i = 0; i <= s.length() - 1; i++) {
//			char temp = s.charAt(i);
//			
//			int a = temp - '0';
//			System.out.println(a);
//
//		}
		int n=1;
		for(int i=1;i<=4;i++)
		{
			int nums = num%(1000/n);
			if(nums!=0) {
			
			switch (i) {
			case 1:
				
				break;

			}
			
		}
			n=n*10;
		
		}
		
		
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intToRoman rome = new intToRoman();
		rome.intToRoman(1244);

	}

}
