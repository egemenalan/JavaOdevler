package section05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer Number");
		String number = input.next();
		
		int positiveCount = 0;
		int negativeCount = 0;
		int total = 0;
		char ch = number.charAt(0);
		System.out.println(ch);
		double avarage = 0.0;
		while (ch != 0) {
			total += Integer.parseInt(ch);
			//number = input.nextInt();
			if(ch > 0) {
				positiveCount++;
			}else {
				negativeCount++;
			}
			number = input.next();
		}
		
		System.out.println("The Number of Positive Number: " + positiveCount);
		System.out.println("The Number of Negative Number: " + negativeCount);

		total = positiveCount + negativeCount;
		System.out.println("Total = " + total);
		avarage = total / (positiveCount + negativeCount);
		System.out.println("Avarage = " + avarage);
	}

}
