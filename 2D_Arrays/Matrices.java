import java.util.*;

public class Matrices{
    
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j] == key){
                System.out.println("found at cell (" + i + ","+ j+")");
                return true;
               }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        // int n=3, m=3;  // basic way to start with
        int n= matrix.length, m = matrix[0].length;
        //n gives total no.of rows and m gives total no.of col 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers for 2d array : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        //search function call
        search(matrix, 5);
    }
}