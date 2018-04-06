package section05;

public class Q07 {

	public static void main(String[] args) {
		double tuition = 10_000; 
		int year = 0;
		
		for ( year = 0; year < 10; year++) {
			tuition = tuition + (tuition * 0.05);
			if(year == 4) {
				int totalCost = (int) tuition;
				System.out.println("Total Cost for 4 Years " + totalCost);
				continue;
			}
		}
		System.out.printf("Tuition will be $%.2f in %1d years" , tuition,year );
	}

}
