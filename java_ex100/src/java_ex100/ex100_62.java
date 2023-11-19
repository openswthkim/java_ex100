package java_ex100;

import java.util.Scanner;

public class ex100_62 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int grade=scan.nextInt()*100000;
		int _class=scan.nextInt()*1000;
		int number=scan.nextInt()*1;
		int person_num=grade+_class+number;
		System.out.print(person_num);
		scan.close();
	}

}
