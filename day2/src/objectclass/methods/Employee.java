package objectclass.methods;

import java.util.Objects;

public class Employee {

	private int empId;
	private String name;

	/*
	 * public Employee() { // TODO Auto-generated constructor stub }
	 */

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * @Override public String toString() { return empId+" "+name; }
	 */

	/*
	 * @Override public int hashCode() {
	 * System.out.println("hashCode method called.."+empId+" "+this); return
	 * Objects.hash(empId); }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * System.out.println("equals method called.. for comparing  "+this
	 * +" and "+obj); if (this == obj) return true; if (obj == null) return false;
	 * if (getClass() != obj.getClass()) return false; Employee other = (Employee)
	 * obj; return empId == other.empId; }
	 */
	
	

}
