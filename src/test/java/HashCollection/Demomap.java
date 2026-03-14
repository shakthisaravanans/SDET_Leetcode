package HashCollection;

import java.util.HashMap;

public class Demomap {

	public boolean isTrionic(int[] nums) {

		boolean Fstphase = false, Secdphase = false, Thidphase = false;

		for (int i = 1; i < nums.length; i++) {
			if (Fstphase == false && nums[i - 1] < nums[i])

			{
				Fstphase=true;
			} else {return false;}
			
			
			 if (Fstphase == true && Secdphase == false && nums[i - 1] < nums[i])

			{
				return false;
			}

			else if (Fstphase == true && Secdphase == true && Thidphase == false && nums[i - 1] > nums[i])

			{
				return false;
			}

		}

		return Fstphase && Secdphase && Thidphase;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "Sakthi saravanan s";

		Demomap sample = new Demomap();

		int[] nums = { 1, 3, 5, 4, 2, 6 };

		System.out.println(sample.isTrionic(nums));

		HashMap<Character, Integer> Maps = new HashMap<Character, Integer>();

		for (char i : Name.toCharArray()) {
			Maps.put(i, Maps.getOrDefault(i, 0) + 1);

		}

		for (char s : Maps.keySet())

		{
			if (Maps.get(s) > 1) {
				System.out.println("Characrter as  " + s + " values " + Maps.get(s));
			}

		}
	}

}
