package Section04;

import java.util.Scanner;

public class S13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Letter");
		String letter = input.next();
		
		char ch = letter.charAt(0);
		boolean isVowel = false;
		
		switch(ch)
		{
		   case 'a' :
		   case 'e' :
	       case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : isVowel = true;
		}
		if(isVowel == true) {
		   System.out.println(ch+" is  a Vowel");
		}
		else {
		   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+" is a Consonant");
		   else
			System.out.println("Input is not an alphabet");		
	        }
	}

}
