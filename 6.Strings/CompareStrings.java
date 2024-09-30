public class CompareStrings {
    public static void main(String [] args){
        
        String s1 = "Aman";
        String s2 = "Aman";
        String s3 = new String("Aman");

        //this prints strings are equals
        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are nopt equal");
        // }

        // //this prints strings are not equals  bcoz == checks at object level
        // if(s1 == s3){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }


        //this prints strings are equals - bcoz equal function check values only
        if(s1.equals(s3)){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");
        }
    }
}
