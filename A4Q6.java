import java.util.Scanner;
public class A4Q6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of triangular number : ");
        int index = scan.nextInt();
        if(index==1)
	System.out.println("first triangular no is 0");
        else
        	System.out.println(index+"th triangular number is : "+t(index-1));
    }
    static long t(int n){
        if(n==1)
            return 1;
        else{
            return n+t(n-1);
        }
    }
}
