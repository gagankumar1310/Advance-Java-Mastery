class good {
    float area ; 
    private  int price ; 
     String add ; 
     private int cost ;
     public int getPrice() {
         return price;
     }
     public void setPrice(int price) {
         this.price = price;
     }
     public int getCost() {
         return cost;
     }
     public void setCost(int cost) {
         this.cost = cost;
     }     
}
public class oops {
    public static void main(String[] args) {
        good home  = new good() ;
        home.area = 2000f ;
        home.add = "Firozabad" ; 
        home.setCost(2000000); home.setPrice(5500000);
        int actual = home.getCost() ;
        System.out.println(actual);
        int sell = home.getPrice() ;
        System.out.println(sell);
        // i have maked my changes for learning purpose 
        
    }
}
