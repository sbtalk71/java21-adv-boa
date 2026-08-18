package polymorphism;

public class OverloadDemo {

	public void add() {
		System.out.println(" Nothing to add");
	}

	public int add(int a, int b) {
		System.out.println("adding  int and int ...");
		return a + b;
	}

	public void add(int a, int b, int c) {
		System.out.println("adding  int, int, and int ...");

	}
	/*
	 * public float add(int a, float b) {
	 * System.out.println("adding  int and float ..."); return a + b; }
	 */

	public double add(double a, double b) {
		System.out.println("adding  double and double ...");
		return a + b;
	}
	
	public double add(double a, double b, double c) {
		System.out.println("adding  double and double, double ...");
		return a + b+c;
	}

	public static void main(String[] args) {

		OverloadDemo od = new OverloadDemo();

		od.add();
		od.add(2, 3);
		od.add(2, 3.0f);
		od.add(2.0, 4.0);
		od.add(2, 3.0, 4);

	}

}
