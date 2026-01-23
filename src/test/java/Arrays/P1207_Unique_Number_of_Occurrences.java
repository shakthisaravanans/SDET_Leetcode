package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P1207_Unique_Number_of_Occurrences {

	public boolean uniqueOccurrences(int[] arr) {

		HashMap<Integer, Integer> unq = new HashMap<Integer, Integer>();
		

		for(int i=0;i<arr.length;i++)
		{
			unq.put(arr[i], unq.getOrDefault(arr[i], 0) + 1);
			

		}
		
//		for (int i : arr) {
//			
//			unq.put(arr[i-1], unq.getOrDefault(arr[i], 0) + 1);
//			
//		}
		HashSet<Integer> s2 = new HashSet<Integer>(unq.values());
		if (s2.size() == unq.size()) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1207_Unique_Number_of_Occurrences s = new P1207_Unique_Number_of_Occurrences();
		int[] arr = {1,2,2,1,1,3};
		System.out.println(s.uniqueOccurrences(arr));
	}

}
