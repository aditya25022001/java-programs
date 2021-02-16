import java.util.Scanner;
public class A1Q3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************CALCULATOR***********************************");
        System.out.println("Enter two operands and one operator one by one i.e. operand operator operand : ");
        System.out.println("operand one : ");
        float x = (float)scan.nextFloat();
        System.out.println("operator : ");
        String o = scan.next();
        System.out.println("operand two : ");
        float y = (float)scan.nextFloat();
        calculator(x, o, y);
    }
    static void calculator(float a, String c, float b ){
        switch (c) {
            case "+":
                System.out.println(a+" + "+b+" = "+(float)(a+b));
                break;
            case "-":
                System.out.println(a+" - "+b+" = "+(float)(a-b));
                break;
            case "*":
                System.out.println(a+" * "+b+" = "+(float)(a*b));
                break;
            case "/":
                System.out.println(a+" / "+b+" = "+(float)(a/b));
                break;
            case "%":
                System.out.println(a+" % "+b+" = "+(a%b));
                break;
            default:
                System.out.println("Wrong choice entered!");
                break;
        }
    }
}
