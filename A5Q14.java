import java.util.Scanner;
public class A5Q14 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in Fabonacci series : ");
        int length = scan.nextInt();
        A5Q14 a = new A5Q14();
        System.out.print(0+" ");
        a.fabonacciSeries(0,1,length-1);
        scan.close();
    }
    void fabonacciSeries(int num1, int num2, int len){
        if(len==0){
            System.exit(0);
        }
        else{
            int num3=num1+num2;
            System.out.print(num3+" ");
            num2 = num1;
            num1 =  num3;
            len--;
            fabonacciSeries(num1, num2, len);
        }
    }
}
