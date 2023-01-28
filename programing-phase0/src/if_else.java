import java.util.*;   // import the java util to able to use the function/method later in the code

public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  // Creating a method to accept user input
        int age = sc.nextInt();               // define the variable to store the user input as int

        // if else condition
        if ( age <= 18 ){
            System.out.println("Not adult");
        }else{
            System.out.println("Adult");
        }

    }
}
