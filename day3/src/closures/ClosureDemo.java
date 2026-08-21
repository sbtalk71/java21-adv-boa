package closures;

import java.util.function.Function;

public class ClosureDemo {

	public static Function<Integer, Integer> createMultiplier(){
		
		int multiplier=10;
		
		//multiplier=30;
		
		return n->n*multiplier;
	}
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> myMultiplier=createMultiplier();
		
		System.out.println(myMultiplier.apply(20));
		
		
		int num=20;
		
		Function<Integer, Integer> add20=n->n+num;
		
		
		
	}

}
