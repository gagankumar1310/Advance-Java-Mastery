package OOPS;
enum warning {
    Success , Pending , Failed , Running 
}
class Study {
    void studyUntilGetSatisfaction(){
        System.out.println("big MNC and Product based compony");
    }
}
class Read  extends  Study {
    @Override 
    // it will give compile time error if some spelling mistake 
    void studyUntilGetSatisfaction(){
        System.out.println("do whatever you want");
    }
}
public class Anotation {
    public static void main(String[] args) {
        Read read = new Read() ;
        read.studyUntilGetSatisfaction();  
        //  now we will take about Enum 
        warning w =  warning.Success ;
        switch (w) {
            case Pending :
                System.out.println("the work is still pending");   
                break;
            case Running : 
            System.out.println("Runnning the process");
               break ; 
            case Success : 
               System.out.println("Successfully done ");
               break ; 
            default : 
               System.out.println("read all carefully");
                break;
        }
    }
}
