import java.io.*;
import java.util.Scanner;
public class A7Q13 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter path to create directory without directory name : ");
        String path = scan.nextLine();
        System.out.println("Enter name of directory : ");
        String name = scan.next();
        path = path + name;
        File f = new File(path);
        boolean result = f.mkdir();
        if(result)
            System.out.println("Directory created successfully");
        else{
            System.out.println("Could not create directory");
        }
        scan.close();
    }
}
