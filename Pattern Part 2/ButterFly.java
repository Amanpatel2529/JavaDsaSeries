import java.util.*;


public class ButterFly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n  = sc.nextInt();
       
       for(int i=1; i<=n; i++){
        
        //inner loop -> stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        //inner loop -> spaces
        for(int j =1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //inner loop -> stars
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }

       for(int i=n; i>=1; i--){
         //inner loop -> stars
         for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        //inner loop -> spaces
        for(int j =1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //inner loop -> stars
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
       
       sc.close();
    }

}

/*
Output :

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/