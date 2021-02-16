import java.util.Scanner;
public class A4Q5{
    public static void main(String args[]){
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        System.out.println("Enter the number of digit you want to know : ");
        int k = scan.nextInt();
        System.out.println(digit(number, k));
    }
    static int digit(long number, int k){
        int ret;
        long numberCopy = number;
        int  count =0 ;
        while(number!=0){
            number/=10;
            count++;
        }
        int div = count-k;
        numberCopy/=Math.pow(10, div);
        if(numberCopy>0)
            return (int) numberCopy%10;
        else{
            return 0;
        }
    } 
}