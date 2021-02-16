import java.util.Scanner;
public class A1Q4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choices : "+'\n'+"Area of circle : 1 "+'\n'+"Perimeter of circle : 2 "+'\n'+"Enter your choice : ");
        int choice = scan.nextInt();
        System.out.println("enter radius : ");
        float radius = (float)scan.nextFloat();
        if(choice==1){
            System.out.println("Area of circle is : "+(Math.PI)*(Math.pow(radius, 2))+" sq. units");
        }
        else{
            if(choice==2){
                System.out.println("Perimeter of circle is : "+2*(Math.PI)*radius+" units");
            }
            else{
                System.out.println("Wrong choice entered!");
            }
        }
    }
}
