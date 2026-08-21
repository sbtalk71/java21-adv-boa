package threads.ex1;

import threads.service.TablePrinter;

public class MainApp2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" started..");
		TablePrinter tp=new TablePrinter();
		
		Worker worker=new Worker(tp, 7);
		
		Thread t1=Thread.ofVirtual().name("vt1").start(worker);
		
		Thread t2=Thread.ofVirtual().name("vt2").start(new Worker(tp, 9));
		Thread t3=Thread.ofVirtual().name("vt3").start(new Worker(tp, 13));
		
		System.out.println(t1.getPriority());
		t1.setPriority(8);
			
		
		t1.join();
		t2.join();
		t3.join();

		System.out.println(Thread.currentThread().getName()+" exited..");
	}

}
