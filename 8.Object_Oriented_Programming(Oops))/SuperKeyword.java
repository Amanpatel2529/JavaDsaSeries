public class SuperKeyword {
/* 
  Super keyword -> 
   - used to refer immediate parent class object.
  
   3 use cases of super keyword -> 
   - to access parent's properties
   - to access parent's functions
   - to access parent's constructor 
*/

    public static void main(String[] args){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super(); //animal constructor is called but if we dont write this, still animal constructor will be called by java because java internally write super constructor
        System.out.println("Horse constructor called");
        super.color = "brown";  //this setup animal color property to brown
    }
}
