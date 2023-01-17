package FunctionInJava;

import java.util.Scanner;

public class FactorialNumber {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printFactorial(n);
    }
}
