import java.util.*;

public class CheckOddEven {
    public static void oddOrEven(int n) {
        int bitMask = 1; //001
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Even number");
        } else {
            // odd number
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();
        oddOrEven(number);
    }
}

/*
 * LSB(least significant bit) for odd number = 1;
 * LSB(least significant bit) for even number = 0;
 * 
 * So if we perform & operation on numbers then we will be
 * able to calculate number is even or odd
 * 
 * 0 = 0000
 * 1 = 0001
 * 2 = 0010
 * 3 = 0011
 * 4 = 0100
 * 5 = 0101
 * 6 = 0110
 * 7 = 0111
 * 8 = 1000
 * 9 = 1001
 * 10 = 1010
 */