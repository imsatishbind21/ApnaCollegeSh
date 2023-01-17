package FunctionInJava;

import java.util.Scanner;

public class Multi2Number {
    public static int multiplyProduct(int a ,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Product of 2 number is:" +multiplyProduct(a,b));
    }
}
