import java.util.Scanner;

public class NextDayCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the date: ");
		int date = input.nextInt();
		System.out.print("Enter the month: ");
		int month = input.nextInt();
		System.out.print("Enter the year: ");
		int year = input.nextInt();

		String nextDay = findNextDay(date, month, year);
		System.out.println("\nNext day is: " + nextDay);
	}

	public static String findNextDay(int date, int month, int year) {
//		LocalDate day = LocalDate.of(year, month, date);
//		return day.plusDays(1).toString();
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if (date == 31) {
					return toString(year) + "-" + toString(month + 1) + "-" + "01";
				}
			case 4:
			case 6:
			case 9:
			case 11:
				if (date == 30) {
					return toString(year) + "-" + toString(month + 1) + "-" + "01";
				}
			case 12:
				if (date == 31) {
					return toString(year + 1) + "-" + "01" + "-" + "01";
				}
			case 2:
				if (isLeapYear(year)) {
					if (date == 29) {
						return toString(year) + "-" + toString(month + 1) + "-" + "01";
					}
				} else {
					if (date == 28) {
						return toString(year) + "-" + toString(month + 1) + "-" + "01";
					}
				}
				return toString(year) + "-" + toString(month) + "-" + toString(date + 1);
		}
		throw new UnsupportedOperationException("Not a valid date");
	}

	private static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return year % 4 == 0;
		}
	}

	public static String toString(int n) {
		if (n > 0 && n < 10) {
			return "0" + n;
		} else {
			return "" + n;
		}
	}
}
