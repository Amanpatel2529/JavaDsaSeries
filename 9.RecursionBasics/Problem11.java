/* 
  Given a "2xn" board and tiles of size "2 x 1",
  count the number of ways to tile the given board
  using the 2 x 1 tiles.
  (A tile can either be placed horizontally or vertically.)
*/
import java.util.Scanner;

class Problem11 {

    public static int tilingProb(int n){ //2 x n (floor size)
        //base case
        if(n==0 || n ==1){
            return 1;
        }

        //vertical tile choice
        int verticalTileChoice = tilingProb(n-1);

        //horizontal tile choice
        int horizontalTileChoice = tilingProb(n-2);

        int totalWays = verticalTileChoice + horizontalTileChoice;
        
        return totalWays;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        //fn call
        System.out.println(tilingProb(n));
    }
}
