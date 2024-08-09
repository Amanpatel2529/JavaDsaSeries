public class MaxSumSubarray_Kadane_sAlgo {
    public static void maxSubarraySum(int numbers[]){

        int currSum = 0; //starting value
        int maxSum = Integer.MIN_VALUE; //-infinity start value

        for(int i=0; i<numbers.length; i++){
            currSum +=numbers[i];
            if(currSum<0){
                currSum =0;   //ignore negative values
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("our max subarray sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(numbers);
    }
}

//code flow
// currSum 0|0|4|3|1|2|7|4
// maxSum  0|0|4|4|4|4|7|7