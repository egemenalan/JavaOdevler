package Section04;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class S11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Decimal Value (0-15)");
		int decimal = input.nextInt();
		
		if(decimal < 0 || decimal > 15) {
			System.out.println("Wrong Number.Number must be between 0 to 15");
		}else {
			String str = Integer.toHexString(decimal);
			System.out.println("The hex Value " + str.toUpperCase());
		}
	}

}
