package Arrays;

import java.util.HashMap;
import java.util.Map;

public class P_781_Rabbits_inForest {
	public int numRabbits1(int[] answers) {

		int a = 3 / 3;
		int b = 3 % 3;

		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		int noRabits = 0;
		for (int i = 0; i < answers.length; i++) {

			int temp = maps.getOrDefault(answers[i], 0);

			if (temp <= answers[i]) {
				if (temp == 0) {
					maps.put(answers[i], answers[i] + 1);
				} else {
					maps.put(answers[i], temp + 1);
				}

			} else {
				noRabits = noRabits + temp;
				maps.put(answers[i], answers[i] + 1);
			}
		}

		for (int i : maps.values()) {
			noRabits = noRabits + i;
		}
		return noRabits;

	}

	public int numRabbits(int[] answers) {

		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		int noRabits = 0;
		for (int i : answers) {
			maps.put(i, maps.getOrDefault(i, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
			int Key = entry.getKey(), val = entry.getValue();
			int Group = Key + 1, noofgroup = (Key + val) / Group;
			noRabits += noofgroup * Group;
		}
		return noRabits;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 2 };
		P_781_Rabbits_inForest s = new P_781_Rabbits_inForest();
		System.out.println(s.numRabbits(nums));

	}

}
