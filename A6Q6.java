import java.util.Scanner;
abstract class Employee{
    abstract void getAmount(double workTime, double rate);
}
class weeklyEmployee extends Employee{
    void getAmount(double workTime, double rate){
        double ratepw = rate;
        double salary = workTime*ratepw;
        System.out.println("Employee worked for "+workTime+" weeks. Salary payable is : "+salary);
    }
}
class hourlyEmployee extends Employee{
    void getAmount(double workTime, double rate){
        double rateph = rate;
        double salary = workTime*rateph;
        System.out.println("Employee worked for "+workTime+" hours. Salary payable is : "+salary);
    }
}
public class A6Q6{
    public static void main(String args[]){
        double rate , workTime; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee type : ");
        String type = scan.nextLine();
        switch(type){
            case "hourly":
                System.out.println("Enter rate per hour : ");
                rate = scan.nextDouble();
                System.out.println("Enter no of hours worked : ");
                workTime = scan.nextDouble();
                hourlyEmployee h = new hourlyEmployee();
                h.getAmount(workTime, rate);
                break;
            case "weekly":
                System.out.println("Enter rate per week : ");
                rate = scan.nextDouble();
                System.out.println("Enter no of weeks worked : ");
                workTime = scan.nextDouble();
                weeklyEmployee w = new weeklyEmployee();
                w.getAmount(workTime, rate);
                break;
        }
        scan.close();
    }
}
