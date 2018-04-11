package section05;

public class Q11 {

	public static void main(String[] args) {
		

		int number = (int) (Math.random() * 5);
		int primeNumberCount = 0;

		while (primeNumberCount < 10) {
			boolean isPrimeNumber = true;

			for (int i = 2; i < number; i++) {
				if (number % 5 == 0 || number % 5 == 0) { olmadiiiiii
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
