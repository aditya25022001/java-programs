import java.io.*;
import java.util.Scanner;
public class A7Q11 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String path = scan.nextLine();
        FileOutputStream f = new FileOutputStream(path);
        String flag = "y";
        String words;
        while(flag.equalsIgnoreCase("y")){
            System.out.print("Enter text : ");
            words = scan.nextLine();
            f.write(words.getBytes());
            System.out.println("want to write more : ");
            flag = scan.nextLine();
        }
        scan.close();
        f.close();
    }   
}
