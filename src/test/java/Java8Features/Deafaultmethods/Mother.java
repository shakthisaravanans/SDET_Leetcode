package Java8Features.Deafaultmethods;

@FunctionalInterface
public interface Mother {
	
	public abstract void buildhouse(); // Abstract methods need to impelement 

	//
	
	default void wallcolour()
	{
		System.out.println("Red");
	}
	
	  static void floorcolour()
	{
		System.out.println("rose");
	}
	
	public static void main(String[] args) {
		Mother.floorcolour();
	}
}
