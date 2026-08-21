package newfeatures.records;

public class RecordDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(99,"Shantanu","Hyderabad",78000.0);
		Employee e2=new Employee(100,"Shantanu","Hyderabad",78000.0);
		
		System.out.println(e1);
		
		System.out.println(e1.name());
		System.out.println(e1.city());
		
		System.out.println(e1.equals(e2));

	}

}
