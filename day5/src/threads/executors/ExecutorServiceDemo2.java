package threads.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import threads.ex1.Worker;
import threads.service.TablePrinter;

public class ExecutorServiceDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		ExecutorService es=Executors.newCachedThreadPool();
		
		 Future<String> future= es.submit(new UpperCaseConverter("hello"));
		
		while(true) {
			if(future.isDone()) {
				try {
					System.out.println(future.get());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
				break;
			}
		}
		
		es.shutdown();
		

	}

}
