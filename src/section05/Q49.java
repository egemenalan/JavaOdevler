package section05;

import java.util.Scanner;

public class Q49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = input.nextLine();
		
		int i = 0;
		int vowelCount = 0;
		int consonantCount = 0;

		while (i < str.length()) {
			char namechar = str.charAt(i);
			if (namechar == 'a' || namechar == 'e' || namechar == 'i' || namechar == 'o' || namechar == 'u') {
				vowelCount++;

			} else {
				consonantCount++;     boslugu da bir karakter aliyor ve bosluk kadar fazla cikiyor count. boslugu atmayi denedim ama yemedi 

			}
			i++;
		}
		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + consonantCount);
	}

}
