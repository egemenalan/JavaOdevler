package section05;

import java.util.Scanner;

public class Q41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an Integer Number");
		int number = input.nextInt();
		
		int higestNumberCount = 0;
		int highestNumber = 0;
		while (true) {
			if (number == 0) {
				break;
			}
			
			if (number > highestNumber) {
				highestNumber = number;
			}
		}
		higestNumberCount++;
		System.out.println("The largest number is " + highestNumber);
		System.out.println("The occurrence count of the largest number is " + higestNumberCount); count olmadi, zaten logic yanlis sanirim. sayilari yan yana alamadim
	}

}
