package List;

import java.util.ArrayList;
import java.util.List;

public class P_Quest_build_Array_with_stack {

	public List<String> buildArray(int[] target, int n) {

		int lenT = target.length, Count = 0, t_Count = 0;

		List<String> Build = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if (i == target[t_Count]) {
				Build.add("Push");
				t_Count++;
				
				if(t_Count==lenT) {
					return Build;
				}

			} else {
				Build.add("Push");
				Build.add("Pop");

			}

		}

		return Build;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Quest_build_Array_with_stack sample = new P_Quest_build_Array_with_stack();
		int[] target = { 1, 3 };
		System.out.println(sample.buildArray(target, 3));
	}

}
