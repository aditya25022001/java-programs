import java.util.Scanner;
public class A3Q8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.println("First number : ");
        int x = scan.nextInt();
        System.out.println("Second number : ");
        int y = scan.nextInt();
        System.out.println("Enter the number to check the sum is equal or not ? : ");
        int z = scan.nextInt();
        String result = (x+y==z) ? "The sum is equal to third integer " : "The sum is not equal to third integer ";
        System.out.println(result);
    }    
}