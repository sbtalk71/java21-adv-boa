package method.reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenmceDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=n->Calculator.square(n);
		
		System.out.println(f.apply(5));
		
		
		Function<Integer, Integer> f2=Calculator::square;
		
		
		
		Calculator cal=new Calculator();
		Function<Integer, Integer> f3=cal::multiplyBy2;
		
		Supplier<Integer> intSupplier=Calculator::getNum;
		
		
		Function<String, String> upperCaseConverter=String::toUpperCase;
		
		System.out.println(upperCaseConverter.apply("java"));

	}

}
