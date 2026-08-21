package threads.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class AddFromListTask extends RecursiveTask<Integer> {

	private List<Integer> numList;
	
	public AddFromListTask(List<Integer> numList) {
		this.numList = numList;
	}

	@Override
	protected Integer compute() {
		int sum=0;
		if(numList.size()>2) {
			AddFromListTask task1=new AddFromListTask(numList.subList(0, numList.size()/2));
			AddFromListTask task2=new AddFromListTask(numList.subList(numList.size()/2,numList.size()));
			task1.fork();
			task2.fork();
			sum=task1.join()+task2.join();
		}else {
			for(Integer x:numList) {
				sum=sum+x;
			}
		}
		return sum;
	}

}
