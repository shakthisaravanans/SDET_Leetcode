package Java8Features.StreamsAPI;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Arraysstrems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,8,2,5,6};
		
		//Streams 
		
		IntStream S = Arrays.stream(nums);
		
		 // long count = S.count();
		
		//or 
		System.out.println(S.count());
		
		/// Sort and print
		///
		System.out.println(" -------Count with lamda------");
		
		Arrays.stream(nums).sorted().forEach(no ->System.out.println(no));
		System.out.println(" -------methods referance------");
		
		Arrays.stream(nums).sorted().forEach(System.out::print);
		
		System.out.println(" -------methods referance------");
		
		Arrays.stream(nums).sorted().forEach(System.out::println);
		
	System.out.println(" -------Max------");
		
		System.out.println(Arrays.stream(nums).max());
		
		System.out.println(Arrays.stream(nums).sum());
		
		Arrays.stream(nums).findFirst();
		
		System.out.println(" -------Optional class------");
		
		 double asDouble = Arrays.stream(nums).sorted().average().getAsDouble();
		System.out.println(asDouble);
		
		//Filter
		//Distint
		
		
	}

}
