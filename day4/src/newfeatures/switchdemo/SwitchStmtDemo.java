package newfeatures.switchdemo;

public class SwitchStmtDemo {

	public static void main(String[] args) {
		Day day = Day.WEDNESDAY;

		int numOfLetters = 0;
		switch (day) {
		case MONDAY, FRIDAY, SUNDAY:
			numOfLetters = 6;
			break;
		case THURSDAY, SATURDAY:
			numOfLetters = 8;
			break;
		case WEDNESDAY:
			numOfLetters = 9;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		
		System.out.println(numOfLetters);
	}

}
