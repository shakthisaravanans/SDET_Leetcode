package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee_Comrator {

	private Integer Empid;
	private String Emplname;
	private Integer empsalary;

	public Integer getEmpid() {
		return Empid;
	}

	public String getEmplname() {
		return Emplname;
	}

	public Integer getEmpsalary() {
		return empsalary;
	}

	public Employee_Comrator(Integer empid, String emplname, Integer empsalary) {
		this.Empid = empid;
		this.Emplname = emplname;
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Emplname=" + Emplname + ", empsalary=" + empsalary + "]";
	}

	public static class idsorting implements Comparator<Employee_Comrator> {

		@Override
		public int compare(Employee_Comrator o1, Employee_Comrator o2) {
			// TODO Auto-generated method stub
			return o1.Emplname.compareTo(o2.Emplname);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee_Comrator> emp = new ArrayList<Employee_Comrator>();
		emp.add(new Employee_Comrator(123, "Sakthi", 10000));
		emp.add(new Employee_Comrator(149, "rose", 20000));
		emp.add(new Employee_Comrator(125, "Aman", 40000));
		emp.add(new Employee_Comrator(126, "kalki", 50000));

		Collections.sort(emp, new idsorting());
	//	emp.stream().sorted(e->e.)
		System.out.println(emp);

	}

}
