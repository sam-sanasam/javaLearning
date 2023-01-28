// printing the first n natual number using for loop

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void  main(String args[]){
        // accepting user input
        // This is the input of nth natual number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth natual number : ");
        int n = sc.nextInt();
        // initialize the sum variable as 0
        int sum = 0;
        for ( int i = 0; i <= n; i++ ) {
            sum = sum + i ;
            System.out.println(sum + " ");
        }
        System.out.println("The total sum of nth natual number is " + sum);
    }
}
