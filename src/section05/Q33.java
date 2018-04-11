package section05;

public class Q33 {

	public static void main(String[] args) {

		int min = 1;
		int max = 10000;

		for (min = 1; min <= max; min++) {
			int sum = 0;
			int e = 1;
			for (e = 1; e < min; e++) {
				int a = min % e;

				if (a == 0) {
					sum += e;
				}
			}
			if (sum == min) {
				System.out.println(sum);
			}
		}

	}
}