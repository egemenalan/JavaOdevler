package section05;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Lines");
		int number = input.nextInt();

		for (int i = 1; i < number; i++) {
			for (int j = 1; j < number - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {				for ' larin tam olarak ne yaptigini anlamadim
				System.out.print(k);
			}
			
			System.out.println();
		}

	}

}
