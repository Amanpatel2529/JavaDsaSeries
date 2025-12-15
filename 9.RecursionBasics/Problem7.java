/*
  Write a fn to find first occurrence of an element in an array
*/

class Problem7 {

    public static int firstOccurrence(int arr[], int key, int i){
        //base case to terminate recursive call
        if(i == arr.length){
            return -1;
        }

        //if arr[i] is eql to key return index
        if(arr[i]==key){
            return i;
        }

        //recursive call at index i+1 
        return firstOccurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3}; //key=5, 1st occu index=4

        System.out.println(firstOccurrence(arr, 5, 0));
    }    
}
