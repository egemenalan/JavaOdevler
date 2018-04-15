package section05;

import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char namechar = str.charAt(i);
			if ((i % 2) == 0) // Check it is odd or even (Means character position)
			{
				System.out.print(namechar);
			} 
		}
	}

}
