public class LargestString {
    public static void main(String[] args){
        String fruits [] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            //compare to is case sensitive means A and a is different
            //returns 0 if same
            //returns -ve if str1 < str2
            //return +ve if str1 > str2
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }

            //compareToIgnore function is not case sensitive means A is a
        }
        System.out.println(largest);
    }
}
