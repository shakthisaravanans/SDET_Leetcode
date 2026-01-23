package Java8Features;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {

	private Integer Empid;
	private String Emplname;
	private Integer empsalary;

//	public Integer getEmpid() {
//		return Empid;
//	}
//
//	public String getEmplname() {
//		return Emplname;
//	}
//
//	public Integer getEmpsalary() {
//		return empsalary;
//	}

	
	public Employee(Integer empid, String emplname, Integer empsalary) {
		this.Empid = empid;
		this.Emplname = emplname;
		this.empsalary = empsalary;
	}
	
		
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Emplname=" + Emplname + ", empsalary=" + empsalary + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(123,"Sakthi",10000));
		emp.add(new Employee(149,"Sakthi",10000));
		emp.add(new Employee(125,"Sakthi",10000));
		emp.add(new Employee(126,"Sakthi",10000));
		
		Collections.sort(emp);
		
		System.out.println(emp);
 
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.Empid.compareTo(Empid);
	}



}
