import java.util.*;

public class HallowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //iner loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                //for solid rhombus -> System.out.print("*");
                if(i == 1 || i ==n || j==1 || j==n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //for
            /* for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            } */ 
            System.out.println();
        }
        sc.close();
    }    
}

/*
  Output : 

    *****
   *   *
  *   *
 *   *
*****  


 */