package newfeatures.records;

public class RecordPatternsDemo {

	public static void main(String[] args) {
		Employee emp=new Employee(100, "Shantanu","Hyderabad",65000);
		
		String category=switch (emp) {
		case Employee(int id,String name,String city,double salary) when salary>100000->"Senior Executive";
		case Employee(int id,String name,String city,double salary) when salary>80000->"Executive";
		case Employee(int id,String name,String city,double salary) when salary<=70000->"Senior Employee";
		default->
			throw new IllegalArgumentException("Unexpected value: " + emp);
		};
		
		System.out.println(category);
		
		if(emp instanceof Employee(int id,String name,String city,double salary)) {
			System.out.println(salary);
		}
		
	}

}
