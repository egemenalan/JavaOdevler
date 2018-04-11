package section05;

public class Q20 {

	final static int NUMBER_OF_PRIMES_PER_LINE = 8;

	public static void main(String[] args) {

		int primeNumberCount = 0;
		int number = 2;

		while (number <= 1000) {
			boolean isPrimeNumber = true;

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrimeNumber = false;
					break;
				}

			}
			if (isPrimeNumber == true) {
				primeNumberCount++;
				if (primeNumberCount % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}

}
