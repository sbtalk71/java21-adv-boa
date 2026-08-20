package method.reference;

import java.util.function.Function;

public class ConstructoRefDemo {

	public static void main(String[] args) {
		//ClassName::new
		
		Function<String, Employee> empCreator=name->new Employee(name);
		
		Function<String, Employee> empCreator2=Employee::new;
		
		Employee e=empCreator2.apply("John");
		System.out.println(e.getName());
		
		
		EmpCreator empCreator3=Employee::new;
		
		Employee e2=empCreator3.create(100, "Shantanu", 50000);
		
		EmpCreator empCreator4= (x,y,z)->new Employee(x, y, z);
		
		
	}

}
