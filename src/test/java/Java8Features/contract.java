package Java8Features;

public interface contract {
	
	public default int add() {
		
		System.out.println("sasas");
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		contract cc = (contract) new Java_Features_Lamda();
		
			cc.add();
	}

}
