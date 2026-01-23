package Arrays;

public class Subarraywithxor {
	
	
	public int subsetSum(int[] nums) {
	    int total = 0;
	    for (int num : nums) {
	        total |= num;
	    }
	    return total * (1 << (nums.length - 1));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subarraywithxor s = new Subarraywithxor();
		
		int [] nums = {5,1,6};
		
		System.out.println(s.subsetSum(nums));
	}

}
