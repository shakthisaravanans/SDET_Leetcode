package Java8Features.Deafaultmethods;

public class Def_methods implements Mother,wife{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mother m = () -> {System.out.println("Mother");};    // Lamda impementaion with interface calling interface
		m.buildhouse();  /// calling the before object also
		
		Def_methods a = new Def_methods(); // constrctor and mainting them 
		a.buildhouse();
		
Mother x = new Def_methods();  // we can default method wh
System.out.println("Def methods for wall colour");
x.wallcolour();
Mother.floorcolour(); // static methods can access only y 

/*
 * only one Abstract should be in interface for functional interface 
 * absytration is northing but rules which given to class to implement
 * 
 * construtor need to created and need to use the same.
 * 
 * 
 * 
 * */

	}

	/*
	 * @Override public void buildhouse() { // TODO Auto-generated method stub
	 * System.out.println("House build"); }
	 */

	@Override
	public void wallcolour() {
		// TODO Auto-generated method stub  //Eighter mom or wife or urself 
		wife.super.wallcolour(); 
	//	wife.super.wallcolour();
		System.out.println("White");
	}

	@Override
	public void buildhouse() {
		// TODO Auto-generated method stub
		
		System.out.println("Sakthi");
		
	}


	


}
