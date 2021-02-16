import java.util.Scanner;
class Sort{
    int numeric[], size;
    String string[];
    Scanner scan = new Scanner(System.in);
    void inputArray(int c){
        if(c==1){
            System.out.println("Enter the size of integer array : ");
            size = scan.nextInt();
            numeric = new int[size];
            System.out.println("Enter elements :");
            for(int i=0;i<numeric.length;i++)
                numeric[i]=scan.nextInt();
        }
        if(c==2){
            System.out.println("Enter the size of string array : ");
            size = scan.nextInt();
            string = new String[size];
            System.out.println("Enter elements :");
            for(int i=0;i<string.length;i++)
                string[i]=scan.nextLine();
        }
    }
    void sortArray(int c){
        int temp;
        String tempS;
        if(c==1){
            for(int i=0;i<numeric.length;i++){
                for(int j=0;j<numeric.length-1;j++){
                    if(numeric[j]>numeric[j+1]){
                        temp=numeric[j];
                        numeric[j]=numeric[j+1];
                        numeric[j+1]=temp;
                    }
                }
            }
        }
        if(c==2){
            for(int i=0;i<string.length;i++){
                for(int j=0;j<string.length-1;j++){
                    if(string[j].compareToIgnoreCase(string[j+1])>0){
                        tempS=string[j];
                        string[j]=string[j+1];
                        string[j+1]=tempS;
                    }
                }
            }
        }
        display(c);
    }
    void display(int c){
        System.out.println("displaying the sorted array : ");
        if(c==1)
            for(int i=0;i<numeric.length;i++)
                System.out.print(numeric[i]+" ");
        if(c==2)
            for(int i=0;i<string.length;i++)
                System.out.print(string[i]+" ");
    }
}
public class A2Q3 {
    public static void main(String args[]){ 
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer : 1"+'\n'+"String : 2");
        System.out.println("Enter the type of array : ");
        int choice = scan.nextInt();
        Sort s = new Sort();
        s.inputArray(choice);
        s.sortArray(choice);
    }
}
