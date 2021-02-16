import java.io.*;
import java.util.Scanner;
public class A7Q8 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file path : ");
        String pathFile = scan.nextLine();
        BufferedReader b = new BufferedReader(new FileReader(pathFile));
        int i;
        while((i=b.read())!=-1){
            System.out.print((char)i);
        }
        scan.close();
        b.close();
    }
}
