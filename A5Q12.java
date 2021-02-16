import java.util.*;
public class A5Q12{
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        v.add(-22);
        v.add(15);
        v.add(9);
        v.add(11);
        v.add(65);
        v.add(37);
        v.add(45);
        v.add(13);
        v.add(4);
        v.add(0);
        v.add(11);
        v.add(12);
        System.out.println("Vector elements before sorting : "+v);
        Collections.sort(v);
        System.out.println("Vector elements after sorting : "+v);
    }
}