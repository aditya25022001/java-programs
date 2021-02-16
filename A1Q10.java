import java.util.Scanner;
public class A1Q10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in celcius : ");
        double celcius = scan.nextDouble();
        System.out.println("Temperature in Celcius is : "+celcius+" C");
        System.out.println("Temperature in Fahrenheit is : "+((celcius*9/5)+32)+" F");
    }    
}
