package Section04;

import java.util.Scanner;

public class S20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.nextLine();
		
		System.out.println("Lenght " + str.length());
		System.out.println("The First Character " + str.substring(0, 1));
	}

}
