import java.util.Scanner;
interface payable{
    double getAmount(double total);
}
class invoice implements payable{
    public double getAmount(double total){
        double amount;
        amount = total*(1+0.11);
        return amount;
    }
    public void show(double am){
        System.out.println("Invoice payment : "+getAmount(am));
    }
}
class employee implements payable{
    public double getAmount(double total){
        double amount;
        amount = total*(0.15+0.03+0.11+1);
        return amount;
    }
    public void show(double am){
        System.out.println("Employee salary payable : "+getAmount(am));
    }
}
public class A6Q7{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        invoice i = new invoice();
        employee e = new employee();
        System.out.println("Enter invoice total : ");
        double am1= scan.nextDouble();
        System.out.println("Enter employee basic : ");
        double am2 = scan.nextDouble();
        i.show(am1);
        e.show(am2);
        scan.close();
    }
} 
