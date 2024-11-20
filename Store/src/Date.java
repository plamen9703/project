
public class Date {
	private int day;
	private int year;
	private Month month;
	
	public Date() {
		setYear(2000);
		setMonth(1);
		setDay(1);
	}
	public Date(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public Date(Date date) {
		this(date.day,date.month.getNumber(), date.year);
//		setYear(date.year);
//		setMonth(date.month.getNumber());
//		setDay(date.day);
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month.getNumber();
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year >= 2000) {
			this.year = year;
		} else {
			System.out.println("invalid year");
			System.exit(0);
		}
	}
	public void setDay(int day) {
		if (day >= 1 && day <= month.getNumberOfDays()) {
			this.day = day;
		} else {
			System.out.println("invalid day");
			System.exit(0);
		}
	}
	public void setMonth(int month) {
		Month[] m = Month.values();
		if (month == 2 && year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
			this.month = Month.FERBRUARY_LEAP;
			return;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i].getNumber() == month) {
				this.month = m[i];
				break;

			}
		}
	}
	
	public int dateDiff(Date date1) {
		return dateToNumbers(date1)-dateToNumbers(this);
	}
	public static int dateToNumbers(Date date) {
		int dd=0;
		for(int i=2000;i<date.year;i++) {
			if(i%4==0 && (i % 400 == 0 || i % 100 != 0))dd++;
			dd+=365;
		}
		for(int i=1;i<date.month.getNumber();i++) {
			if(date.year%4==0 && (date.year % 400 == 0 || date.year % 100 != 0) && i==2)dd++;
			dd+=Month.values()[i].getNumberOfDays();
		}
		dd+=date.day;
		return dd;
	}
	
}
