package threads.structured.concurrency;

public class ScopedValueDemo {

	static final ScopedValue<String> USER = ScopedValue.newInstance();

	static void service() {

		System.out.println("User = " + USER.get());
	}

	public static void main(String[] args) {

		ScopedValue.where(USER, "john").run(() -> {

			System.out.println("Inside scope: " + USER.get());

			service();
		});
		//service();
	}
}