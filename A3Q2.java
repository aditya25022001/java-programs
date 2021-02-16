import java.util.Scanner;
public class A3Q2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the octal number : ");
        String octal = scan.nextLine();
        int octa = Integer.parseInt(octal), num;
        while(octa!=0){
            num = octa%10;
            if(num>=8){
                System.out.println("Enter valid octal number");
                System.exit(0);
            }
            octa/=10;
        }
        double num2=0, decimal=0;
        int power=0;
        for(int i=octal.length()-1;i>=0;i--){
            power=octal.length()-1-i;
            num2=Math.pow(8, power)*Integer.parseInt(String.valueOf(octal.charAt(i)));
            decimal+=num2;
        }
        System.out.println("Decimal number is : "+decimal);
    }    
    
}
