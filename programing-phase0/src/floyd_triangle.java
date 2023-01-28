import java.util.Scanner;

public class floyd_triangle {
    public static void  main(String args[]){
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the raw number : ");
        int n = sc.nextInt();
        // initialize a number
        int number = 1;
        for (int i=1; i<=n; i++){
           for (int j=1; j<=i ; j++){
               System.out.print(number+ " ");
               number =number +1 ;
           }
            System.out.println();
        }
    }
}
