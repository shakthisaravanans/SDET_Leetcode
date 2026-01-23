package TwoPointer;

public class P_42_Trapping_Rain_Water {

	public int trap(int[] height) {

		/**
		 * Step1 :Ip : array and o/P is int 
		 * Step2: prefix all largestval from left and
		 * right array and add them 
		 * step3:for loop the values minof both index and
		 * -height of it
		 * 
		 */
		int lenheight = height.length - 1; // 5
		int[] Lmax = new int[lenheight + 1];// 6
		int[] Rmax = new int[lenheight + 1];
		Lmax[0] = height[0];
		Rmax[lenheight] = height[lenheight];
		int trapwater = 0;
		for (int i = 1; i < height.length; i++) {
			Lmax[i] = Math.max(Lmax[i - 1], height[i]);
			Rmax[(lenheight) - i] = Math.max(Rmax[lenheight+1 - i], height[lenheight-i]);
		}

		for (int j = 0; j < height.length; j++) {
			trapwater += Math.max(0, Math.min(Lmax[j], Rmax[j]) - height[j]);
		}

		return trapwater;

	}

	public static void main(String[] args) {
		P_42_Trapping_Rain_Water s = new P_42_Trapping_Rain_Water();
		int[] a = { 4, 2, 0, 3, 2, 5 };
		int[] b = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(s.trap(b));

	}

}
