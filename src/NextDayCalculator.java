import java.time.LocalDate;
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
		LocalDate day = LocalDate.of(year, month, date);
		return day.plusDays(1).toString();
	}
}
