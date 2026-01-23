package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Twopointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 5, 3, 3, 4, 6, 7, 7, 8 };

		// o/p = 7

//		1)make count as variable 
//		2make nested forloop and i and j i should be check it have valeu is equal to j values if not count++ else break move to next
//		
//		

		int count = 0;
		boolean as = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					as = false;
					break;
				}

			}
			if (as == true) {
				count++;

			}
			as = true;
		}
		System.out.println(count);
	}

}
