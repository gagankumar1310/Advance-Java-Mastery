class teacher {
    private String name ; private String subject ; 
    teacher( String n , String s){
        name = n ; subject = s ; 
        System.out.println("i am teaching");
        System.out.println(name+" : "+subject);
    }
}
class mark{
    private int marks ; private int rank ; 
    mark(){
        marks = 78 ; 
        rank  = 4 ; 
    }
    mark(int a ,int b){
        marks =a ; 
        rank = b ; 
    }
    mark(int x){
        marks = x ; 
        this.rank = 2 ;
    }
    public int getMarks() {
        return marks;
    }
    public int getRank() {
        return rank;
    }
}   
 class family { 
   static String address = "Firozabad";
    String name ; 
    int age ; 
    family(String name , int age ){
        this.name = name ; this.age = age ; 
    }
    void show(){
        System.out.println(name+" : "+age+" : "+address);
    }
    // we are creating static method 
    static void show2(family x){
        System.out.println(x.name+" : "+x.age+" : "+address);
    }
 }
public class constructer {
    public static void main(String[] args) {
        teacher t1 = new teacher("Santosh", "Math")  ;
        teacher t2 = new teacher("Ravi", "Physics") ;
        mark m = new mark() ;  
        // default contructor 
        System.out.println(m.getMarks()+" : "+m.getRank());
        // parameterized  constructor 
        mark m2 = new mark(80, 5) ;
         System.out.println(m2.getMarks()+" : "+m2.getRank());
        //  another constructor 
        mark m3 = new mark(96) ;
         System.out.println(m3.getMarks()+" : "+m3.getRank());
        //  creating new object of family 
        family b1 = new family("Elder", 70) ;
        family b2 = new family("Middle", 65) ;
        family b3 = new family("Younger", 60) ;
        //  now print all of three detail 
        b1.show(); 
        b2.show();
        b3.show();
        // if we change the address of one person will affect other 
        b3.address = "New Delhi" ;
        b1.show();
        b2.show();
        b3.show();
        System.out.println();
        //  calling static method 
        family.show2(b3);
        family.show2(b2) ;
        family.show2(b1);
    
    }
}
