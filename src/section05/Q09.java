package section05;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Students number");
		int studentsNumber = input.nextInt();

		int highestGrade = 0;
		int secondHighestGrade = 0;
		String highestGradeName = "";
		String secondHighestGradeName = "";
		
		for (int i = 0; i < studentsNumber; i++) {
			System.out.print("Student: " + (i + 1) + "\n   Name: ");
			String studentName = input.next();

			System.out.println("Enter the Student's Grade");
			int grade = input.nextInt();

			if (grade > highestGrade) {
				
				secondHighestGrade = highestGrade;
				secondHighestGradeName = highestGradeName;
				
				highestGrade = grade;
				highestGradeName = studentName;
				
			} else if (grade > secondHighestGrade) {
				secondHighestGrade = grade;
				secondHighestGradeName = studentName;
				
			}

		}
		System.out.println(
				"Student with the highest score: " + highestGradeName.toUpperCase() + " Grade: " + highestGrade);
		System.out.println("Student with the highest score: " + secondHighestGradeName.toUpperCase() + " Grade: "
				+ secondHighestGrade);

	}

}
