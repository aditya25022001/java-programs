import java.util.Scanner;
public class A5Q6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String sentence  = scan.nextLine();
        String sub;
        int length = sentence.length();
        System.out.println("Substrings of "+sentence+" are : ");
        for(int i=0;i<length;++i)
            for(int j=1;j<=length-i;++j){
                sub = sentence.substring(i, i+j);
                System.out.print(sub+"   ");
            }
        scan.close();
    }
}
