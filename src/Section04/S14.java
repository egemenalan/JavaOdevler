package Section04;

import java.util.Scanner;

public class S14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Letter Grade");
		char letterGrade = input.next().charAt(0);
		
		switch (letterGrade) {
		case 'A':
			System.out.println("The numeric value for Grade " + letterGrade + " is " + 4);
			break;
		case 'B':
			System.out.println("The numeric value for Grade " + letterGrade + " is " + 3);
			break;
		case 'C':
			System.out.println("The numeric value for Grade " + letterGrade + " is " + 2);
			break;
		case 'D':
			System.out.println("The numeric value for Grade " + letterGrade + " is " + 1);
			break;

		default:
			System.out.println("Please Enter Correct Grade");
			break;
		}
	}

}
