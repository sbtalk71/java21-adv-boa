package threads.completable.future;

import java.util.concurrent.CompletableFuture;

public class COmpletableFutureDemo {

	public static void main(String[] args) throws Exception{
		
		CompletableFuture<Void> asyncRsult=CompletableFuture.runAsync(()->{
			System.out.println(Thread.currentThread().getName());
		});
		
		asyncRsult.get();

	}

}
