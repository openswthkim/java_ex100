package java_ex100;

import java.util.Scanner;

public class ex100_53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int minus = Math.max(a - b, a + b);
        int plus = a + b;
        int mul = a * b;
        int dis = Math.max(a / b, b / a);
        int pow_ = Math.max((int) Math.pow((double) a, (double) b), (int) Math.pow((double) b, (double) a));
        System.out.printf("%f", (double) Math.max(minus, Math.max(plus, Math.max(mul, Math.max(dis, pow_)))));
        scan.close();
    }
}
