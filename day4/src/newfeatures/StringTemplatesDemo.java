package newfeatures;

public class StringTemplatesDemo {

	public static void main(String[] args) {
		
		String name="Shantanu";
		int age=55;
		
		//traditional
		String message="My Name is "+name+" and I am "+age+" years old";
		
		//String message2=STR."My name is \{name} and I am \{age} years old";
		
		//String message3="My name is %s and I am %d years old".formatted(name,age);
		//System.out.println(message2);

	}

}
