import java.util.*;

public class PalindromeString {
    public static boolean checkPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a palindrome
                // n-1-i is bcoz n is length and n-1 is last character,
                // so if match then i=0 becomes i=1; and n-1 becomes n-2 but for that we have to
                // decrement it by -1
                // so due to this we use i so every time it automaticall decreased by ith value
                // as i increment if matches
                return false;
            }
        }
        return true; // if palindrome then return true
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str));
    }
}
