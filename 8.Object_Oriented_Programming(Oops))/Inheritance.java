import java.util.*;

/*
 Inheritance is when properties & methods of base class are passed on to a derived class.

 eg. Animal is a base class and Dog is a derived class.

 types of inheritance : 
    1)Single level inheritance (Base class -> Derived class)
      eg. Animal -> Dog

    2)Multi level inheritance  (Base class -> Derived class -> Derived class)
      eg. Animal -> Dog -> Puppy

    3)Heirarchical inheritance (Base class -> Derived class 1, Derived class 2, Derived class 3)
      eg. Animal -> Dog, Cat, Cow

    4)Hybrid inheritance       (Base class -> Derived class 1, Derived class 2 -> Derived class 3)
      eg. Animal -> Dog, Cat -> Persian cat

    5)Multiple inheritance     (Derived class 1, Derived class 2 -> Derived class 3)
     eg. Dog, Cat -> Persian cat
*/

public class Inheritance {
    public static void main(String args[]){
        // create obj
        Fish shark = new Fish();
        shark.color = "blue";
        shark.eat();
        System.out.println(shark.color);

        // create obj
        Dog dobby = new Dog();
        dobby.color = "black";
        dobby.breath();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }    
}


class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

// child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks on land");
    }
}

class Dog extends Mammal{
    String breed;
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly on air");
    }
}


