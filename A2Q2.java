import java.util.Scanner;
public class A2Q2 {
    static int array[] = new int[]{11,76,90,32,28};
    static int found=0;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int elem = scan.nextInt();
        findElement(elem);
    }   
    static void findElement(int element){
        for(int i=0;i<array.length;i++){
            if(element == array[i]){
                System.out.println("Element found!, might be the first appearance : ");
                System.out.println("Element found at index : "+i);
                found=1;
                break;
            }
        }
        if(found==0)
            System.out.println("Element not found.");
    } 
}
