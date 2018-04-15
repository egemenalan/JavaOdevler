package section05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer Number");
		
		int positiveCount = 0;
		int negativeCount = 0;
		int total = 0;
		while(true) {
			int number = input.nextInt();
			if (number == 0) {
				break;
			}
			if(number > 0) {
				positiveCount++;
			}else {
				negativeCount++;
			}
			total += number;
		}
		System.out.println("The Number of Positive Number: " + positiveCount);
		System.out.println("The Number of Negative Number: " + negativeCount);

		System.out.println("Total = " + total);
		double avarage = (double)total / (positiveCount + negativeCount);
		System.out.println("Avarage = " + avarage);
	}

}
