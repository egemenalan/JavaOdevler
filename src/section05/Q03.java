package section05;

public class Q03 {

	public static void main(String[] args) {
		// Display the table heading
				System.out.println("Kilograms      Pounds");

				
				// Display table body
				for (int i = 1; i <= 200; i++) {
					System.out.print(i);
					for (int j = 1; j < 2; j++) {
						// Display the product and align properly
						System.out.printf("%16d", i * 2);
					}
					System.out.println();
				}
	}

}
