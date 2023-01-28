import java.util.Scanner;

public class inverted_half_pyramid_with_number {
    public static void main(String args[]) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of raws: ");
        int n = sc.nextInt();
        // nested loop
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}