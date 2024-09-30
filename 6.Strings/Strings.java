import java.util.*;
public class Strings{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";  
        String str2 = new String("xyz");

        //strings are Immutable (unchanged)

        //I/O 
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next(); //only print first word
        // name = sc.nextLine(); //gets complete string 
        // System.out.println(name);

        //length function
        // String fullName = "Captain America"; //length is 15 including spaces
        // System.out.println(fullName.length());

        //string concatination
        String firstName = "Aman";
        String lastname = "Patel";
        String fullName = firstName +" "+ lastname;
        System.out.println(fullName);

        //String functions - charAt();
        // System.out.println(fullName.charAt((0))); //A


        //function call
        printLetters(fullName); // A m a n  P a t e l
    }
}