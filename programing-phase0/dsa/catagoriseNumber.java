//Write a program to input a number(A) from user and print
//
//1 if it is positive,
//-1 if it is negative,
//0 if it's neither positive nor negative.

import java.util.Scanner;

public class catagoriseNumber {
    public static void  main(String args[]){
        Scanner sc  = new Scanner(System.in);
        // User input
        System.out.println(" Enter the number : ");
        int num = sc.nextInt();
        // If condition statement
        if ( num > 0){
            System.out.println("1");
        } else if ( num < 0 ) {
            System.out.println("-1");
        }else{
            System.out.println("0");
        }
    }
}
