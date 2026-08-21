package threads.ex1;

import threads.service.TablePrinter;

public class MyThread extends Thread {

	private TablePrinter tablePrinter;
	private int num;
	
	public MyThread(TablePrinter tablePrinter, int num) {
		this.tablePrinter = tablePrinter;
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started..");
		tablePrinter.printTable(num);
		System.out.println(Thread.currentThread().getName()+" exited..");
	}
}
