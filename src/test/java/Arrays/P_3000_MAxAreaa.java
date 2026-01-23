package Arrays;

public class P_3000_MAxAreaa {

	public int areaOfMaxDiagonal(int[][] dimensions) {

		double Maxval = 0f;
		int Maxare = 0;

		for (int i = 0; i < dimensions.length; i++) {

			int l = dimensions[i][0];
			int h = dimensions[i][1];
			//double temp = Math.sqrt(Math.pow(l, 2) + Math.pow(h, 2));
			double temp = Math.pow(l, 2) + Math.pow(h, 2);
						if (temp == Maxval) {

				Maxare = Math.max(Maxare, (l * h));

			} else if (temp > Maxval) {
				Maxval = temp;
				Maxare = l * h;
			}

		}

		return Maxare;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3000_MAxAreaa sample = new P_3000_MAxAreaa();

		int[][] dimention = {{2,6},{5,1},{3,10},{8,4}};

		System.out.println(sample.areaOfMaxDiagonal(dimention));
	}

}
