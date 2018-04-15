package section05;

import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.next();
		
		String str2 = new StringBuilder(str).reverse().toString();
		System.out.println("The reversed string is " +str2);
		
	}

}
