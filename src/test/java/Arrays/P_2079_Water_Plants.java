package Arrays;

public class P_2079_Water_Plants {
	public int wateringPlants(int[] plants, int capacity) {

		int result = 0, Len = plants.length, Tempcap = capacity;

		for (int i = 0; i < Len; i++) {
			if (Tempcap >= plants[i]) {
				Tempcap-=plants[i];
				result++;
			}else {
				result+=(i*2)+1;
				Tempcap=capacity;
				Tempcap-=plants[i];
				
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2079_Water_Plants sample = new P_2079_Water_Plants();

		int[] plants = { 1, 1, 1, 4, 2, 3 };
		System.out.println(sample.wateringPlants(plants, 4));
	}

}
