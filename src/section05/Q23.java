package section05;

public class Q23 {

	public static void main(String[] args) {
		
		double sumLeftToRight = 0.0;
		for (double i = 1.0; i <= 50_000.0; i++) {
			sumLeftToRight += 1/i;
		}
		System.out.println("Sum Left To Right: " + sumLeftToRight);
		
		double sumRightToLeft = 0.0;
		for (double i = 50_000.0; i >= 1.0; i--) {
			sumRightToLeft += 1/i;
		}
		System.out.println("Sum Right To Left: " + sumRightToLeft);
		
		System.out.println("");
	}

}
