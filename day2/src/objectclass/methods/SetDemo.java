package objectclass.methods;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Employee> empSet=new HashSet<Employee>();
		
		empSet.add(new Employee(100, "Srikanth"));
		empSet.add(new Employee(101, "Aniket"));
		empSet.add(new Employee(102, "Rajeev"));
		empSet.add(new Employee(100, "Shantanu"));
		empSet.add(new Employee(100, "Shantanu"));
		empSet.add(new Employee(100, "Shantanu"));
		
		System.out.println(empSet);

	}

}
