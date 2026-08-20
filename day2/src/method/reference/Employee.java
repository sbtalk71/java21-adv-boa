package method.reference;

public class Employee {

	private String name;
	private int id;
	private double salary;

	public Employee(String name) {
		this.name = name;
	}
	
	
	public Employee( int id, String name, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}
	
}
