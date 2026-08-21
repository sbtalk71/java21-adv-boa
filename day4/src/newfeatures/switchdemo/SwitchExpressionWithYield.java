package newfeatures.switchdemo;

public class SwitchExpressionWithYield {

	public static void main(String[] args) {
		Day day = Day.WEDNESDAY;

		int numOfLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY:
			
		yield getLength(day);
		case TUESDAY:
			System.out.println("The num of letters " + 7);
			yield 7;
		case THURSDAY, SATURDAY:
			System.out.println("The num of letters " + 8);
		yield 8;
		case WEDNESDAY:System.out.println("The num of letters " + 9);
		yield 9;
		default: throw new IllegalArgumentException("Unexpected value: " + day);
		};

		System.out.println(numOfLetters);
	}
	
	public static int getLength(Day day) {
		return 7;
	}

}
