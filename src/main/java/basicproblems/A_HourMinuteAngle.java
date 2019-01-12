package basicproblems;

class A_HourMinuteAngle {

	double findAngleBetweenHourAndMinute(int hour, int minute) {

		double angleBetweenMinuteAnd12 = (minute / 60.0) * 360;
		angleBetweenMinuteAnd12 = 6 * minute;

		double angleBetweenHourAnd12 = ((hour % 12) / 12.0) * 360 + (((minute / 60.0) * (1.0 / 12)) * 360);
		angleBetweenHourAnd12 = (30 * (hour % 12)) + (minute / 2.0);

		return Math.abs(angleBetweenHourAnd12 - angleBetweenMinuteAnd12);
	}
}
