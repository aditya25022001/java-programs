import java.util.Scanner;
public class A5Q4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String sentence  = scan.nextLine();
        System.out.println("Enter the character to count the number : ");
        String character =  scan.nextLine();
        int count=sentence.length()-sentence.replace(character, "").length();
        System.out.println("Occurence of "+character+" in "+sentence+" : "+count);
        scan.close();
    }
}    
