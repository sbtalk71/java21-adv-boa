package streams;

import data.EmpData;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		/*
		 * if(EmpData.employees.stream().anyMatch(e->e.salary()>100000)) {
		 * EmpData.employees.stream().filter(e->e.salary()>100000).forEach(System.out::
		 * println); }
		 */

		/*
		 * if(EmpData.employees.stream().allMatch(e->e.salary()>80000)) {
		 * EmpData.employees.stream().filter(e->e.salary()>80000).forEach(System.out::
		 * println); }
		 */
		
		if(EmpData.employees.stream().noneMatch(e->e.salary()<70000)) {
			EmpData.employees.stream().filter(e->e.salary()<70000).forEach(System.out::println);
		}
	}

}
