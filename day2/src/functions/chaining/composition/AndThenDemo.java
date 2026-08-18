package functions.chaining.composition;

import java.util.function.Function;

public class AndThenDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> doubleIt=x->x*2;

		Function<Integer, Integer> addTen=x->x+10;
		
		Function<Integer, Integer> combine=doubleIt.andThen(addTen).andThen(doubleIt);
		
		System.out.println(combine.apply(2));
		
		
		Function<Integer, Integer> combine2=doubleIt.compose(addTen).compose(doubleIt);
		
		System.out.println(combine2.apply(2));
	}

}
