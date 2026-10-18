class Book {
    public void show(){
        System.out.println("This is book answer");
    }
}
class Copy extends Book{
    public void show(){
        System.out.println("This is notes answer");
    }
}
class Calculate {
    public void add(int a ,int b){
        System.out.println("the sum is : "+(a+b));
    }
    public void add(double a , double b , double c){
        System.out.println("Float sum is : "+(a+b+c));
    }
}
public class Overriding {
    public static void main(String[] args) {

        //  1 - Method overriding 
        Copy c = new Copy() ;
        c.show();
       // 2- anonymous object 
       new Book() ;
       new Book().show();
       // 3 - Method overloading 
       Calculate com = new Calculate() ;
       com.add(999, 888);
       com.add(45.78, 89.23, 67.77);

    }
}
