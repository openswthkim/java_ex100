package java_ex100;

import java.util.Scanner;

public class ex100_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
        	int a = scan.nextInt();
        	System.out.println(a);
        	if(a==0) {
        		break;
        	}
        }
        scan.close();
    }
}
