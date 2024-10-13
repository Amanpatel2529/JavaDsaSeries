import java.util.*;

public class getITHbit {
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n& bitMask) ==0){
            return 0;
        }else{
            return 1;
        }
    } 
    public static void main(String[] args){
        System.out.println(getIthBit(10, 2));
    }
}


/*
  n=10, i=2
  10 in binary is written as  001010
 */