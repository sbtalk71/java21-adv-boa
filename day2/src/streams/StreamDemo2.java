package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 12, 14, 15, 15, 16, 23, 25, 34, 87, 87,
				89, 90);

		/*
		 * nums.stream().distinct().forEach(n -> System.out.print(n + " "));
		 * 
		 * // find all the even numbers between 20 and 90, add 10 to each number and
		 * store // the result data to List
		 * 
		 * // find the maximum of all the odd numbers nums.stream().filter(n -> n % 2 !=
		 * 0).distinct().limit(5).peek(System.out::print).mapToInt(n -> n.intValue())
		 * .max().getAsInt(); // add all the even numbers
		 * 
		 * nums.stream().filter(n -> n % 2 == 0).mapToInt(n -> n.intValue()).sum();
		 * System.out.println(); // count the numbers in the list long count =
		 * nums.stream().count(); System.out.println(count);
		 * 
		 * nums.stream().sorted().forEach(n -> System.out.println(n + " "));
		 * 
		 * nums.stream().sorted((n1, n2) -> n2.compareTo(n1)).forEach(n ->
		 * System.out.println(n + " "));
		 * 
		 * System.out.println(); Integer num = nums.stream().filter(n -> n % 2 ==
		 * 0).peek(System.out::print).findAny().get();
		 * 
		 * System.out.println(num);
		 */
		
		System.out.println(nums.stream().mapToInt(n->n.intValue())
				.reduce((n1,n2)->{System.out.println(n1+"+"+n2+" = "+(n1+n2));return (n1+n2);}).getAsInt());
		
		
		System.out.println(nums.stream().mapToInt(n->n.intValue()).reduce((n1,n2)->(n2)).getAsInt());
		
		

	}

}
