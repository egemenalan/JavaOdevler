package Section04;

import java.util.Scanner;

public class S15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Letter Grade");
		char letterGrade = input.next().toUpperCase().charAt(0);
		String str = "The corresponding number ";
		switch (letterGrade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println(str + letterGrade + " is " + 2);
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println(str + letterGrade + " is " + 3);
			break;
		case 'G':
		case 'H':
		case 'I':
			System.out.println(str + letterGrade + " is " + 4);
			break;
		case 'J':
		case 'K':
		case 'L':
			System.out.println(str + letterGrade + " is " + 5);
			break;
		case 'M':
		case 'N':
		case 'O':
			System.out.println(str + letterGrade + " is " + 6);
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			System.out.println(str + letterGrade + " is " + 7);
			break;
		case 'T':
		case 'U':
		case 'V':
			System.out.println(str + letterGrade + " is " + 8);
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			System.out.println(str + letterGrade + " is " + 9);
			break;

		default:
			System.out.println("Please Enter Correct Letter");
			break;
		}
	}

}
