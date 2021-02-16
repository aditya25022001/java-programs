package assn2;
import java.util.Scanner;
class sum100{
    private int choice;
    int getChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("For loop : 1");
        System.out.println("While loop : 2");
        System.out.println("Do While loop : 3");
        System.out.println("Enter choice: ");
        choice = scan.nextInt();
        if(choice !=1 && choice !=2 && choice !=3)
            return getChoice();
        else{
            return choice;
        }
    }
    void printSum(int choice){
        int sum=0;
        int i=1;
        System.out.println("printing the sum of 100 numbers using your preference : ");
        if(choice == 1){
            System.out.println("For loop : ");
            for(i=1;i<=100;i++)
                sum+=i;
            System.out.println(sum);
        }
        else{
            if(choice == 2){
                System.out.println("While loop : ");
                while(i<=100){
                    sum+=i;
                    i++;
                }
                System.out.println(sum);
            }
            else{
                System.out.println("Do While loop : ");
                do{
                    sum+=i;
                    i++;
                }while(i<=100);
                System.out.println(sum);
            }
        }
    }
} 
public class A2Q1 {
    public static void main(String args[]){
        sum100 s = new sum100();
        int c = s.getChoice();
        s.printSum(c);
    }    
}
