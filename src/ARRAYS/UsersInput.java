package ARRAYS;

import java.util.Scanner;

public class UsersInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int number[]=new int [size];
        //Input
        for(int i=0; i<size;i++){
            number[i]=s.nextInt();
        }
        //Output
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }

    }
}
