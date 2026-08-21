package threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import threads.ex1.Worker;
import threads.service.TablePrinter;

public class ExecutorServiceDemoForVirtual {

	public static void main(String[] args) throws InterruptedException {
		
		TablePrinter tp= new TablePrinter();
		
		
		
		ExecutorService es=Executors.newVirtualThreadPerTaskExecutor();
		
		es.submit(new Worker(tp, 7));
		es.submit(new Worker(tp, 12));
		es.submit(new Worker(tp, 11));
		es.submit(new Worker(tp, 9));
		
		es.awaitTermination(20, TimeUnit.SECONDS);
		
		es.shutdown();
		

	}

}
