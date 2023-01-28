import java.util.Scanner;

public class odd_even {
    public static void main(String args[]){
        // accepting user input to check whether the number is an Odd or a even
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int num = sc.nextInt();
        // condition started
        if ( num%2 == 0 ) {
            System.out.println("the user given number " + num + " is Even" );
        } else{
            System.out.println("the user given number " + num + " is Odd");
        }
    }
}
