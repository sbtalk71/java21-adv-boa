package collections.in.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsDemo {

	public static void main(String[] args) {
	List<Integer> numsList=	List.of(1,2,3,4,4,4,5,6,6,8);
	
	List<String> fruits=List.of();
	
	fruits.add("Apple"); //not permitted as its immutable
	
	System.out.println(fruits.getClass().getName());
	
	
	Set<Integer> numsSet=Set.of(1,2,3,4,5,6,8);
	
	System.out.println(numsSet);
	
	Map<String, Integer> numsMap=Map.of("One",1,"Two",2);
	System.out.println(numsMap);

	}

}
