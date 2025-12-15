/*
  Check if array is sorted or not with recursion
*/

class Problem6 {
    public static boolean isSorted(int arr[], int i){
        //base case to terminate recursion if i==single ele
        if(i==arr.length-1){
            return true;
        }

        //check if i > i+1 return false 
        if(arr[i] > arr[i+1]){
            return false;
        }

        //if i<i+1
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,5}; //false
        System.out.println(isSorted(arr, 0));
    }    
}
