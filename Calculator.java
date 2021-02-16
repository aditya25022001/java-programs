import java.util.Scanner;
public class Calculator {
       static void content(){
        System.out.println("************************************");
        System.out.println("        Basic Calculator");
        System.out.println("************************************");
        System.out.println("1 Addition"); 
        System.out.println("2 Substraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        System.out.println("5 remainder");
    }
    static String yesno(){
        Scanner scan = new Scanner(System.in);
        System.out.println("dou");
        String yn = scan.nextLine();
        return yn;
    }
    public static void main(String args[]){
        int a,b;
        do{
            content();
            Scanner inp = new Scanner(System.in);
            int choice = inp.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter two numbers");
                    a = inp.nextInt();
                    b = inp.nextInt();
                    System.out.println("Result is:" + (a+b));
                    content();
                    break;
                case 2:
                    System.out.println("enter two numbers");
                    a = inp.nextInt();
                    b = inp.nextInt();
                    System.out.println("Result is:" + (a-b));
                    content();
                    break;
                case 3:
                    System.out.println("enter two numbers");
                    a = inp.nextInt();
                    b = inp.nextInt();
                    System.out.println("Result is:" + (a*b));
                    content();
                    break;
                case 4:
                    System.out.println("enter two numbers");
                    a = inp.nextInt();
                    b = inp.nextInt();
                    System.out.println("Result is:" + (a/b));
                    content();
                    break;
                case 5:
                    System.out.println("enter two numbers");
                    a = inp.nextInt();
                    b = inp.nextInt();
                    System.out.println("Result is:" + (a%b));
                    content();
                    break;
            }
        }while("yes".equals(yesno()));

    }
    
}
