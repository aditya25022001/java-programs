import java.io.*;
import java.util.Scanner;
public class A7Q10 {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file to read");
        String pathFile = scan.nextLine();
        File g = new File(pathFile);
        if(g.exists()){
            FileInputStream f = new FileInputStream(g);
            int i;
            while((i=f.read())!=-1)
                System.out.print((char)i);
            f.close();            
        }
        else{
            System.out.println("No such file directory found");
        }
        scan.close();
    }
}
