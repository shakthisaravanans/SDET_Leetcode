package Strings;

public class longestCommonPrefix {

//	
//	Example 1:
//
//		Input: strs = ["flower","flow","flight"]
//		Output: "fl"
//		Example 2:
//
//		Input: strs = ["dog","racecar","car"]
//		Output: ""
//		Explanation: There is no common prefix among the input strings.
//		 
//		
//		
//		Step1: i/P string array
//		op:string
//		get string array size and traverse though array of string if arrya char is not equal it should be break and return string
//				
	public String longestCommonPrefixs(String[] strs) {

		StringBuilder Com_Pre = new StringBuilder();
		int inc = 0;
		
		//Taking one string as Common and comparing with other string arrays
//	   note:if common-String size is completed it break and return string
//			if comparing sting size is completed is break and return String 
//			if common and compaing sting arrray is not matched it break and return string
//				
				
		while (inc < strs[0].length()) {
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() > inc) {
					if (strs[0].charAt(inc) != strs[j].charAt(inc)) {
						return Com_Pre.toString();
					}

				}else {return Com_Pre.toString();}
			}
			Com_Pre.append(strs[0].charAt(inc));
			inc++;
		}

		return Com_Pre.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String strs[] = { "flower","flow","flight" };
		String strs[] = { "a","ab",  };
		longestCommonPrefix s = new longestCommonPrefix();
		System.out.println(s.longestCommonPrefixs(strs));
	}

}
