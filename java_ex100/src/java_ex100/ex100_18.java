package java_ex100;

import java.util.Scanner;

public class ex100_18 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	     System.out.println();
	     String input = scan.nextLine();
	        
	     if (input.length() == 1) {
	    	 
	         char c = input.charAt(0);
	         int asciiValue = (int) c;
	         System.out.println(asciiValue);
	     } 
	      
	     scan.close();
	}
}
