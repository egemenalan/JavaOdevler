package section05;

import java.util.concurrent.ThreadLocalRandom;

public class Q10 {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 5);
		int primeNumberCount = 0;

		while (primeNumberCount < 10) {
			boolean isPrimeNumber = true;

			for (int i = 2; i < number; i++) {
				if (number % 5 == 0 && number % 5 == 0) { 
					isPrimeNumber = false;
				}

			}
			if (isPrimeNumber == true) {
				primeNumberCount++;
				System.out.println("Number " + number + " can be devide 5 and 6");
			}
			number++;
		}
	}

}

for (int i = 100; i < 1000; i++) {
	if (i % 5 == 0 && i % 5 == 0) {
		System.out.println("Number " + i + " can be devide 5 and 6");
	}
}