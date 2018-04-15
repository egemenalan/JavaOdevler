package section05;

public class Q05 {

	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds | Pounds		Kilograms");

		
		// Display table body
		for (int kg = 1,pound = 20; kg <= 200; kg+=2, pound += 5) {
			System.out.printf("%4d\t\t%6.2f | %4d\t\t%6.2f\n",kg, kg*2.2,pound, pound / 2.2);
		}
	}

}
