package Strings;

public class P_1108_IP_Address {

	public String defangIPaddr(String address) {

		return address.replace(".", "[.]");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1108_IP_Address sample = new P_1108_IP_Address();

		System.out.println(sample.defangIPaddr("255.100.50.0"));

	}

}
