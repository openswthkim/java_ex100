package java_ex100;

import java.util.Scanner;

public class ex100_38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		double c = (double)(a*b / 2 );
		
		System.out.printf("%.1f", c);
		scan.close();
	}

}
