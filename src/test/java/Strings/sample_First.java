package Strings;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.standard.RequestingUserName;

public class sample_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String s = "Let's take LeetCode contest";
		
		StringBuilder resultsadd = new StringBuilder();
		String[] results = s.split(" ");
		
		
		for(String add : results)
		{	
			StringBuilder builder = new StringBuilder(add);
			
			resultsadd.append(builder.reverse()).append(" ");

			
		}
		
		System.out.println(resultsadd.toString().trim());

//		
//		int[] nums = {3, 30, 34, 5, 9};
//		//String expected = "9534330";
//		String[] words = {"leet","code"};
//char x ='e';
//		
//ArrayList<Integer> l1 = new ArrayList<Integer>();
//		
//		for(int i=0;i<words.length;i++)
//		{
//			if(words[i].contains(String.valueOf(x)))
//			{
//				l1.add(i);
//			}
//		}
//		
//		
//		System.out.println(l1);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//StringBuilder s = new StringBuilder();

//	String[] results = new String[nums.length];
//
//	for(int i=0;i<nums.length;i++)
//	{
//
//	    results[i]=String.valueOf(nums[i]);
//
//
//	}
//	
//	Arrays.sort(results);
//	
//	
//	for(int i=results.length-1;i>=0;i--)
//	{
//		s.append(results[i]);
//		
//	}
//	
//	
//					
//					
//					
//
//System.out.println(s);
			
	}

}
