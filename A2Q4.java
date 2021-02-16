import java.util.Scanner;
public class A2Q4 {
    int arr[];
    A2Q4(int ar[]){
        arr=ar;
    }
    public static void main(String args[]){
        int array[], size;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        size = scan.nextInt();
        array = new int[size];
        System.out.println("enter the elements : ");
        for(int i=0;i<array.length;i++)
            array[i] = scan.nextInt();
        A2Q4 a = new A2Q4(array);
        a.findDuplicate();
    }
    void findDuplicate(){
        int index=0, top=-1, dupl[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dupl[index]=arr[i];
                    index++; 
                    top++;
                    break;
                }
            }
        }
        System.out.print("displaying the duplictes : ");
        for(int i=0;i<=top;i++)
            System.out.print(dupl[i]+" ");
    }
}
