import java.util.Scanner;
public class A1Q8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check armstrong : ");
        int num = scan.nextInt();
        A1Q8 a = new A1Q8();
        if(a.checkArm(num)){
            System.out.println("Entered number is an Armstrong number");
        }        
        else{
            System.out.println("Entered number is not an Armstrong number");
        }
    }
    boolean checkArm(int b){
        boolean result;
        int m=b;
        int n, sum=0;
        while(b!=0){
            n=b%10;
            sum+=Math.pow(n, 3);
            b/=10;
        }        
        if(sum==m){
            result=true;
        }
        else{
            result = false;
        }
        return result;
    }
}