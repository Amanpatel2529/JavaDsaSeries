import java.util.*;

public class ReverseAnArray {
    public static void reversArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        System.out.print("original array : ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        reversArray(numbers);
        // print arr
        System.out.print("reversed array : ");
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
