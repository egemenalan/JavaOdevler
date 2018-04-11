package section05;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter loan amount
		System.out.print("Enter loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();

		// Enter number of years
		System.out.print("Enter number of years as an integer, for example 5: ");
		int numberOfYears = input.nextInt();

		System.out.println("Interest Rate" + "\t\t" + "Monthly Payment" + "\t\t" + "Total Payment");
		for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
			// Obtain monthly interest rate
			double monthlyInterestRate = annualInterestRate / 1200;

			// Calculate payment
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;

			// Display results
			System.out.println(String.format( "%.3f",annualInterestRate)+"%" + "\t\t\t" + (int) (monthlyPayment * 100) / 100.0 + "\t\t\t"
					+ (int) (totalPayment * 100) / 100.0);

		}
	}

}
