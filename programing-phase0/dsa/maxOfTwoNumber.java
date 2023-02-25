// Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.
package com.dsa;

import java.util.Scanner;
import java.lang.*;

public class maxOfTwoNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int A = sc.nextInt();
        System.out.println("Enter the second number : ");
        int B = sc.nextInt();
        if ( A > B){
            System.out.println(" The maximum element is " + A);
        } else {
            System.out.println("The max element is " + B);
        }
    }
}
