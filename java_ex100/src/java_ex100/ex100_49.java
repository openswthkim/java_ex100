package java_ex100;

import java.util.Scanner;

public class ex100_49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int sum = 0;
        sum += hour * 60;
        sum += minute;
        sum -= 30;
        System.out.printf("%d %d", sum / 60, sum % 60);
        scan.close();
    }
}
