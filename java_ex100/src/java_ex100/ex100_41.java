package java_ex100;


import java.util.Scanner;

public class ex100_41{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if((n>=30&&n<=40)||(n>=60&&n<=70)){
            System.out.println("win");
        }
        else{
            System.out.println("lose");
        }
        scan.close();
    }
}
