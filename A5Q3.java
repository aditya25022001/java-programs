import java.util.Arrays;
import java.util.Scanner;
public class A5Q3 {
    public static void main(String args[]){
        int [] array;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = scan.nextInt();
        array=new int[size];
        for(int i=0;i<size;++i){
            System.out.println("Element : ");
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the element to search : ");
        size = scan.nextInt();
        System.out.println("Elemnt found at : "+Arrays.binarySearch(array, size));
        scan.close();
    }    
}
