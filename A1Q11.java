import java.util.Scanner;
public class A1Q11 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");
        int num = scan.nextInt();
        System.out.println("Factorial of "+num+" is : "+factorial(num));
    }    
    static int factorial(int n){
       int fact = 1;
        for(int i=n;i>=1;i--)
            fact*=i;
        return fact;
    }
}
