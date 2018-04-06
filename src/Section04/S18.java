package Section04;

import java.util.Scanner;

public class S18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two Characters");
		String str = input.next();
		
		char firstLetter = str.charAt(0);
		String secondLetter = str.substring(1, 1);
		
		System.out.println(secondLetter);            beceremedim
		
		if(firstLetter == 'M' && secondLetter == "A") {
			System.out.println("Mathematics Freshman");
		}
	}

}
