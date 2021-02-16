import java.util.*;
public class A5Q11{
    public static void main(String args[]){
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
        ArrayList<String> a = new ArrayList<>(v);
        System.out.println(("Array list elements : "+a));
    }
}