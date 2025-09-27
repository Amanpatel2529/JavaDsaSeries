
/*
 Encapsulation is defined as the wrapping up of data(properties) & methods(functions) under a single unit.
 It also implements data hiding(access specifiers)
*/

public class Encapsulation {

    public static void main(String args[]) {
        //programmer class obj
        Programmer p = new Programmer();
        p.setName("Aman");
        System.out.println("Name -> "+ p.getName());

        //person class obj
        Person ps = new Person();
        ps.setName("John");
        ps.setAge(25);

        System.out.println("Name: "+ps.getName());
        System.out.println("Age: "+ps.getAge());
    }
}

class Programmer {
    private String name;

    //getter and setters for name

    //get method used to get the data
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    /*
    here encapsulation mechanism protect internal state of programmer obj and allows how name attribute is accessed and modified.
    
    Uses of encapsulation
      - Data Hiding: internal data of an obj is hidden from outside world, prevent direct access
      - Data Integrity: only validated or safe values can be
        assigned to an obejct's attribute via setter method
      - Reusability: encapsulated code is more flexible and resuable for future modifications or requirements
      - Security: Sensitive data is protected as it cannot be accessed directly.
    */
}


class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}