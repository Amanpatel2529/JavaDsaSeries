/*
Given n non-negative integers representing an elevation map 
where the width of each bar is 1, 
compute how much water it can trap after raining.
*/
import java.util.*;

public class TrappingWater{

    public static int trap(int [] height){
        int  n = height.length;
        int result = 0, l=0 , r= n-1;
        //l - leftmost, r = rightmost, n-1 bcoz rightmost is consider from right end

        int rMax = height[r], lMax = height[l];
        
        while(l< r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                result+= lMax - height[l];
            }else{
                r--;
                rMax = Math.max(rMax, height[r]);
                result+= rMax- height[r];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trap(height);
        System.out.println(trappedWater);
    }
}