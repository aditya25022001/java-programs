import java.util.Scanner;
public class A3Q3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to compare : ");
        float x = (float)scan.nextFloat();
        float y = (float)scan.nextFloat();
        compare(x,y);
    }
    static void compare(float a, float b){
        System.out.println("x = "+a+'\n'+"y = "+b);
        if(a<b){    
            System.out.println("x is less than y by "+(b-a)+" units.");
        }
        else{
            if(a>b){
                System.out.println("x is greater than y by "+(a-b)+" units.");    
            }
            else{
                System.out.println("x is equal to y.");
            }
        }
    }
}
