// Print numbers from n to 1(Decresing Order)

import java.util.*;

class Problem1{

    //with recursion
    public static void printNumDec(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }

        //recursive call
        System.out.print(n+" ");
        printNumDec(n-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        //with basic for loop
        // for(int i = n; i>0; i--){
        //     System.out.print(i+" ");
        // }

        //with recursion - fn call
        printNumDec(n);
    }
}