package Section04;

import java.util.Scanner;

public class S09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Characket");
		String characker = input.next();
		
		char ch = characker.charAt(0);
		
		System.out.println("The Unicode of the Character " + ch + " is " + (int)ch);
		
	}

}
