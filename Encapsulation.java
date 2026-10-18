class Detail {
  private String name ; 
  private int salary ; 
  public String getName(){
    return name ; 
  }
  public  int getSalary(){
    return salary ; 
  }
  public void setName(String s){
    name = s ; 
  }
  public void setSalary(int x ){
    salary = x ; 
  }
}
class Multi {
    Multi(int a ,int b){
        System.out.println("product of 2 num : " + (a*b));
    }
    Multi(int a ,int b , int c){
        System.out.println("product of 3 num : "+ (a*b*c));
    }
}
public class Encapsulation {
     void main() {
        Detail d = new Detail() ;
        d.setName("Gagan singh"); d.setSalary(210000);
        String name = d.getName() ; int salary = d.getSalary() ;
        System.out.println(name+" : "+ salary);
        // constructor overloading 
        Multi a = new Multi(55, 60) ;
        Multi b = new Multi(67, 89, 78);
    }
}
