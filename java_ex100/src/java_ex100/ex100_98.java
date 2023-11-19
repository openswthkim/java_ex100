package java_ex100;

import java.util.Scanner;

public class ex100_98 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int [][] array = new int[10][10];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("X:");
			int a = scan.nextInt();
			System.out.print("Y:");
			int b = scan.nextInt();
			array[--a][--b] = 1;
		}
		
		for(int i = 0; i< 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}
