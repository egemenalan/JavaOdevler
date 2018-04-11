package section05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Amount");
		int amount = input.nextInt();
		
		System.out.println("Enter a Interest Rate");
		double interestRate = input.nextDouble();
		
		System.out.println("Enter number of Months");
		int month = input.nextInt();
		
		double monthlyInterestRate = interestRate / 1200;      kusuratlari yapamadim  1. Month Total Amount = 100.41666666666669
		double savingAmount = 0.0;
		
		for (int i = 1; i <= month; i++) {
			savingAmount += amount * (1 +monthlyInterestRate);
			
			System.out.println( i + ". Month " + "Total Amount = " + ((savingAmount *100) / 100));
		}
		
	}

}
