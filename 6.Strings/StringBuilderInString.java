import java.util.*;
import java.lang.StringBuilder;

public class StringBuilderInString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
           sb.append(ch);
        }  //abcdefghijklmnop
        //0(26)
        //0{n^2}
        System.out.println(sb);
        System.out.println(sb.length()); //26
    }
}
