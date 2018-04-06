package section05;

public class Q04 {

	public static void main(String[] args) {
		System.out.println(""
				+ "Miles      Kilometers");

		
		// Display table body
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			for (int j = 1; j < 2; j++) {
				// Display the product and align properly
				System.out.printf("%16d", i * 16);
			}
			System.out.println();
		}
	}

}
