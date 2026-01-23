package Arrays;

import java.util.ArrayList;
import java.util.List;

public class P_735_Asteroid_Collision {

	public int[] asteroidCollision(int[] asteroids) {

		List<Integer> l1 = new ArrayList<Integer>();
		int i = asteroids.length - 1;
		while (i >= 0) {
			if (asteroids[i] > 0) {
				l1.add(asteroids[i]);
				i--;
			} else {

				for (int j = i - 1; j >= 0; j--) {

					int temp = asteroids[j] + asteroids[i];
					if (asteroids[j] > 0 && asteroids[j] + asteroids[i] >= 0) {
						if (temp != 0) {
							l1.add(asteroids[j]);
						}
						i = j - 1;
						break;
					}
				}
			}
		}

		System.out.println(l1);
		return asteroids;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] asteroids = { 3, 5, -6, 2, -1, 4 };
		P_735_Asteroid_Collision sample = new P_735_Asteroid_Collision();
		System.out.println(sample.asteroidCollision(asteroids));

	}

}
