/*
  Optimized version -> Print x^n(x of power n in logn Time Complexity) ex. 2^3 = 2*2*2

  recursion -> x^n = x * (x^n-1)
  ex. 2^3 = 2 * (2^2)
      2^2 = 2 * (2^1)
      2^1 = 2 * (2^0)
*/

class Problem10 {
    public static int optimizePower(int a, int n){
        //base case - to terminate recursion
        if(n==0){
            return 1;
        }
       
        //
        int halfPower = optimizePower(a, n/2);
       //int halfPowerSq = optiomizePower(a, n/2) * optimizePower(a, n/2); O(n)
        int halfPowerSq = halfPower * halfPower; //logN

       //if n is odd 
       if(n %2 !=0){
         halfPowerSq = a * halfPowerSq;
       }

       return halfPowerSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizePower(a, n));
    }
}
