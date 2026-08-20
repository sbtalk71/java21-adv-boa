package objectclass.methods;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		
		Employee emp=new Employee(100,"Tiger");
		
		System.out.println(emp);
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(emp);
		
		System.out.println(empList);

	}

}
