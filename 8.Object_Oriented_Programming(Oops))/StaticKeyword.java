/*
 Static Keyword -> 
  - used to share the same variable or method of a given class

  - Properties (interview)
  - Functions  (interview)
  - Blocks   (least asked)
  - Nested Classes (least asked)
*/
public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SIT";

        Student s2 = new Student();
        System.out.println(s2.schoolName); // prints SIT

        Student s3 = new Student();
        s3.schoolName = "SKN";
        System.out.println(s1.schoolName); //prints SKN
    }
}

class Student{
    /*
     static function only defined once, and cant be defined again and connot override main method
     cannot override main method of java 
     because a static method cannot be overridden. 
     The static method in java is associated with class 
     whereas the non-static method is associated with an object. 
     Static belongs to the class area, static methods don't need an object to be called. 
     Static methods can be called directly by using the classname
    */

    //this  function only created once as we called this static
    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    
}
