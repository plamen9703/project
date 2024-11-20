package school.calendar;

public enum Month {
	JANUARY(31,1),FEBRUARY(28,2) ,MARCH(31,3),
	APRIL(30,4),MAY(31,5), JUNE(30,6),
	JULY(31,7),AUGUST(31,8),SEPTEMBER(30,9),
	OCTOBER(31,10),NOVEMBER(30,11), DECEMBER(31,12),FERBRUARY_LEAP(29,2);
	private int numberOfDays;
	private int number;
	private Month(int numberOfDays, int number) {
		this.numberOfDays=numberOfDays;
		this.number=number;
	}
	
	
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return String.format("%d: %d", number, numberOfDays);
	}
}
