package RecursionBasics;

//Pb-1 : Print number from n to 1( Decreasing ORDER )

import java.util.Scanner;

public class ProgramRecursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printDec(n);

    }
}
