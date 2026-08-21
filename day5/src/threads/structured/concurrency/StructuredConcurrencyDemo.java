package threads.structured.concurrency;

import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyDemo {

	static String getUser() throws InterruptedException {

		Thread.sleep(1000);
		return "John";
	}

	static String getOrders() throws InterruptedException {

		Thread.sleep(1500);
		//throw new RuntimeException("error");
		return "Orders: 10";
	}

	public static void main(String[] args) throws Exception {

		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

			var user = scope.fork(StructuredConcurrencyDemo::getUser);

			var orders = scope.fork(StructuredConcurrencyDemo::getOrders);

			scope.join();

			scope.throwIfFailed();

			System.out.println("User   = " + user.get());

			System.out.println("Orders = " + orders.get());
		}
	}
}