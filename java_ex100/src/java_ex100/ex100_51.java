package java_ex100;

import java.util.Scanner;

public class ex100_51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int one = n % 10;
        int ten = n / 10;
        int sum = 0;
        sum = ((ten + one * 10) * 2) % 100;
        System.out.println(sum);
        if (sum <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }
        scan.close();
    }
}
