package threads.ex1;

import threads.service.TablePrinter;

public class MainApp1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" started..");
		TablePrinter tp=new TablePrinter();
		
		MyThread t1=new MyThread(tp, 5);
		
		t1.start();
		System.out.println("Thread State: "+t1.getState());
		
		t1.join();

		System.out.println(Thread.currentThread().getName()+" exited..");
	}

}
