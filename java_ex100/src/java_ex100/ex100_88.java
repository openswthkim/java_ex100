package java_ex100;

import java.util.Scanner;

public class ex100_88 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sn = 0;
		
		while(n > 0) {
			for(int i = 1; i<=n ; i++) {
				sn+=i;
			}
			n--;
		}
		
		System.out.println(sn);
		scan.close();
	}

}
