package java_ex100;

import java.util.Scanner;

public class ex100_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i=0; i<3; i++) {
            arr[i] = scan.nextInt();
        }

        String odd = "odd";
        String even = "even";

        for (int i=0; i<3; i++) {
            if (arr[i]%2 == 0) {
                System.out.println(even);
            } else {
                System.out.println(odd);
            }
        }
        scan.close();
    }
}
