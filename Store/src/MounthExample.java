
public class MounthExample {
	private int numberOfDays;
	private int number;
	
	public static final MounthExample JANUARY=new MounthExample(31, 1);
	public static final MounthExample FEBUARY=new MounthExample(28, 2);
	public static final MounthExample MARCH=new MounthExample(31, 3);
	public static final MounthExample APRIL=new MounthExample(30, 4);
	public static final MounthExample MAY=new MounthExample(31, 5);
	public static final MounthExample JUNE=new MounthExample(30, 6);
	public static final MounthExample JULY=new MounthExample(31, 7);
	public static final MounthExample AUGUST=new MounthExample(31, 8);
	public static final MounthExample SEPTEMBER=new MounthExample(30, 9);
	public static final MounthExample OCTOBER=new MounthExample(31, 10);
	public static final MounthExample NOVERMBER=new MounthExample(30, 11);
	public static final MounthExample DECEMBER=new MounthExample(31, 12);
	
	public MounthExample(int numberOfDays, int number) {
		this.numberOfDays=numberOfDays;
		this.number=number;
	}
	
	public String toString() {
		return String.format("%d: %d", number, numberOfDays);
	}
	
}
