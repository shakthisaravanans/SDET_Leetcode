package Java8Features.Deafaultmethods;

@FunctionalInterface
public interface wife {
	public abstract void buildhouse();
	
	default void wallcolour()
	{
		System.out.println("blue");
	}
}
