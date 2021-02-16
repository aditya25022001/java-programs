import java.io.*;
import java.util.Scanner;
public class A7Q12 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of file : ");
        String name = scan.next();
        File f = new File(name);
        boolean result = f.createNewFile();
        if(result)
            System.out.println("File created successfully");
        else{
            System.out.println("Could not create directory");
        }
        scan.close();
    }
}
