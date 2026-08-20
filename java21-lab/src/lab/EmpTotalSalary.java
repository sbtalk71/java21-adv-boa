package lab;

import data.EmpData;

public class EmpTotalSalary {

	public static void main(String[] args) {
		
	Double totalSalary=	EmpData.employees.stream().mapToDouble(e->e.salary()).reduce((s1,s2)->(s1+s2)).getAsDouble();

	System.out.println(totalSalary);
	
	EmpData.employees.stream().filter(emp->emp.city().equals("Pune")).forEach(System.out::println);
	}

}
