import java.util.Scanner;
public class A1Q7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print table : ");
        int a = scan.nextInt();
        System.out.println("printing table : ");
        for(int i=1;i<=10;i++)
            System.out.println(a+" * "+i+" = "+(a*i));
    }    
}
