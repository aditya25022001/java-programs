import java.util.Scanner;
import java.util.*;
public class A5Q10{
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
        v.add("python");
        v.add("javascript");
        v.add("c++");
        v.add("java");
        System.out.println("Vector : "+v);
        System.out.println("Enter the index to empty : ");
        int index = scan.nextInt();
        try {
            System.out.println("Vector before deleting : "+v);
            v.remove(index);   
            System.out.println("Vector after deleting : "+v);
        } 
        catch (Exception e) {
            System.out.println("Proper index needed");
        }
        
        scan.close();
    }    
}