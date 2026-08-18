package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<List<Integer>> nestedList=Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9));
		
		System.out.println(nestedList);
		Stream<List<Integer>> listOfInt=nestedList.stream();
		
	List<Integer> flatList=	listOfInt.flatMap(list->list.stream()).collect(Collectors.toList());
	
	
	System.out.println(flatList);

	}

}
