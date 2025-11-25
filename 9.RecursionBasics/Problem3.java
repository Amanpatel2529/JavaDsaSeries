//find factorial of a number n.
// n factorial (n!) = n * (n-1)!;

import java.util.*;

class Problem3{

    public static int findFactorial(int n){
        //base case
        if(n==0){
            return 1;
        }

        //f(n-1) = fn(n-1)!
        int factNMinus1 =findFactorial(n-1);
        //f(n) = n*f(n-1)
        int fn = n * factNMinus1;
        return fn;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        //factorial fn call
        System.out.println(findFactorial(n));
    }
}