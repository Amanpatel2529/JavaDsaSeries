/*print sum of first n natural numbers.
f(n) = n + f(n-1) -> 
f(4) = 4 + f(4-1) 
f(3) = 3 + f(3-1)
f(2) = 2 + f(2-1)
f(1) = 1 -> base case n==1 return 1

*/
import java.util.*;

class Problem4{
    public static int sumOfNaturalNum(int n){
        //base case
        if(n==1){
            return 1;
        }
        
        int sumOfNMinus1 = sumOfNaturalNum(n-1);
        int Sn = n + sumOfNMinus1;
        return Sn;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        //fn call
        System.out.println(sumOfNaturalNum(n));
    }
}