/*
 Remove Duplicates in String (a-z char only)
*/

class Problem12 {
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar-'a']==true){
            //duplicate - recursion
            removeDuplicates(str, index+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            //recursion
            removeDuplicates(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "amanpatel";
        //fn call
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        StringBuilder sb = new StringBuilder("");
        removeDuplicates(str, 0, sb, new boolean[26]);

    }
}
