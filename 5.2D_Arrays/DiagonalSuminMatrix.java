import java.util.*;

public class DiagonalSuminMatrix {

    public static int diagonalSum(int matrix[][]){
      
        int pdSum =0;
        //brute force method - O(n^2)
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length;j++){
        //         //primary  diagonal sum  i==j
        //         if(i==j){
        //             pdSum += matrix[i][i];
        //         }
        //          //secondary diagonal sum i+j = n-1
        //         else if(i+j == matrix.length-1){
        //             pdSum += matrix[i][j];
        //         }
        //     }
        // }

        //optimal method - O(n)
        for(int i=0; i<matrix.length; i++){
            //pd
            pdSum += matrix[i][i];

            //sd
            if(i !=matrix.length-1-i)
                pdSum += matrix[i][matrix.length-i-1];
        }

        return pdSum;
    }
    public static void main(String [] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                        };
        System.out.print("Diagonal sum of a matrix is: ");
        System.out.println(diagonalSum(matrix));
    } 
}
