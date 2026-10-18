package OOPS;
class Animal {
    public void sound(){
        System.out.println("Animal sound");
    }
    public void eat(){
        System.out.println("they eats whatever they found");
    }
}
class Dog extends Animal {
    public void sound(){
        System.out.println("Dog Barks");
    }
    public void show(){
        System.out.println("Dog can survive for 14 years");
    }
}
class Cat extends Animal {
    public void sound(){
        System.out.println("Cat meows");
    }
    public void eat(){
        System.out.println("cat eats fish and sometimes rats");
    }
}
final class Mobile {
    public void talk(){
        System.out.println("we can call anyone and talk with them ");
    }
    // it cannot be inherited by another class becouse it is final 
}
class Phone {
    final int x = 100 ; 
    // we cannnot change the value of x 
    final public void photo(){
        System.out.println("we can take selfies");
    }
    // final method will stop overriding 
}
class Vivo extends Phone{
    Vivo(){
        System.out.println("Made in china");
    }
}
public class DMD {
    public static void main(String[] args) {
        Animal a = new Dog() ;
        a.sound();
        // a.show() ; it will show compile time error 
        Animal b = new Cat() ; 
        b.eat();
        Dog d = new Dog() ;
        d.show();
        Phone p = new Vivo() ;
        // but we can use final method by sub class object 
        p.photo() ;
        // p.x = 200 ; we cannot change the value 

    }
}
