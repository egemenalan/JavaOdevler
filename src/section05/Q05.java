package section05;

public class Q05 {

	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds		      Pounds		Kilograms");

		
		// Display table body
		for (int i = 1; i <= 200; i+=2) {
			System.out.print(i);
			for (int j = 1; j < 2; j++) {
				// Display the product and align properly
				System.out.printf("%16d", i * 2);
				System.out.print("	   |	  	");
				for (int j2 = 1; j2 < 1; j2++) {    beceremedim
					System.out.printf("%16d",j2);  
					for (int k = 1; k < 2; k++) {
						System.out.printf("%16d", j2 / 2);
						
					}
					
				}
			}
			System.out.println();
		}
	}

}
