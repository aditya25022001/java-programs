import java.util.Scanner; 
public class A1Q1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number : ");
        int x = scan.nextInt();
        System.out.println("enter second number : ");
        int y = scan.nextInt();
        System.out.println("Before Swapping : "+'\n'+"x : "+x+'\n'+"y : "+y);
        swap(x,y);
    }
    static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping : "+'\n'+"x : "+a+'\n'+"y : "+b);
    }
}
