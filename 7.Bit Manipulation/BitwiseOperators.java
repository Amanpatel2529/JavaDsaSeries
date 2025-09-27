import java.util.*;

public class BitwiseOperators{
    public static void main(String[] args){
        // System.out.println(5 & 6);  //Bitwise AND(&)
        // System.out.println(5 | 6);  //Bitwise OR(|)
        // System.out.println(5 ^ 6); //Bitwise XOR(^)
        // System.out.println((~5)); //Bitwise NOT(~) 
        System.out.println((5 << 2)); //Binary Left Shift(<<)
    }
}


/* explaination : ->

Bitwise Operator :- 
1) AND (&) :->
   Truth table ->
    0    0  -> 0
    0    1  -> 0
    1    0  -> 0
    1    1  -> 1

then, 
5 in binary -> 0101
6 in binary -> 0110

if we do 5 & 6 
    0 1 0 1
  & 0 1 1 0
  ----------
   0  1 0 0 -> which is equal to 4 in decimal 
   that is why we get 4 as answer


2) OR(|) :->
    Truth table ->
    0    0  -> 0
    0    1  -> 1
    1    0  -> 1
    1    1  -> 1

then, 
5 in binary -> 0101
6 in binary -> 0110

if we do 5 & 6 
    0 1 0 1
  | 0 1 1 0
  ----------
    0 1 1 1 -> which is equal to 7 in decimal 
   that is why we get 7 as answer


3)XOR(^) :->
Truth table ->
    0    0  -> 0
    0    1  -> 1
    1    0  -> 1
    1    1  -> 0

then, 
5 in binary -> 0101
6 in binary -> 0110

if we do 5 & 6 
    0 1 0 1
  | 0 1 1 0
  ----------
    0 0 1 1 -> which is equal to 3 in decimal 
   that is why we get 3 as answer


4)Binary One's Compliment(1's compliment) NOT(~) :->
    Truth table ->
    0  -> 1
    1  -> 0

   then,  find ~5 ->
   5 in binary -> 
    number : 00000101 so, ~5 is  11111010 (this is 1's compliment)
    so here msb = 0, lsb 0
    msb(most significant bit) : left most bit in binary form of any number
    lsb(least significant bit) : right most bit in binary form of any number  
    
    after conversion of ~5  we get : 111111010
    so here msb changed to 1, and lsb is 0
    
    now find 2's compliment in 1's compliment
    means we have to add 1 to it
    
    1 0 1
   +    1
   -------
    1 1 0  which is equal to 6 in decimal
   
    but we get O/P as -6,
    bcoz, msb=0 means +ve
    but after ~5 we get msb=1 means -ve

So, To understand this more in simple form is to put this all in rules :-
Rules ->
  1) 1's compliment
  2) add 1
  3)check default msb, if msb is 0 before finding 1's compliment
    then number after 1's compliment is -ve & 
    if msb =1 then number should be +ve after 1's compliment


5)Binary Left Shift(<<) Operator:->

Rule :
a << b  = (a*2^b)
ex. 5<<2 = 5*2^2
         = 5*4
         = 20
left shift means if 5 in binary is 000101, if we use left 
shift operator then, it became 010100, means shift the leftmost
2 digits to end and place other on their places, and count the
formed number in binary and convert it to decimal 


6)Binary Right Shift(>>) Operator:->

Rule : 
a >> b = (a/2^b)
ex. 6>>1 = 6/2^1
         = 6/2
         = 3
right shift means if 6 in binary is 00110, if we use right
shift operator then, it became 00011, means shift the rightmost
1 digits to start and place other on their places, and count the
formed number in binary and convert it to decimal



*/ 