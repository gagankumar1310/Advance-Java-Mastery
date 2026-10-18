class Details {
  String name ;
  int age ; 
  static String add = "Cricket";
  Details(String s ,int a ){
    name = s ; age = a ; 
     System.out.println(name+" : "+age+" : "+add);
  }
}
class Animal {
  String name = "Lion" ;
  int age = 15 ; 
  Animal(){
    System.out.println(age);
  }
}
class Dog extends Animal {
  String name = "German shepherd" ;
  int age = 12 ;
  Dog(){
    System.out.println(name+" : "+age);
    System.out.println(super.name);
  }
}
class Add{
  private int a ; private int b ; 
  public  void set(int a , int b){
    this.a = a ; this.b = b ; 
  }
  public int get(){
    return a+b ; 
  }

}
public class Static {
    public static void main(String[] args) {
      // 2- about the static keyword 
        Details d1 = new Details("Sachin",53) ;
        Details d2 = new Details("Virat",38) ;
        Details d3 = new Details("ABD",42) ; 
        // 3 - about the super keyword 
        Dog d = new Dog() ; 

        // 4 - About the this keyword , getter and setter method 
        Add a = new Add() ;
        a.set(89, 56);
        int result = a.get() ;
        System.out.println("the sum is : "+result);
    }
    static {
      System.out.println("i will execute before everyone becouse i am static block");
    }
}
