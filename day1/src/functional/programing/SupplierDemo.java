package functional.programing;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> stringSupplier=()->"Hello World";
		
		
		System.out.println(stringSupplier.get());

	}

}
