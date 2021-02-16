import java.util.Scanner;
class series{
    private int letterNo;
    Scanner scan = new Scanner(System.in);
    int getNumLetter(){
        System.out.println("enter no of letter to print in series : ");
        letterNo = scan.nextInt();
        if(letterNo<=26)
            return letterNo;
        else{
            return getNumLetter();
        }
    }
    void printSeries(int number){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String print = "(";
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                if(j==i){
                    print=print+alpha.charAt(j)+")";
                }
                else{
                    print=print+alpha.charAt(j)+"+";
                }
            }
            System.out.println(print);
            print="(";
        }
    }
}
public class A2Q10 {
    public static void main(String args[]){
        series s = new series();
        int no = s.getNumLetter();
        s.printSeries(no);
    }   
}
