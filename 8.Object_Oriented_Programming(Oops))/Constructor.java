import java.util.*;

/*
 Constructor : is a special method which is invoked automatically at the time of object creation.

 properties :
   - Constructor have the same name as class or structure.
   - Constructor don't have return type. (Not even void).
   - Constrcutor are only called once, at object creation.
   - Memory allocation happend when constructor is called.

 Constructor are of 3 type : default(non-parameterized), parameterized, and copy constructor

 */

public class Constructor {

    public static void main(String[] args) {
        // object creation for constructor call
        // constructor called with matching parameters
        Student s1 = new Student();
        Student s2 = new Student("Aman"); // passed string as input, because constructor is accepting input string
        // System.out.println(s1.name);
        Student s3 = new Student(21);
        // Student s4 = new Student("Aman", 21); this will throw error as no constructor
        // is accepting name and roll no as parameter

        // for copy constructor
        s1.name = "Aman";
        s1.roll = 25;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s5 = new Student(s1);
        s5.password = "xyz";

        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s5.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    class Address {
        String city;
    }

    // default constructor
    Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    // constructor - accept string
    // this is parameteried constructor
    Student(String stuName) {
        // System.out.println();
        marks = new int[3];
        this.name = stuName;
    }

    Student(int stuRoll) {
        this.roll = stuRoll;
        marks = new int[3];
    }

    // shallow copy constructor - is a constructor which copies properties of 1 obj to other obj
    // Student(Student s1){
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // } //here this constructor copies properties of s1 obj to s

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
       this.roll = s1.roll;
       this.name = s1.name;

        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
