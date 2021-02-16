import java.util.Scanner;
public class A2Q11 {
    int sqArr[];
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms to sum ");
        System.out.println("i.e 0 1 4 9 16 25 then no of terms is 5 (since 0 not incluided) : ");
        int number = scan.nextInt();
        A2Q11 a = new A2Q11();
        a.setArr(number);
        a.sumArr();
    }
    void setArr(int n){
        sqArr = new int[n+1];
        sqArr[0]=0;
        for(int i=1;i<sqArr.length;i++)
            sqArr[i]=i*i;
        System.out.print("Your required sum : ");
        for (int i : sqArr) {
            System.out.print(i+" + ");            
        }
    }
    void sumArr(){
        int sum=0;
        for (int i : sqArr){
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
}
