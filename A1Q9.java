import java.util.Scanner;
public class A1Q9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the hexagon : ");
        float side = scan.nextFloat();
        System.out.println("Area of hexagon is : "+((3*Math.sqrt(3)/2)*Math.pow(side, 2))+" sq. units");;
    }
}
