import java.util.*;

public class SetITHbit {
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i; //left shift
        return n | bitMask;
    }
    public static void main(String[] arg){
        System.out.println(setIthBit(10, 3));
    }
 
}
