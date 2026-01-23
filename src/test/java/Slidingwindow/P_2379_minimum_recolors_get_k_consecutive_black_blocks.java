package Slidingwindow;

public class P_2379_minimum_recolors_get_k_consecutive_black_blocks {

	public int minimumRecolors(String blocks, int k) {
		int i = 0, minRecol = Integer.MAX_VALUE, Tempmin = 0;
		int len = blocks.length();
		while (i < len & (i + k) <= len) {
			for (int j = i; j < (i + k); j++) {
				if (blocks.charAt(j) == 'W') {
					Tempmin++;
				}
			}
			i++;
			minRecol = Math.min(minRecol, Tempmin);
			Tempmin = 0;
		}
		return minRecol;

		/*
		 * for (int j = i,l=0; j < i+k-l; j++,l++) { if(blocks.charAt(j)=='W')
		 * {Tempmin++;} if(j!=(i+k-l-1)&blocks.charAt(i+k-l-1)=='W') {Tempmin++;} }
		 */

	}

	public int minimumRecolors1(String blocks, int k) {
		int i = 0, minRecol = Integer.MAX_VALUE, Tempmin = 0;

		while (i < blocks.length() & (i + k) <= blocks.length()) {
			String temp = blocks.substring(i, i + k);
			for (int j = 0; j < k; j++) {
				if (temp.charAt(j) == 'W') {
					Tempmin++;
				}
			}
			i++;
			if (minRecol > Tempmin) {
				minRecol = Tempmin;
			}
			Tempmin = 0;

		}

		return minRecol;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2379_minimum_recolors_get_k_consecutive_black_blocks s = new P_2379_minimum_recolors_get_k_consecutive_black_blocks();

		System.out.println(s.minimumRecolors("WBWBBBW", 2));
	}

}
