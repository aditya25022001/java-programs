package myFirstPackage;
import java.util.Scanner;
class bmiCalculator{
    public double height, weight;
    public double getData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in kgs ");
        weight = scan.nextDouble();
        System.out.println("Enter height in meters ");
        height = scan.nextDouble();
        return bmi(weight,height);
    }
    static double bmi(double wt, double ht){
        return wt/(ht*ht);
    }
    public double getwt(){
        return weight;
    }
    public double getht(){
        return height;
    }
}
class displayData{
    public void display(double wt, double ht, double bmi){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("BMI : "+bmi);
        if(bmi<18){
            System.out.println("You are underweight. Eat more!");
        }
        if(bmi>18 && bmi<=25){
            System.out.println("You are fit. Keep it up!");
        }
        if(bmi>25 && bmi<=30){
            System.out.println("You are overeight. Lose some flesh!");
        }
        if(bmi>30){
            System.out.println("You are obese. Not good!");
        }
    }
}
public class A7Q1 {
    public static void main(String args[]){ 
        A7Q1 a = new A7Q1();
        a.use();
    }
    public void use(){
        bmiCalculator b = new bmiCalculator();
        displayData d = new displayData();
        d.display(b.getwt(), b.getht(), b.getData());
    }
}
