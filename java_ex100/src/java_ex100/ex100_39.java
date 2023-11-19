package java_ex100;


import java.util.Scanner;

public class ex100_39{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(Math.min(Math.min(a,b),c));
        scan.close();
    }
}
