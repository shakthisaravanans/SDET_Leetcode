package Arrays;

public class P_3701_Compute_Alternative_Sum {
	 public int alternatingSum(int[] nums) {
	
		 int results =0;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(i%2==0)
			 {
				 results+=nums[i];
			 }else {results-=nums[i];}
		 }
		 
		 return results;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3701_Compute_Alternative_Sum sample = new P_3701_Compute_Alternative_Sum();
		
		int[] nums = {1,3,5,7};
		
		System.out.println(sample.alternatingSum(nums));
	}

}
