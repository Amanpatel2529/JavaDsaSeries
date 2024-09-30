/*
 Problem Statement -
  Given a route containing 4 directions (E,W,N,S),
  Find the shortest path to reach destination.
  "WNEENESENNN" 
 */

import java.util.*;

public class ShortestPath {
    //displacement
    public static float getShortestPath(String path){
        int x =0, y =0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //cases
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir =='N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }

            //East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args){
        String path = "WNEENESENNN"; //W-West, N=North, E=East, S=South

        System.out.println(getShortestPath(path));
    }
}


/*
O/P - 5.0
Explaination -
   Path = W-1 -> N-1 -> E-1 -> E-1 -> N-1 -> E-1 -> S-1 -> E-1 -> N-1 -> N-1 -> N-1

             North
               Y 
               |
               |
               |(0,0)
West X'--------.--------- X East
               |
               |
               |
               Y'
             South
*/