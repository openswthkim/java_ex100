package java_ex100;

import java.util.Scanner;

public class ex100_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int k = a*(int)Math.pow(2, b);

        System.out.println(k);
        
        scan.close();
    }
}
