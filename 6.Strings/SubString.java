public class SubString {
    //customized finction
    public static String printSubString(String str, int si, int ei){
        String substr = "";
        for(int  i=0; i<ei; i++){
            substr += str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        System.out.println(printSubString(str, 0, 5));

        //built in method for substring
        System.out.println(str.substring(0, 5));
    }
}
