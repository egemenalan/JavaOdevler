package section05;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;

		for (int year = 101; year <= 2100; year++) {
		
			// Check if the year is a leap year
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + " ");
				}

				// Display the result in a message dialog box
				// System.out.println(year + " is a leap year? " + isLeapYear);
			}
		}

	}
}
