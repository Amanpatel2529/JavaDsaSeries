import java.util.*;

public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int swap =0;
        for(int i=0; i<arr.length-1; i++){
            //j<arr.length-1-i is bcoz we
            
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};

        bubbleSort(arr);
        printArr(arr);
    }
}


// input -> 5 4 1 3 2
//output -> 1 2 3 4 5
/* 
 1st turn -> 4 5 1 3 2  swap=1
 2nd turn -> 4 1 5 3 2  swap=2
 3rd turn -> 4 1 3 5 2  swap=3
 4th turn -> 4 1 3 2 5  swap=4
 5th turn -> 1 4 3 2 5  swap=5
 6th turn -> 1 3 4 2 5  swap=6
 7th turn -> 1 3 2 4 5  swap=7
 8th turn -> 1 3 2 4 5  swap=7  no swap bcoz 1 < 3
 9th turn -> 1 2 3 4 5  swap=8
 10th turn -> 1 2 3 4 5  swap=8  no swap bcoz 3 4 5 
are already sorted and when we check 1 2 3 then 
they find out to be sorted
 */