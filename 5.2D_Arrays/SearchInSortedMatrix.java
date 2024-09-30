import java.util.*;

public class SearchInSortedMatrix {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
                          //  0   1   2   3
        int matrix[][] = { { 10, 20, 30, 40 }, //0
                           { 15, 25, 35, 45 }, //1
                           { 27, 29, 37, 48 }, //2
                           { 32, 33, 39, 50 }  //3
                        };

        int key = 33;
        staircaseSearch(matrix, key);
    }
}