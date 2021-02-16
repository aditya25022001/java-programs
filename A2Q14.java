import java.util.Scanner;
public class A2Q14{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("entre the elements : ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        A2Q14 a =new A2Q14();
        a.average(arr);
    }
    void average(int arr[]){
        float sum=0;
        for (int i : arr){
            sum+=i;
        }
        System.out.println("Average of the array elements is : "+(float)sum/arr.length);
    }
}
