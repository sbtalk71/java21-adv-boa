package threads.executors;

import java.util.concurrent.Callable;

public class UpperCaseConverter implements Callable<String> {

	private String input;

	public UpperCaseConverter(String input) {
		this.input = input;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Processing "+input+"by "+Thread.currentThread().getName());
		String result = "";
		try {
			Thread.sleep(2000);
			result = input.toUpperCase();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}
}
