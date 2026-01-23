package Strings;

public class Reverseevenword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "I Am sakthi saravanan";
		
		//oP = "I mA sakthi nanabarsa"
		
		
		String[] splitString = text.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < splitString.length; i++) {
			
			if(i%2==0)
			{
				result.append(splitString[i]).append(" ");
			}else {
				StringBuilder temp =new StringBuilder(splitString[i]);
				result.append(temp.reverse()).append(" ");
			}
			
		}
		
		System.out.println(result.toString().trim());
				

	}

}
