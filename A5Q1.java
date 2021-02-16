import java.util.Scanner;
public class A5Q1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String a = scan.nextLine();
        System.out.println("Enter second string : ");
        String b = scan.nextLine();
        System.out.println("compareTo() method : "+a.compareTo(b));
        System.out.println("equals() method : "+a.equals(b));
        scan.close();
    }   
}