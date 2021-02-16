import java.util.Scanner;
public class A2Q9{
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        A2Q9 a = new A2Q9();
        int inp = a.getInput();
        a.dispFibonacci(inp);
    }
    int getInput(){
        System.out.println("Enter the number of terms to print the fibonacci series : ");
        int inp = scan.nextInt();
        return inp;
    }
    void dispFibonacci(int inp){
        int first=0, second=1, third=0;
        System.out.print(first+" "+second+" ");
        for(int i=3;i<=inp;i++){
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
}
