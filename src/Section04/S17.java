package Section04;

import java.util.Scanner;

public class S17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Year");
		int year = input.nextInt();
		
		System.out.println("Enter a Month");
		String month = input.next();
		
		boolean isLeapYear = 
				(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			// Display the number of days in the month
		switch (month){
        case "Jan":
        case "Mar":
        case "May":
        case "July":
        case "Aug":
        case "Oct":
        case "Dec":
            System.out.println(month + " " + year + " has 31 days"); break;

        case "Apr":
        case "Jun":
        case "Sep":
        case "Nov":
            System.out.println(month + " " + year + " has 30 days"); break;

        case "Feb":
        if(isLeapYear)
        {
            System.out.println(month + " " + year + " has 29 days");
        }
            else
        {
                System.out.println(month + " " + year + " has 28 days");}
        }   
	}

}
