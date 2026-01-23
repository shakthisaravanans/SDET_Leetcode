package Demo_int;

public class sample_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example: Input: "aabcccccaaa"; Expected Result: "a2b1c5a3"

		String Input = "abccc";
		int Count =1;
		StringBuilder result = new StringBuilder();

		for (int i = 1; i < Input.length(); i++) {
			
			
			if(Input.charAt(i)!=Input.charAt(i-1))
			{
				result.append(Input.charAt(i-1)).append(Count); /// 
				Count=1;
				
			}else {
				Count++;
				
			}

		}
		
		result.append(Input.charAt(Input.length()-1)).append(Count);
		
		System.out.println(result);
		
//		twopointer
//
//	
//		l
//		r
//		
//		while
		

		

	}

}
