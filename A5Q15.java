import java.util.Scanner;
public class A5Q15{
    String deciToBinary(int decimal, String binary ){
        if(decimal==0)
            return binary;
        else{
            binary+=decimal%2;
            decimal/=2;
            return deciToBinary(decimal, binary);
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimal = scan.nextInt();
        A5Q15 a = new A5Q15();
        String revBinary=a.deciToBinary(decimal,"");
        String Binary="";
        for(int i=revBinary.length()-1;i>=0;--i)
            Binary+=revBinary.charAt(i);
        System.out.println("Binary equalant of "+decimal+" is : "+Binary);
        scan.close();
    }
}
