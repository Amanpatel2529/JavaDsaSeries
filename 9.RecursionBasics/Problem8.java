/*
  Write a fn to find last occurrence of an element in an array
*/

class Problem8 {

    public static int lastOccurrence(int arr[], int key, int i){
        //base case to terminate recursive call
        if(i == arr.length){
            return -1;
        }

        //check for i+1, and check key is available after first occ or not  
        int isFound = lastOccurrence(arr, key, i+1);
        
        //if isFound= -1 (i==arr.length) && arr[i]=key return index
        if(isFound == -1 && arr[i]==key){
            return i;
        }

        //return first occu as last if not  
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3}; //key=5, 1st occu index=4 last occu index=7

        System.out.println(lastOccurrence(arr, 5, 0));
    }    
}
