package newfeatures.records;

public record Employee(int empId, String name, String city, double salary) {

	/*
	 * public Employee{ if(empId<100) { throw new
	 * IllegalArgumentException("id Cannot be less than 100"); } }
	 */

	public Employee(int empId, String name, String city, double salary) {

		if (empId < 100) {
			throw new IllegalArgumentException("id Cannot be less than 100");
		}
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	public Employee(int empId, String name) {
		this(empId,name,"not known",0.0);
	}
}
