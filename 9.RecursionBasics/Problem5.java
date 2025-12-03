/*
 print Nth fibonacci number
 f(n) = f(n-1) + f(n-2);
 f(5) -> f(4) + f(3);
 f(4) -> f(3) + f(2);
 f(3) -> f(2) + f(1);
 f(2) -> f(1) + f(0);
 f(1) = 1, f(0)=0 -> base case n=0 return 0, n=1 return 1
*/
import java.util.*;

class Problem5{

    public static int fibo(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }

        int fbnm1 = fibo(n-1); //n-1
        int fbnm2 = fibo(n-2); //n-2
        int fb = fbnm1 + fbnm2; //add (n-1)+(n-2)
        return fb;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        //fn call
        System.out.println(fibo(n));
    }
}