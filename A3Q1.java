import java.util.Scanner;
public class A3Q1{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the octal number : ");
        String octal = scan.nextLine();
        String []values = new String[]{"000","001","010","011","100","101","110","111"};
        int octa = Integer.parseInt(octal), num;
        while(octa!=0){
            num = octa%10;
            if(num>=8){
                System.out.println("Enter valid octal number");
                System.exit(0);
            }
            octa/=10;
        }
        String binary = "";
        for(int i=0;i<octal.length();i++){
            binary+=values[Integer.parseInt(String.valueOf(octal.charAt(i)))];
        }
        System.out.println("Binary equivalent is : "+binary);
    }
}

