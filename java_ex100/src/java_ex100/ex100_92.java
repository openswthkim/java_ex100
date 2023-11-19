package java_ex100;

import java.util.Scanner;

public class ex100_92 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array;
		array=new int[10];
		for(int i=0;i<10;i++)
			array[i]=scan.nextInt();
		try{
			Thread.sleep(5000);
		}catch(Exception e) {}
		for(int i=0;i<20;i++)System.out.println();
		int k=scan.nextInt();
		System.out.println(k+"번째숫자는?");
		System.out.println(array[k-1]);
		
		scan.close();
	}
}