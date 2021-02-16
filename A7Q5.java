import java.io.*;
import java.util.Scanner;
public class A7Q5 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the file from which to copy content : ");
        String fileFromCopyContent = scan.nextLine();
        System.out.println("enter the file to which copy the content : ");
        String fileToCopyContent = scan.nextLine();
        FileReader r = new FileReader(fileFromCopyContent);        
        FileWriter w = new FileWriter(fileToCopyContent);
        BufferedReader br = new BufferedReader(r);
        BufferedWriter bw = new BufferedWriter(w);
        int i;
        while((i=br.read())!=-1){
            bw.write(i);
        }        
        scan.close();
        br.close();
        bw.close();
        w.close();
        r.close();
    }
}
