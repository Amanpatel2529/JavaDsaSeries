import java.util.*;

public class PairsInArray {

    public static void printPairs(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i <numbers.length; i++) {
            int current = numbers[i]; //2, 4, 6, 8, 10
            for (int j = i + 1; j <numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + totalPairs);  //total pairs would be n(n-1)/2
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }
}


//time complexicity = O(n^2) 
//worst case O(n) 