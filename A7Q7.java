import java.io.*;
import java.util.Scanner;
public class A7Q7 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String file = scan.nextLine();
        File f = new File(file);
        System.out.println("File path : "+f.getAbsolutePath());
        System.out.println("File size in bits : "+f.length());
        System.out.println("File size in bytes : "+f.length()/8);
        scan.close();
    }    
}
