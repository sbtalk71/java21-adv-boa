package threads.forkjoin;

import java.util.concurrent.RecursiveAction;

public class NumberSplitAction extends RecursiveAction {

	private double data;
	
	public NumberSplitAction(double data) {
		this.data = data;
	}

	@Override
	protected void compute() {
		if(data>10) {
			System.out.println("processing Data size "+data+" by "+Thread.currentThread().getName());
			NumberSplitAction t1=new NumberSplitAction(data/2);
			NumberSplitAction t2=new NumberSplitAction(data/2);
			t1.fork();
			t2.fork();
			t1.join();
			t2.join();
			
			
		}else {
			System.out.println("Split Data : "+data);
		}

	}

}
