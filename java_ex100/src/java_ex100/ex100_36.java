package java_ex100;
import java.util.Scanner;

public class ex100_36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + " " + j);
			}
			scan.close();
		}
	}
}
