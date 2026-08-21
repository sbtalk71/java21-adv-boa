package threads.ex1;

public class ThreadDemoWithLambda {

	public static void main(String[] args) {
		
		Runnable target=()->{
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		};
		Thread t1= new Thread(target);
		t1.start();

	}

}
