import java.util.Scanner;
import java.util.*;
public class A5Q9{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Vector<String> v = new Vector<>();
        v.add("Go");
        v.add("PHP");
        v.add("Dart");
        v.add("Kotlin");
        v.add("Ruby");
        v.add("C#");
        v.add("HTML");
        v.add("CSS");
        Vector<String> v1 = new Vector<>();
        v1.add("python");
        v1.add("javascript");
        v1.add("c++");
        v1.add("java");
        System.out.println("Vector v : "+v);
        System.out.println("Vector v1 before copying : "+v1);
        v1.addAll(v);
        System.out.println("Vector v : "+v);
        System.out.println("Vector v1 after copying : "+v1);
        scan.close();
    }    
}
