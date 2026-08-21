package collectors.opertaions;

import java.util.stream.Collectors;

import data.EmpData;
import data.Employee;

public class GroupingData {

	public static void main(String[] args) {
		
		System.out.println(EmpData.employees.stream()
				.collect(Collectors.groupingBy(emp->emp.department(),Collectors.mapping(e->(e.name()+" "+e.department()), Collectors.toList()))));

		System.out.println(EmpData.employees.stream()
				.collect(Collectors.groupingBy(emp->emp.department(),Collectors.counting())));

		
	}

}
