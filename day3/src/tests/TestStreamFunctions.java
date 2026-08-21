package tests;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import data.EmpData;
import data.Employee;

public class TestStreamFunctions {

	@Test
	void testSUmmerizingDouble() {
	DoubleSummaryStatistics statsOnSalary=EmpData.employees.stream()
			.collect(Collectors.summarizingDouble(Employee::salary));
	
	System.out.println("Total Count: "+statsOnSalary.getCount());
	System.out.println("Total Salary: "+statsOnSalary.getSum());
	System.out.println("Min Salary: "+statsOnSalary.getMin());
	System.out.println("Max Salary: "+statsOnSalary.getMax());
	System.out.println("Average Salary: "+statsOnSalary.getAverage());
	}
	
	@Test
	void testPartioningBy() {
	Map<Boolean, List<Employee>> result=EmpData.employees.stream().collect(Collectors.partitioningBy(emp->emp.salary()>=75000));
	//System.out.println(result);
	
	List<Employee> highSalary=result.get(true);
	List<Employee> lowSalary=result.get(false);
	
	highSalary.stream().forEach(System.out::println);
	
	}
	
	@Test
	void testJoining() {
		System.out.println(EmpData.employees.stream().map(emp->emp.name()).collect(Collectors.joining(",")));
	}
	
	@Test
	void parallelStream() {
		EmpData.employees.parallelStream().map(emp->emp.name()).forEach(System.out::println);
		
	}
}
