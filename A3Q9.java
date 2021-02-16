import java.util.Scanner;
public class A3Q9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string with even length : ");
        String string = scan.nextLine();
        String result="";
        if(string.length()%2!=0){
            System.out.println("Enter string with even length...");
            System.exit(0);
        }
        else{
            for(int i=0;i<string.length()/2;i++){
                result+=string.charAt(i);
            }
            System.out.println("Full entered string : "+string);
            System.out.println("First half of string : "+result);
        }
    }
}
