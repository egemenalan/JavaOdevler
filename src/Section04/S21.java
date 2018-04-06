package Section04;

import java.util.Scanner;

public class S21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN");
		String str = input.next();
		String first = str.substring(0, 3);
		if(first.length() != 2) {
			System.out.println(str + " is a Valid SSN");      else dusuremedim
		}else {
			System.out.println(str + " is an Invailed SSN");
		}
	}

}
