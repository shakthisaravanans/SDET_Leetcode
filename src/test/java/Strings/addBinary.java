package Strings;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class addBinary {
	
public String addBinary(String a, String b) {
	
//	
//	Input: a = "1010", b = "1011"
//			Output: "10101"
//			 
//				
//			I/p : Two stings with one and zero
//			o/P: string
//	
//steps : get lenth of both strings a and b and loop till max of string
//2)traves from right of the string and assigned new temp values
//
//if(a.right and b.roght =1 and temp =0)
//{the add current sting as 0 and make temp and 0
//	{
//else if 
//	}
//}
	int xor=0;
	
	//xor=a.charAt(3)+b.charAt(3)+1;
	
	Integer s = new Integer(a);
	Integer s1 = new Integer(b);
	System.out.println(s.toBinaryString(s1));
	
	
	
	return b;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addBinary s = new addBinary();
		s.addBinary("11","10");
		
		
		List<String> emails = Arrays.asList("test@gmail.com", "admin@gmail.com", "guest@test.com");

		List<String> onlyGmail = emails.stream()
		    .filter(e -> e.endsWith("@gmail.com"))
		    .map(e -> e.split("@")[0]) // extract name
		    .collect(Collectors.toList());

		List<String> names = Arrays.asList("Sakthi", "John", "Sam", "Sundar");

		List<String> sNames = names.stream().sorted()
		    .filter(name -> name.startsWith("S")).collect(Collectors.toList());
		
		
		int[] arrayss = new int[] {1,3,4};
		
		int sumsarray = Arrays.stream(arrayss).sum();
		
	System.out.println(sumsarray);

	}

}
