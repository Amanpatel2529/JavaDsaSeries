import java.util.*;

public class SubArrays { //subarray means : a continuous part of array

    public static void printSubArray(int numbers[]){
        int totalSubarray = 0;
        for(int i =0; i<numbers.length; i++){ //to find start
            int start = i; //start
            for(int j=i; j<numbers.length; j++){ //to find end
                int end = j; //end
                for(int k =start; k<=end; k++){ //to print start and end element
                    System.out.print(numbers[k]+" "); //subarray
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays : "+totalSubarray);  //total subarray = n(n+1)/2
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers);  //function call
    }
}
