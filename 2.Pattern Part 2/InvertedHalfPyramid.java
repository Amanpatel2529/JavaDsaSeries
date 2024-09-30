import java.util.*;

public class InvertedHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n = sc.nextInt();

        for(int i = 1;  i<=n; i++){
            //inner loop -> space print
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ") ;
            }

            //inner loop -> star print
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
           
            System.out.println();
        }

        sc.close();
        
    }
}


/*
Output:

    *
   **
  ***
*****

 */