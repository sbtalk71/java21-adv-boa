package threads.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class NumberSplitMain {

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool(5);
		NumberSplitAction num=new NumberSplitAction(400);
		
		fjp.invoke(num);

	}

}
