public class zero_one_triangle {
    public static void  main(String args[]){
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if( (i+j)%2 == 0){          // if we plot the 0-1 triangle in a matrix format, we found that 1 is printed
                                            // in the cell when sum of i and j is even nad ) is printed on sum of i and j is ODD
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
