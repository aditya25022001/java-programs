import java.util.Scanner;
public class A1Q12 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to find sum of digit : ");
        int num = scan.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits is : "+sum);
    }    
}
