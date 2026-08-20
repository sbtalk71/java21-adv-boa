package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		//Stream<Integer> nums=Stream.of(1,2,3,4,5,6,7,8,9,12,14,15,16,23,25,34,87,89,90);
		
		List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,12,14,15,16,23,25,34,87,89,90);
		
		//nums.filter(num->num%2==0).forEach(n->System.out.print(n+" "));
		
		nums.stream().filter(num->num%2==0).map(n->n+" ").forEach(System.out::print);
		
		List<Integer> evenNums=nums.stream().filter(num->num%2==0).collect(Collectors.toList());
		
		Map<Integer,Integer>mapOfOddNums=nums.stream().filter(n->n%2!=0)
				.collect(Collectors.toMap(n->n, n->n+10));
		System.out.println(mapOfOddNums);
		
		

	}

}
