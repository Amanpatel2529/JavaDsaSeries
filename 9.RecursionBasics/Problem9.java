/*
  Print x^n(x of power n) ex. 2^3 = 2*2*2

  recursion -> x^n = x * (x^n-1)
  ex. 2^3 = 2 * (2^2)
      2^2 = 2 * (2^1)
      2^1 = 2 * (2^0)
*/

class Problem9 {
    public static int power(int x, int n){
        //base case - to terminate recursion
        if(n==0){
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
