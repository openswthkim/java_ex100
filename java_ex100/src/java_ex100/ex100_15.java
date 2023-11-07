package java_ex100;

import java.util.Scanner;

public class ex100_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.printf("%d.%02d.%02d", a, b, c);
        
        scan.close();
    }
}
