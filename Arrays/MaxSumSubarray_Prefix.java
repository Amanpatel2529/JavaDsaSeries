import java.util.*;

public class MaxSumSubarray_Prefix {

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //-infinity
        int prefix[]=new int[numbers.length]; //sizeofprefixarray

        prefix[0]=numbers[0];//prefix of zero is numbers of zero
        //calculate prefix array
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1]+ numbers[i];
        }

        //outerloop to travers array
        for(int i=0; i<numbers.length; i++){            
            int start = i;
           
            //innerloop
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;

                currSum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
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