import java.util.Scanner;
import java.io.File;
public class A3Q5 {
    public static void main(String args[]){
        System.out.println("Enter the file path : ");
        Scanner scan = new Scanner(System.in);
        String fname = scan.nextLine();
        System.out.println("Computing file size.....");
        long size=0;
        File file = new File(fname);
        size = file.length();
        if(size>0)
            System.out.println("File size is : "+size+" bytes.");
        else{
            System.out.println("No such file found!");
        }
    }
}
