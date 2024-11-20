package school.main;
import java.util.Scanner;

import school.calendar.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		 Date date2 = new Date(14,11,2024);
		Scanner scanner = new Scanner(System.in);
		Date date3 = new Date(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		
	}
}
