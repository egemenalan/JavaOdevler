package Section04;

import java.util.Scanner;

public class S08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ASCII Code");
		int number = input.nextInt();
		
		char displayCharacter = (char) number;
		
		System.out.println("The Character of ASCII Code " + number + " is" + displayCharacter ); neden char gostermiyor?
		
	}

}
