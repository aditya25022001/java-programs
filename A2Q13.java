import java.util.Scanner;
public class A2Q13{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("entre the elements : ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        A2Q13 a =new A2Q13();
        a.minMax(arr);
    }
    void minMax(int arr[]){
        int min=arr[0], max=arr[0];
        for (int i : arr){
            if(min>i)
                min=i;
        }
        System.out.println("Minimum term in the array is : "+ min);
        for (int i : arr){
            if(max<i)
                max=i;
        }
        System.out.println("Maximum term in the array is : "+ max);
    }
}