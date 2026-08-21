package newfeatures.switchdemo;

public class SwitchExpressionDemo {

	public static void main(String[] args) {
		Day day = Day.WEDNESDAY;

		int numOfLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};

		System.out.println(numOfLetters);
	}

}
