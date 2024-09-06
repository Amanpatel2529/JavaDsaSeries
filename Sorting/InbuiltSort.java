import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    //print arr
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        // int arr[] = {5,4,1,3,2};
        Integer arr[] = {5,4,1,3,2}; //for sorting using collection

        //method 1:
        // Arrays.sort(arr); // 0(n log n) 

        //method 2:
        // Arrays.sort(arr, 0, 3);
        /* this sorts from 0 to 3-1 index 0 1 2  and 
           rest of the element stays the same
           o/p : 1 4 5 3 2    
           means arr is sorted from 0th index to 2nd index
        */

        //method 3: 
        /* convert small int to Integer array bcoz 
           it will work on object type variable
           Arrays.sort(arr, Collections.reverseOrder());
           o/p : 5 4 3 2 1
        */
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        //o/p : 5 4 1 3 2 

        printArr(arr);
    }    
}
