
   //Take an array as input from the user.search for a given number x and print the index at which it occurs.
package ARRAYS;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int numbers[]=new int [size];

     //input
     for(int i=0; i<size; i++){
             numbers[i]=s.nextInt();
         }
         int x=s.nextInt();
         //output
         for(int i=0; i<numbers.length; i++){
             if(numbers[i]==x){
                 System.out.println("x found at index :" +i);
             }
         }

     }
}
