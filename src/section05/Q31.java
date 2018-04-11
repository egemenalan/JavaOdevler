package section05;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the initial deposit amount:");
		double amount = input.nextDouble();
		
		System.out.println("Enter annual percentage yield:");
		double yield = input.nextDouble();
		
		System.out.println("Enter maturity period (number of months):");
		int month = input.nextInt();
		
		double monthlyYield = yield /1200;
		double total = 0.0;
		double sum = 0.0;
		
		System.out.println("Month \t\t CD Value");
		
		for (int i = 1; i <= month; i++) {
			
			total = amount + (amount * monthlyYield);
			System.out.println(i + "\t\t" + total);     yandi benim devreler 🤪🤪🤪🤪🤪🤪🤪🤪🤪🤪🤪🤪
			
		}
	}

}
