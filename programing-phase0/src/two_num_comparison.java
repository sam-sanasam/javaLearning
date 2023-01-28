import java.sql.SQLOutput;
import java.util.Scanner;

public class two_num_comparison {
    public static void main(String args[]){
        // accepting user input
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number : ");
        double num_1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double num_2 = sc.nextDouble();

        // condition statement
        if ( num_1 == num_2){
            System.out.println("Both number are same");
        } else if ( num_1 > num_2) {
            System.out.println(" 1st number is greater than 2nd number");

        }else {
            System.out.println("2nd number is greater than 1st number");
        }
    }
}
