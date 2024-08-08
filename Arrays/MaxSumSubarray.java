import java.util.*;

public class MaxSumSubarray {  //brute force approach

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //outerloop to travers array
        for(int i=0; i<numbers.length; i++){            
            int start = i;
            //innerloop
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum =0;

                //third level inner loop
                for(int k = start; k<=end; k++){ //print
                    
                    // System.out.print(numbers[k]+ " ");  subarray
                    //subarray sum
                   currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum= currSum;
                }
            }
        }
        System.out.println("max sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};  //{2, 4, 6, 8, 10}
        maxSubarraySum(numbers);

    }    
}

//time complexity = O(n^3)  //bad complexity but this is the basic approach we can go for
//brut force method
//the optimal and best complexity is when we use prefix sum approach