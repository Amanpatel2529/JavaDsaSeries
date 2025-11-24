//print numbers from 1 to n(Increasing Order)

import java.util.*;

class Problem2{
    public static void printNumInc(int n){
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        //recursive call
        printNumInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        //fn call
        printNumInc(n);
    }
}