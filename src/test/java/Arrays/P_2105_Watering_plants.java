package Arrays;

public class P_2105_Watering_plants {

	public int minimumRefill(int[] plants, int capacityA, int capacityB) {

		int results = 0, tempcapacityA = capacityA, tempcapacityB = capacityB;

		int l = 0, r = plants.length - 1;

		while (l < r) {
			if (plants[l] < tempcapacityA) {
				tempcapacityA -= plants[l];
				l++;
			} else {
				tempcapacityA = capacityA;
				results++;
			}

			if (plants[r] < tempcapacityB) {
				tempcapacityB -= plants[r];
				r--;
			} else {
				tempcapacityB = capacityB;
				results++;
			}
		}

		if (l == r) {

			int MaxCap = Math.max(tempcapacityA, tempcapacityB);
			if (MaxCap < plants[r]) {
				results++;
			}
		}

		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] plants = { 2,1,1 };
		int capacityA = 2, capacityB = 2;
		// L = 3 R 3
		// L=1 R 1 0
		//

		P_2105_Watering_plants sample = new P_2105_Watering_plants();
		System.out.println(sample.minimumRefill(plants, capacityA, capacityB));
	}

}
