package java_ex100;


import java.util.Scanner;

public class ex100_35{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0;

        for(int i=2;i<=n;i+=2){
            sum+= i;
        }
        System.out.println(sum);
        scan.close();
    }
}
