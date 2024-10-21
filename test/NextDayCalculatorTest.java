import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

	@Test
	@DisplayName("Case 1")
	void testNextDayOfDay1() {
		int day = 1;
		int month = 1;
		int year = 2018;

		String result = NextDayCalculator.findNextDay(day, month, year);
		String expected = "2018-01-02";

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 2")
	void testNextDayOfDay2() {
		int day = 31;
		int month = 1;
		int year = 2018;

		String result = NextDayCalculator.findNextDay(day, month, year);
		String expected = "2018-02-01";

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 3")
	void testNextDayOfDay3() {
		int day = 30;
		int month = 4;
		int year = 2018;

		String result = NextDayCalculator.findNextDay(day, month, year);
		String expected = "2018-05-01";

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 4")
	void testNextDayOfDay4() {
		int day = 28;
		int month = 2;
		int year = 2018;

		String result = NextDayCalculator.findNextDay(day, month, year);
		String expected = "2018-03-01";

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 5")
	void testNextDayOfDay5() {
		int day = 29;
		int month = 2;
		int year = 2020;

		String result = NextDayCalculator.findNextDay(day, month, year);
		String expected = "2020-03-01";

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Case 6")
	void testNextDayOfDay6() {
		int day = 31;
		int month = 12;
		int year = 2018;

		String result = NextDayCalculator.findNextDay(day, month, year);
		String expected = "2019-01-01";

		assertEquals(expected, result);
	}
}