interface vehicle{
    String getColor();
    String getNumber();
    double getConsumption();
}
class twoWheeler implements vehicle{
    String color="black";
    String model_name_number="Royal Enfield Classic 500";
    double consumption=52.34;
    public String getColor(){
        return this.color;
    } 
    public String getNumber(){
        return this.model_name_number;
    } 
    public double getConsumption(){
        return this.consumption;
    } 
}
class fourWheeler implements vehicle{
    String color="black";
    String model_name_number="Toyota Fortuner v2.5";
    double consumption=16.00;
    public String getColor(){
        return this.color;
    } 
    public String getNumber(){
        return this.model_name_number;
    } 
    public double getConsumption(){
        return this.consumption;
    }
}
public class A6Q9 {
    public static void main(String args[]) {
        twoWheeler t = new twoWheeler();        
        System.out.println("Color of twowheeler: "+t.getColor());
        System.out.println("Model of twowheeler:: "+t.getNumber());
        System.out.println("Consumption of twowheeler:: "+t.getConsumption());
        
        fourWheeler f = new fourWheeler();
        System.out.println("Color of fourwheeler: "+f.getColor());
        System.out.println("Model of fourwheeler:: "+f.getNumber());
        System.out.println("Consumption of fourwheeler:: "+f.getConsumption());
    }
}
