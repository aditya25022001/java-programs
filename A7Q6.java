import java.io.*;
import java.util.Scanner;
public class A7Q6 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name / path to delete : ");
        String path = scan.nextLine();
        File f = new File(path);
        if(f.exists()){
            boolean result = f.delete(); 
            if(result)
                System.out.println("Successfully deleted file : " + f.getName());
            else{
                System.out.println("Failed to delete");
            }
        }
        else{
            System.out.println("File not present. ");
        }
        scan.close();
    }   
}
