package Section04;

import java.util.Scanner;

public class S24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First City");
		String city1 = input.nextLine();
		
		System.out.println("Enter the Second City");
		String city2 = input.nextLine();
		
		System.out.println("Enter the Third City");  yandi devreler
		String city3 = input.nextLine();
		
		if(city1.compareTo(city2) < 0) {
			if(city1.compareTo(city3) < 0)
			System.out.println("The three cities in alphabetical order are  " + city1 + " " + city2 + " " + city3);
		}else if(city2.compareTo(city1) < 0) {
			if(city2.compareTo(city3) < 0)
			System.out.println("sehirlerin liste siralamasi " + city2 + " " + city1 + " " + city3);
		}else if(city3.compareTo(city1) < 0) {
			if(city3.compareTo(city2) < 0)
			System.out.println("sehirlerin liste siralamasi " + city3 + " " + city1 + " " + city2);
		}
	}

}
