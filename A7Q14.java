import java.io.*;
import java.util.Scanner;
public class A7Q14 {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file path or name(if in same): ");
        String file = scan.nextLine();
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        int i;
        String word;
        String wordsL[];
        int space=0, tab=0, words=0, newline=0;
        while((i=b.read())!=-1){
            if((char)i==' ')
                space++;
            if((char)i=='\t')
                tab++;
            if((char)i=='\n')
                newline++;
        }
        FileReader g = new FileReader(file);
        BufferedReader d = new BufferedReader(g);
        while((word=d.readLine())!=null){
            wordsL = word.split(" ");
            words+=wordsL.length;
        }
        System.out.print("Space : "+space+'\n'+"Tab : "+tab+'\n'+"Newline : "+newline+'\n'+"Words : "+words);
        scan.close();
        b.close();
        f.close();
        g.close();
        d.close();
    }    
}