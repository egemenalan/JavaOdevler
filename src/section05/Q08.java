package section05;

import java.util.Iterator;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Students number");
		int studentsNumber = input.nextInt();

		int highestGrade = 0;
		String highestGradeName = "";

		for (int i = 0; i < studentsNumber; i++) {
			System.out.print("Student: " + (i + 1) + "\n   Name: ");
			String studentName = input.next();

			System.out.println("Enter the Student's Grade");
			int grade = input.nextInt();

			if (grade > highestGrade) {
				highestGrade = grade;
				highestGradeName = studentName;
			}
		}
		System.out.println("Student with the highest score: " + highestGradeName.toUpperCase() + " Grade: " + highestGrade);

	}

}
