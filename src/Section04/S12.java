package Section04;

import java.util.Scanner;

public class S12 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("bir karakter giriniz");
		String girdi = input.next();
		
		if(girdi.length() > 1) {
			System.err.println("tek basamakli karakter giriniz");
			System.exit(0);
		}
		
		char ch = girdi.charAt(0);
		int sayi = 0;
		int bin_num[] = new int[100];
		int i=1, j;
											Buyuk harf girdigimde else dusuyor. nerde toUpperCase yapmali
		if('a' <= ch && 'f' >= ch) {
			sayi = ch - 'a' + 10;
		}else if('0' <= ch && '9' >= ch) {
			sayi = ch - '0';
		}else {
			System.err.println("hatali giris yaptiniz");
			System.exit(0);
		}
		while (sayi != 0) {
			bin_num[i++] = sayi%2;
	        sayi = sayi/2;
		}
		
		System.out.print("Equivalent Binary Number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
	}

}
