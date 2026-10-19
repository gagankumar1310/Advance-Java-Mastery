package OOPS;
abstract class Job {
    // we can have bothg abstract and normal method
    abstract void skill() ;
    void cgpa(){
        System.out.println("you should have strong academic background");
    }
}
class employee extends Job {
       void skill(){
        System.out.println("Core java , spring , springboot , JWT and Servlets ");
       }
       void meet(){} ;
    //    inner class 
  class Salary {
        void income(){
            System.out.println("28 lakh per annum ");
        }
    }
//    static inner class
static class Code {
   static void work(){
        System.out.println("make our application scalable and fix problems");
    }
}
}
// interface 
 interface SDE {
    void dsa() ;
 }
// interface 2 
interface MTS {
    int project() ;
}
public class Abstraction {
    public static void main(String[] args) {
        // 1 - we use abstract for hide our data for security purpose 
        employee e = new employee() ;
        e.skill(); e.cgpa();

        //  2 - we will use inner class 
        employee.Salary s = e.new Salary() ; // for non-static 
        s.income();

        // 3 - for static inner class 
        employee.Code.work() ;

        // 4 - we will create anonymous inner class . 
        // we should have a meet() method in parent class 
        employee e2 = new employee() {
            public void meet(){
                System.out.println("we have meeting tomorrow");
            }
        } ;
        e2.meet();
        
        // 5- now we will use inerface with lamda expression 
        SDE it = () -> {
                System.out.println("Learn Data Structure & Algo");
            } ; 
            it.dsa();
            MTS mts = () -> 3 ; 
            int number = mts.project() ;
            System.out.println(number);
    }
}
