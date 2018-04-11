package section05;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Year");
		int year = input.nextInt();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, y ");

		for (int month = 1; month <= 12; month++) {

			LocalDate date = LocalDate.of(year, Month.of(month), 10);
			LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
			

			System.out.println(formatter.format(firstDayOfMonth));
		}

	}
}