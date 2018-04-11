package section05;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {

		System.out.println("--------------------------");
		for (int i = 1; i < 7; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for (int i = 6; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {				bu kisim olmadi for ' larin tam olarak ne yaptigini anlamadim
				System.out.print(k);
			}
			
			System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j < 7-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {				
				System.out.print(k);
			}
			
			System.out.println();
		}
		System.out.println("--------------------------");
		
	}
}
