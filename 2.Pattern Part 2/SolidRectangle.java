import java.util.*;

public class SolidRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m (col):");
        int m = sc.nextInt();
        System.out.print("Enter n (rows):");
        int n = sc.nextInt();

        for(int i= 1; i <=m; i++){
            for(int j = 1; j <=n; j++){
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
 */