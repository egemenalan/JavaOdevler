package section05;

import java.util.Scanner;

public class Q51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Emnter the firts String");
		String str1 = input.nextLine();
		
		System.out.println("Enter the Second String");
		String str2 = input.nextLine();
		int minStrLen = str1.length();
	    if ( minStrLen > str2.length()){
	        minStrLen = str2.length();
	    }

	    StringBuilder output = new StringBuilder();
	    for(int i=0; i<minStrLen; i++){
	        if ( str1.charAt(i) ==  str2.charAt(i)){
	         output.append(str1.charAt(i));
	        }else{
	          break;
	        }
	    }       
	    System.out.println(output.toString());
		
	}

}
