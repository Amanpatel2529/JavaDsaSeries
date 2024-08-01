import java.util.*;


public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Output:

1
12
123
1234
12345

 */