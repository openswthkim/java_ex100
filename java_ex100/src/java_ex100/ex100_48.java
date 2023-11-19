package java_ex100;

import java.util.Scanner;

public class ex100_48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int frontid = scan.nextInt();
		int sex = scan.nextInt();
		int year = (int)(frontid / 10000);
		
		if(sex == 1 || sex == 2) {
			System.out.println(2012-(1900+year)+1);
		}else {
			System.out.println(2012-(2000+year)+1);
		}
		
		System.out.println();
		scan.close();
	}

}
