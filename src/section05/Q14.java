package section05;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the First Number");
		int number1 = input.nextInt();

		System.out.println("Enter the Second Number");
		int number2 = input.nextInt();            soruyu anlamadim

		int obeb = 1;
		int division = 2;

		while (division <= number1 && division <= number2) {
			if (number1 % division == 0 && number2 % division == 0) {
				obeb = division;
			}
			division++;
		}
		System.out.println(number1 + " and " + number2 + " greatest Common Divisior is " + obeb);
	}

}
/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, ..., 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd
*/