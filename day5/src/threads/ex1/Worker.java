package threads.ex1;

import threads.service.TablePrinter;

public class Worker implements Runnable {
	private TablePrinter tablePrinter;
	private int num;
	
	public Worker(TablePrinter tablePrinter, int num) {
		this.tablePrinter = tablePrinter;
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started..");
		synchronized (tablePrinter) {
			tablePrinter.printTable(num);
		}
	
		System.out.println(Thread.currentThread().getName()+" exited..");
		
	}

}
