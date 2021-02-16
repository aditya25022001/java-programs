import java.util.*;
import java.util.Scanner;
public class A5Q13{
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
        System.out.println("Vector elements : "+v);
        System.out.println("Enter the element to change : ");
        String change = scan.nextLine();
        System.out.println("Enter the new value : ");
        String newValue = scan.nextLine();
        if(v.contains(change)){
            System.out.println("Vector elements before replacement : "+v);
            Collections.replaceAll(v, change, newValue);
            System.out.println("Vector elements after replacement : "+v);
        }
        else{
            System.out.println("Enter valid element to change.");
            System.exit(0);
        }
        scan.close();
    }
}