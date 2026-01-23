package TwoPointer;

public class P28_First_occ_String {

	public int strStr(String haystack, String needle) {

		/**
		 * 
		 * Step 1: get needle String and check them with haystack string Step 2: forloop
		 * till haystack Step 3: for loop if match with needle Step 4: if fails continue
		 * with forloop
		 */

//		int haystacklen = haystack.length();
//		int needlelen= needle.length();
//		int haystackcount =0;
//			while(haystackcount<haystacklen)
//			{
//				if(haystack.charAt(haystackcount)==needle.charAt(0))
//				{
//					
//					
//				}
//				
//				haystackcount++;
//			}
//		
//		
//		
//		return -1;

		// By Using dual condition forloop and substring function i have come up with
		// the solutions

		// for (int i = 0, j = needle.length(); (i <=haystack.length() & j <=haystack.length()); i++, j++) {
				// 	if (haystack.substring(i, j).equals(needle)) {
				// 		return i;
				// 	}
				// }

				// return -1;

		/*
		 * Two pointer Step 1 : get length of two string, make temp needel variable and
		 * assigne to 0 Step 2 : while loop till hasystacklen and it should be greater
		 * the needle length Step 3 : if true then check with needle temp to haystacklen
		 * true then incremmet tempneedle and check temp reach it length of needle true
		 * return haystacklen-needlegth. Step 4 : else turn temp to 0
		 */

//		int haystackcount = 0, needlecount = needle.length();
//		while (haystackcount < haystack.length() & haystackcount+needle.length() <=haystack.length())
//		{
//			if (haystack.substring(haystackcount, needlecount).equals(needle)) {
//
//					return haystackcount;
//				}
//			haystackcount++;
//			needlecount++;
//		}
//		return -1;
		
		
		/**
		 * Simple solution by using indexof
		 */
		
	
		return haystack.indexOf(needle);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String haystack = "hello";
		String needle = "ll";

		P28_First_occ_String s = new P28_First_occ_String();
		System.out.println(s.strStr(haystack, needle));

	}

}
