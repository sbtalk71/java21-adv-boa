package threads.executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import threads.ex1.Worker;
import threads.service.TablePrinter;

public class ExecutorServiceDemo3 {

	public static void main(String[] args) throws Exception {

		ThreadPoolExecutor es = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		List<String> fruits = Arrays.asList("apple", "banana", "mango", "pear", "guava");

		List<UpperCaseConverter> converters = fruits.stream().map(fruit -> new UpperCaseConverter(fruit))
				.collect(Collectors.toList());

		List<Future<String>> futureList = es.invokeAll(converters);

		do {
			for (int i = 0; i < futureList.size(); i++) {
				System.out.println("Processing Done" + futureList.get(i).isDone());
			}
		} while (es.getCompletedTaskCount() < futureList.size());

		futureList.stream().forEach(f -> {
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		});

		es.shutdown();
	}

}
