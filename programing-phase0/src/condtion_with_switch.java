
import java.util.Scanner;

public class condtion_with_switch {
    public static void main(String args[]) {
        // user input value
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // Switch condition
        switch ( button ) {
            case 1 : System.out.println("Sam");
            break;
            case 2 : System.out.println("Leslie");
            break;
            case 3 : System.out.println("Victo");
            break;
            default : System.out.println("Invalid");
        }
    }

}
