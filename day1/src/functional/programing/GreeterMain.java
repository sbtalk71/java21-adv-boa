package functional.programing;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GreeterMain {

	public static void main(String[] args) {

		GoodMorning gm = new GoodMorning();
		System.out.println(gm.greet());

		Greeter ge = new Greeter() {

			@Override
			public String greet() {

				return "Good Evening!!";
			}

		};

		Greeter gn = () -> "Good Night"; //left params list --> right impl
		
		System.out.println(gn.greet());
		
		
		Predicate<Integer> isEven=t->t%2==0;
		
		Supplier<String> nameSupplier= ()->"Tiger";
		
		System.out.println(nameSupplier.get());
		
		Function<Integer, Integer> doubleNum=(n)->2*n;
		
		System.out.println(doubleNum.apply(3));
		
		Concat concat=(s1, s2)->s1+" "+s2;
		
		System.out.println(concat.doConcat("Ravi", "Yadav"));
		
		//a number is odd and divisible by and odd number
		
		

	}

}

class GoodMorning implements Greeter {

	@Override
	public String greet() {

		return "Good Morning";
	}

}