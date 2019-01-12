package basicproblems;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class A_HourMinuteAngleTest {

	private A_HourMinuteAngle obj = new A_HourMinuteAngle();

	// CSVSource option allows paired arguments - and the arguments are easily type-casted
	@ParameterizedTest(name = "run #{index} with [{arguments}]")
	@CsvSource({"6, 30, 15", "3, 25, 47.5", "17, 42, 81"})
	void between630(String hour, int minute, double expected) {
		double actual = obj.findAngleBetweenHourAndMinute(Integer.valueOf(hour), minute);

		Assertions.assertEquals(expected, actual);
	}

}
