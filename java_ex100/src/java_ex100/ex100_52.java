package java_ex100;

import java.util.Scanner;

public class ex100_52 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%10==1)
			System.out.println(num+"st");
		else if(num%10==2)
			if(num/10==1)
				System.out.println(num+"th");
			else
				System.out.println(2+"nd");
		else if(num%10==3)
			if(num/10==1)
				System.out.println(num+"th");
			else
				System.out.println(3+"rd");
		else
			System.out.println(num+"th");
		scan.close();
	}

}
