
package Strings;

import java.util.HashMap;
import java.util.Map;

import org.testng.internal.annotations.IBeforeMethod;

public class samplesmaxrtsing {

	public static void main(String[] args) { // TODO Auto-generated method stub

		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("Mumbai", 10000);
		maps.put("Delhi", 15000);
		maps.put("Goa", 12000);
		maps.put("Bangalore", 9000);
		maps.put("Chennai", 13000);

		String TempFirst = "", Tempsecon = "";

		for (Map.Entry<String, Integer> entry : maps.entrySet()) {

			String key = entry.getKey();
			Integer val = entry.getValue();

			if (TempFirst.isBlank()) {
				TempFirst = key;
				continue;
			}
			if (maps.get(TempFirst) < val) {
				TempFirst = key;
				continue;
			} else if (Tempsecon.isBlank()) {
				Tempsecon = key;
				continue;
			} 
			else if (maps.get(Tempsecon) < val) {
				Tempsecon = key;
			}

		}
		System.out.println(TempFirst);
		System.out.println(Tempsecon);
	}

}
