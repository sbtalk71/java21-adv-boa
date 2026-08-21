package threads.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddFromListMain {

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool(5);
		
	List<Integer> numList=new ArrayList<Integer>();
	for(int i=1;i<99;i++) {
		numList.add(i);
	}
		AddFromListTask task= new AddFromListTask(numList);
		
	int sum=fjp.invoke(task);
	System.out.println("The sum = "+sum);
	}

}
