package Demo_int;

import java.util.HashMap;
import java.util.Map.Entry;

public class Demo {

	HashMap<String, Integer> shope = new HashMap<String, Integer>();
	public static int totalvale = 0;
	
	public int shopcart() {

		//HashMap<String, Integer> shope = new HashMap<String, Integer>();

		shope.put("Apple-16", 10000);
		shope.put("Samsung-100", 20000);
		shope.put("Apple-15", 40000);
		shope.put("pixil-7", 70000);

		//int totalvale = 0;

		for (int i : shope.values()) {

			totalvale = totalvale + i;
		}

		return totalvale;

	}

	public int Additem(String item, int price) {
		
		totalvale = totalvale + price;
		shope.put(item, price);

		return totalvale;

	}

	public int Deleteitem(String item, int price) {
		//HashMap<String, Integer> shope = new HashMap<String, Integer>();
		totalvale = totalvale - price;
		shope.remove(item);
		return totalvale;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo();
		int totalamount = d.shopcart();
		System.out.println(totalamount);
		
		
		totalamount = d.Additem("Apple-mini", 1000);
		System.out.println("After adding Apple mini " + totalamount);
		totalamount = d.Deleteitem("Apple-mini", 1000);
		System.out.println("After deleting apple-mini" + totalamount);
		
		
		

		// You are creating a shopping cart application. Design a class called
		// "ShoppingCart" that can hold a list of items. Each item has a name and price.
		// Implement methods to add items to the cart, remove items from the cart,
		// calculate the total price of all items in the cart, and display the contents
		// of the cart.

	}

}
