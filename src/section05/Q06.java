package section05;

public class Q06 {

	public static void main(String[] args) {
		System.out.println(""
				+ "Miles      Kilometers		Kilometers		Miles");

		
		// Display table body
		for (int i = 1; i <= 65; i++) {
			System.out.print(i);
			for (int j = 1; j < 2; j++) {
				// Display the product and align properly
				System.out.printf("%16d", i * 16);
				System.out.println("        |");
				for(int k = 20; k < 2;k+=5) {   olmadi
					System.out.printf("%32d",k);
				}
			}
			System.out.println();
		}
	}

}
