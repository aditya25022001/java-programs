import java.util.Scanner;
public class A2Q12 {
    float arr[];
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of terms to sum (excluding single 1): ");
        System.out.println("i.e. 1+1/1!+2/2!...then the number of terms = 2");
        int number = scan.nextInt();
        A2Q12 a = new A2Q12();
        a.setArr(number);
    }
    int factorial(int n){
        int fact=1;
        if(n==1)
            return 1;
        else{
            for(int i=n;i>=1;i--){
                fact*=i;
            }
            return fact;
        }
    }
    void setArr(int n){
        arr = new float[n+1];
        arr[0]=1f;
        float sum=0f;
        for(int i=1;i<=n;i++){
            arr[i]=(float) i/factorial(i);
        }
        System.out.print("your required sum : 1 ");
        for(int i=1;i<=n;i++){
            System.out.print("+ "+i+"/"+i+"! ");
        }
        for (float i : arr) {
            sum+=i;
        }
        System.out.print(sum);
    }
}
