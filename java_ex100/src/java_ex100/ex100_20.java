package java_ex100;

import java.util.Scanner;

public class ex100_20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();int b=scan.nextInt();int c=scan.nextInt();
		long sum=a+b+c;
		System.out.println(sum);
		System.out.println(sum/3.0);
		scan.close();
	}
}