package java_ex100;

import java.util.Scanner;

public class ex100_42 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ball=scan.nextInt();
		if((ball>=50&&ball<=70)||ball%6==0)
			System.out.println("win");
		else
			System.out.println("lose");
		scan.close();
	}

}
