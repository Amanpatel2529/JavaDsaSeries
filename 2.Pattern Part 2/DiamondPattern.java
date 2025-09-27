import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //outer loop ->  upper triangle
        for(int i=1; i<=n; i++){
            //inner loop -> spaces
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }

            //inner loop -> stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
        //outer loop -> lower triangle
        for(int i=n; i>=1; i--){
            //inner loop -> spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //inner loop -> stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
