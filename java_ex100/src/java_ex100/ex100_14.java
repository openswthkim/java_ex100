package java_ex100;

import java.util.Scanner;

public class ex100_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        System.out.println(hour + ":" + minute);
        
        scan.close();
    }
}
