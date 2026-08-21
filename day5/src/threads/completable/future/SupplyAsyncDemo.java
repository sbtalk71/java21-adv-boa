package threads.completable.future;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import data.EmpData;
import data.Employee;

public class SupplyAsyncDemo {

	public static void main(String[] args) throws Exception {
		CompletableFuture<List<Employee>> empListAsync=CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName());
			return EmpData.employees;
		});
		
		
		empListAsync.get().forEach(System.out::println);

	}

}
