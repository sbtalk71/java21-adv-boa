package collectors.opertaions;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

import data.EmpData;
import data.Employee;

public class SummerizingDemo {

	public static void main(String[] args) {
		
		DoubleSummaryStatistics statsOnSalary=EmpData.employees.stream()
				.collect(Collectors.summarizingDouble(Employee::salary));
		
		System.out.println("Total Count: "+statsOnSalary.getCount());
		System.out.println("Total Salary: "+statsOnSalary.getSum());
		System.out.println("Min Salary: "+statsOnSalary.getMin());
		System.out.println("Max Salary: "+statsOnSalary.getMax());
		System.out.println("Average Salary: "+statsOnSalary.getAverage());
		

	}

}
