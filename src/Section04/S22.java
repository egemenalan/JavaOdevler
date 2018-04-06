package Section04;

import java.util.Scanner;

public class S22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first String S1");
		String s1 = input.next();
		
		System.out.println("Enter second String S2");
		String s2 = input.next();
		
		if(s1.contains(s2))
			System.out.println(s2 + " is a subsitring of " + s1);
		else
			System.out.println(s2 + " is not a subsitring of " + s1);
	}

}
