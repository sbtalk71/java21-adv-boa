package functional.programing;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class LambdaTests {

	public static void main(String[] args) {
	
		//sum of 2 positive numbers >10
		
		BiPredicate<Integer, Integer> condition=(n1,n2)->n1>0&&n2>0&&(n1+n2>10);
		
		System.out.println(condition.test(1, 8));
		
		BiPredicate<Integer, Integer> bothPositive=(n1,n2)->n1>0&&n2>0;
		
		BiPredicate<Integer, Integer> sumeMoreThan10=(n1,n2)->n1+n2>10;
		
		BiPredicate<Integer, Integer> condition1=bothPositive.and(sumeMoreThan10);
		
		System.out.println(condition1.test(11, 8));
	}

}
