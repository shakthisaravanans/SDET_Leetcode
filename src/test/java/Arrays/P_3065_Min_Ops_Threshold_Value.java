package Arrays;

public class P_3065_Min_Ops_Threshold_Value {
	  public int minOperations(int[] nums, int k) {
		
		  int Count = 0;
		  
		  for(int i:nums)
		  {
			  if(i<k)
			  {
				  Count++;
			  }
		  }
		  
		  return Count;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3065_Min_Ops_Threshold_Value sample = new P_3065_Min_Ops_Threshold_Value();
		int[] nums = {2,11,10,1,3};
		System.out.println(sample.minOperations(nums, 10));
	}

}
