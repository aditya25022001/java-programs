import java.util.Scanner;
import java.util.Vector;
public class A5Q7{
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
        System.out.println("enter the element to search : ");
        int elem = scan.nextInt();
        boolean found = v.contains(elem);
        int x = found==false?-1:3;
        switch (x){
            case -1:
                System.out.println("Vector : "+v);
                System.out.println("Element not present in vector");
                break;
            default:
                System.out.println("Vector : "+v);
                System.out.println("Element present in the vector");
                break;
        }
        scan.close();
    }
}