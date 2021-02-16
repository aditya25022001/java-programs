import java.io.*;
import java.util.Scanner;
public class A7Q15{
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name(if in same directory) or path :");
        String file = scan.nextLine();
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        String search;
        System.out.println("Enter the word you want to search : ");
        search = scan.nextLine();
        String i;
        String words[];
        int count=0;
        while((i=b.readLine())!=null){
            words = i.split(" ");
            for(String j : words)
                if(j.equals(search))
                    count++;
        }
        f.close();
        b.close();
        scan.close();
        System.out.println("appeared "+count+" times.");
    }
}