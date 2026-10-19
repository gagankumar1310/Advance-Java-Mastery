class Airpods {
 String brand = "Noise" ;
 int price = 2700 ;
 int model = 2026 ;
 @Override
 public String toString() {
    return "Airpods [brand=" + brand + ", price=" + price + ", model=" + model + "]";
 }
 @Override
 public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + price;
    result = prime * result + model;
    return result;
 }
 @Override
 public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Airpods other = (Airpods) obj;
    if (brand == null) {
        if (other.brand != null)
            return false;
    } else if (!brand.equals(other.brand))
        return false;
    if (price != other.price)
        return false;
    if (model != other.model)
        return false;
    return true;
 } 
 
}
public class Obj {
    public static void main(String[] args) {
        Airpods a = new Airpods() ;
        Airpods b = new Airpods() ; 
        b.brand = "Iphone" ; 
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.hashCode());
        System.out.println(a.equals(b));
    }
}
