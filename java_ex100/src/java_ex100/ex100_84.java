package java_ex100;

import java.util.Scanner;

public class ex100_84 {

	 public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	    	for(int i=a-1;i>0;i--){
	    		for(int j=0;j<i;j++){
	    			System.out.print("*");
	    		}
	    		System.out.print("\n");
	    	}
	        scan.close();
	    }
	}