import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;
public class A5Q5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        Integer [] array = new Integer[v.size()];
        v.copyInto(array);
        System.out.println("Vector : "+v);
        System.out.println("Array : "+Arrays.toString(array));
        scan.close();
    }    
}
