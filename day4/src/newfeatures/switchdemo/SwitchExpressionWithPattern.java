package newfeatures.switchdemo;

public class SwitchExpressionWithPattern {

	public static void main(String[] args) {

		Object obj = 2.0;
		String result = switch (obj) {
		case Integer r -> "this is Integer";
		case String s -> "this is a String";
		case Double d -> "This is a double ";
		default -> throw new IllegalArgumentException("Unexpected value: " + obj);
		};

		System.out.println(result);
	}

}
