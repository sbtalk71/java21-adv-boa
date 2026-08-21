package threads.service;

public class TablePrinter {

	public  void printTable(int num) {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " X " + i + " = " + (i * num));
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
