package threads.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import data.EmpData;

public class ProcessEMpDataAsync {

	public static void main(String[] args) throws Exception{
		CompletableFuture<Void> asyncResult = CompletableFuture
				.supplyAsync(() -> EmpData.employees)
				.thenApplyAsync((employees) -> employees.stream().filter(emp -> emp.salary() > 80000).collect(Collectors.toList()))
				.thenAcceptAsync(employees -> employees.stream().map(emp -> emp.name()).forEach(System.out::println));
		asyncResult.get();

	}

}
