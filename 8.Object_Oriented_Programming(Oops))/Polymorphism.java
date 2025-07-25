
/*
 Poly = Many, Morph = forms
 def -> when we have multiple methods with same name but different parameters, it is called polymorphism

 Compile time poly (static) = method overloading
 def -> when we have multiple methods with same name but different parameters in same class, it is called method overloading

 run time poly (dynamic) = method overriding
 def -> when we have multiple methods with same name but different parameters in different classes, it is called method overriding

 eg. 
*/

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum (1, 2));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum(1.5f, 2.5f));
        
        //or typecast to float
        System.out.println(calc.sum((float)1, (float)3));

        Deer  d = new Deer(); //object of child class so it will call child class function only not parent
        d.eat(); //will print child class fun eat()
    }
}


//method overloading - same name different parameter(parameter count or type should be different)
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}

//method overriding - parent and child classes both contain same function with different defination
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends  Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

