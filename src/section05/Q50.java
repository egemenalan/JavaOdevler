package section05;

import java.util.Scanner;

public class Q50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = input.nextLine();

		int i = 0;
		int upperCaseCount = 0;
		int loverCaseCount = 0;

		while (i < str.length()) {
			char namechar = str.charAt(i);
			if (Character.isUpperCase(namechar)) {
				upperCaseCount++;

			} else {
				loverCaseCount++;
			}
			i++;
		}
		System.out.println("The number of vowels is " + upperCaseCount);
		System.out.println("The number of consonants is " + loverCaseCount);
	}

}
