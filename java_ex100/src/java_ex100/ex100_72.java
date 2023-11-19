package java_ex100;

import java.util.Scanner;

public class ex100_72 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int n2;
		int max=0;
		for(int i=0;i<n;i++) {
			n2=scan.nextInt();
			if(max<n2)
				max=n2;
		}
		System.out.println(max);
		scan.close();
	}

}
