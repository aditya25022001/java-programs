import java.io.*;
import java.util.Scanner;
public class A7Q9 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name to create or to write in :");
        String pathName = scan.nextLine();
        FileWriter f = new FileWriter(pathName);
        String words;
        BufferedWriter b = new BufferedWriter(f);
        String flag = "y";
        while(flag.equalsIgnoreCase("y")){
            System.out.println("Enter text to write : ");
            words = scan.nextLine();
            b.write(words,0,words.length());
            System.out.println("new line?");
            flag = scan.nextLine();
            if(flag.equalsIgnoreCase("y"))
                b.newLine();
            System.out.println("More text ? : ");
            flag = scan.nextLine();
        }
        scan.close();
        b.close();
    }    

}
