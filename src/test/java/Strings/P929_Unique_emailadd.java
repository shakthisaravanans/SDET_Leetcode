package Strings;

import java.util.HashSet;
import java.util.Set;

public class P929_Unique_emailadd {

	public int numUniqueEmails1(String[] emails) {

		String s = "testemai+l@lee.tcode.com";

		Set<String> emil_list = new HashSet<String>();

		String[] temp = s.split("@");
		if (s.indexOf('+') != -1) {
			temp[0] = temp[0].substring(0, s.indexOf('+'));
		}

		temp[0] = temp[0].replaceAll("//.", "");

		emil_list.add(temp[0] + "@" + temp[1]);

		return emil_list.size();
	}

	public int numUniqueEmails(String[] emails) {

		Set<String> emil_list = new HashSet<String>();

		for (String Email : emails) {

			
			String[] temp = Email.split("@");
			int indexplus = temp[0].indexOf('+');
			if (indexplus != -1) {
				temp[0] = temp[0].substring(0, indexplus);
			}
			temp[0] = temp[0].replaceAll("\\.", "");
			emil_list.add(temp[0] + "@" + temp[1]);
		}
		return emil_list.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		P929_Unique_emailadd sample = new P929_Unique_emailadd();

		System.out.println(sample.numUniqueEmails(emails));

	}

}
