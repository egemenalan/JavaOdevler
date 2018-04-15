package section05;

public class Q40 {

	public static void main(String[] args) {
		
		int countHead = 0 , countTail = 0, count = 0;
		
		for (int number = 0; number < 1_000_000; number++) {
			// Obtain the random number 0 or 1
			int playNumber = (int) (Math.random() * 2);
			
			if(playNumber == 0) {
				countHead++;
			}else {
				countTail++;
			}
			count++;
		}
		System.out.println(countHead + " Times Head ");
		System.out.println(countTail + " Times Tail ");
		System.out.println("Count " + count);

		
	}

}
