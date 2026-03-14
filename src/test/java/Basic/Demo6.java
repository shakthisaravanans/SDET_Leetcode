package Basic;

import java.util.HashSet;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S= "Sakthi saravanan";
		
		S= S.toLowerCase();
		
		StringBuilder results = new StringBuilder();
		
		Set<Character> validate = new HashSet<Character>();
		
		
		for(char i : S.toCharArray())
		{
		
			if(validate.add(i))
			{
				results.append(i);
			}
		}
		
		System.out.println(results);

	}

}
