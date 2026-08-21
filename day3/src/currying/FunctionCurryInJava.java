package currying;

import java.util.function.Function;

public class FunctionCurryInJava {

	public static void main(String[] args) {
		
		//Function<Integer, Function<Integer,Integer>> xx=a->b->(a+b);
		
		Function<Integer, Function<Integer,Function<Integer,Integer>>> add=a->b->c->a+b+c;
		
		Integer result=add.apply(10).apply(20).apply(30);
		
		System.out.println(result);
		
		Function<Integer, Function<Integer,Integer>> add10=add.apply(10);
		
		System.out.println(add10.apply(20).apply(20));
		
		System.out.println(add10.apply(30).apply(40));

	}

}
