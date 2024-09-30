import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //inner loop -> spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //inner loop -> stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

        System.out.println();
        }

    sc.close();
    }
}



/*
Output: 

    *****
   *****
  *****
 *****
*****

 */