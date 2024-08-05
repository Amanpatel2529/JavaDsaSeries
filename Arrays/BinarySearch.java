import java.util.*;

public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
         int start =0, end = numbers.length-1;

         while(start <=end){
            int mid = (start + end) / 2;

            //comaparison
            if(numbers[mid] == key){  //found
                return mid;
            }
            if(numbers[mid] < key){  //right
                start = mid + 1;
            }
            else{ //left -> numbers[mid] > key
                end = mid -1;
            }
         }
        return -1;
    }
    public static void main(String[] args) {
        //prerequisite -> sorted arrays (increasing order or descreasing order)
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 16;

        System.out.println("index for key is : " + binarySearch(numbers, key));
    }    
}
