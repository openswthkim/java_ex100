package java_ex100;

import java.util.Scanner;

public class ex100_61 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int var1,var2;
        char op;
        var1 = scan.nextInt();
        op = scan.next().charAt(0);
        var2 = scan.nextInt();
        if(op=='+'){
            System.out.println(var1+var2);
        }
        else if(op=='-'){
            System.out.println(var1-var2);
        }
        else if(op=='*'){
            System.out.println(var1*var2);
        }
        else if(op=='/') {
            System.out.println(var1 / var2);
        }
        scan.close();
    }
}
