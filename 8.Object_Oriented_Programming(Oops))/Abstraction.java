
/*
Hidding all the unnecessary details and showing only the important parts to the users.

Abstrat Classes & Interfaces are two ways to implement abstraction

Abstract class -> 
 - to make class abstract use abstract keywork before class.
 - cannot create an instance of abstract  class
 - can have abstract/non-abstract methods
 - can have constructors

Interfaces ->  (interface is blueprint of class and class is blueprint of objects)
 - All method are public, abstract &  without implementation
 - Used to achieve total abstraction
 - Variables in interface are final, public and static

 */
public class Abstraction {

    public static void main(String[] args) {

        //horse object/instance
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        //chicken object/instance
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        //animal object/instance - it will throw error as we cannot create object of abstract class
        //Animal a = new Animal(); 
        //mustang object/instance
        Mustang myHorse = new Mustang();

        //Animal -> Horse - > Mustang


        //interface -> 
        //creating object/instance of Queen class
        Queen q = new Queen();
        q.moves();
    }
}

//abstract class
abstract class Animal {

    //non abstract method
    void eat() {
        System.out.println("Animal eats");
    }

    //abstract method - this is abstract method cause it dont have implementation
    abstract void walk();

    //can have constructor - so lets create it 
    String color;
    // Animal() {
    //     color = "Brown";
    // }
    //Animal constructor meaning  those classes extend animal will by default have color=brown until they explicitly change it

    Animal() {
        System.out.println("Animal constructor called");
    }

}

//sub class
class Horse extends Animal {

    //implemented walk
    void walk() {
        System.out.println("Walks on 4 legs");
    }

    //horse constructor
    Horse() {
        System.out.println("Horse constructor called");
    }
}

class Chicken extends Animal {

    //implemented walk 
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

//so walk is abstract method so we dont implement it in animal, but those classes extends animal then those classes need to implment walk for sure or it will throw an error
//class extend horse
class Mustang extends Horse {

    //mustang constructor
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

//interface implementation ->
interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}
